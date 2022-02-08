package poly.store.model;

import java.io.Serializable;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AcountDto implements Serializable{
	@NotEmpty(message = "Vui lòng không để trống username !")
	private String username;
	@NotEmpty(message = "Vui lòng không để trống password !")
	private String password;
	@NotEmpty(message = "Vui lòng không để trống fullname !")
	private String fullname;
	@Min(value = 16,message = "Tuổi phải lớn hơn hoặc bằng 16 !")
	private int age;
	private boolean gender;
	private Boolean isEdit = false;
}
