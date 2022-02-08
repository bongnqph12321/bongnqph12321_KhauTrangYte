package poly.store.domain;

import java.io.Serializable;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@SuppressWarnings("serial")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Acounts")
public class Acount implements Serializable{	
	@Id
	@Column(name="username",length = 50)
	private String username;
	@Column(name="password",length = 50)
	private String password;
	@Column(name="fullname",length = 50)
	private String fullname;	
	@Column(name="age")
	private Integer age;
	@Column(name="gender")
	private boolean gender;   
	
	@JsonIgnore
	@OneToMany(mappedBy = "acount")
	List<Order> orders;
	@JsonIgnore   
	@OneToMany(mappedBy = "acount",fetch = FetchType.EAGER)
	List<Authority> authorities;
}
