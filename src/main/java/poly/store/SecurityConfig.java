package poly.store;

import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import poly.store.domain.Acount;
import poly.store.service.AcountService;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	AcountService acountService;

	@Autowired
	BCryptPasswordEncoder pe;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		/*
		 * auth.inMemoryAuthentication()
		 * .withUser("bongnqph12321@fpt.edu.vn").password(getPasswordEncoder().encode(
		 * "123")).roles("USER") .and()
		 * .withUser("user2").password(getPasswordEncoder().encode("user2Pass")).roles(
		 * "USER") .and()
		 * .withUser("admin").password(getPasswordEncoder().encode("adminPass")).roles(
		 * "ADMIN");
		 */

		auth.userDetailsService(username -> {
			try {
				Acount user = acountService.findbyId(username);
				String password = pe.encode(user.getPassword());
				System.out.println(username);
				System.out.println(password);
				String[] roles = user.getAuthorities().stream().map(er -> er.getRole().getId())
						.collect(Collectors.toList()).toArray(new String[0]);
				System.out.println("role" + roles.length);
				return User.withUsername(username).password(password).roles(roles).build();
			} catch (NoSuchElementException e) {
				System.out.println("exception" + e.toString());
				throw new UsernameNotFoundException(username + "not found");
			}
		});

	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		http.authorizeRequests()
			.antMatchers("/order/**").authenticated()
			.antMatchers("/admin/**").hasAnyRole("ADMIN")
			.antMatchers("/rest/authorities").hasRole("ADMIN")
			.anyRequest().permitAll();

		http.formLogin()
		.loginPage("/security/login/form")
		.loginProcessingUrl("/security/login")
		.defaultSuccessUrl("/home-page", false)
		.failureUrl("/security/login/error");

		http.rememberMe()
		.tokenValiditySeconds(86400);

		http.exceptionHandling()
		.accessDeniedPage("/security/unauthorited");
		http.logout()
		.logoutUrl("/security/logoff")
		.logoutSuccessUrl("/security/logoff/success");
	}

	@Bean
	public BCryptPasswordEncoder getPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers(HttpMethod.OPTIONS, "/**");
	}
}
