package poly.store.model;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDto implements Serializable{
	private Long categoryId;  
	@NotEmpty
	private String name;
	
	private Boolean isEdit = false;
}
