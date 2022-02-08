package poly.store.model;


import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
	private Integer ProductId;
	@NotEmpty(message = "Không được để trống tên sản phẩm!")
	private String name;
	@NotNull(message = "Không được để trống số lượng!")
	@PositiveOrZero(message = "số lượng không thể âm !")
	private int quantity;
	@NotNull(message = "Không được để trống giá!")
	@PositiveOrZero(message = "giá không thể âm !")
	private double price;
	@NotEmpty(message = "Không được để trống ảnh!")
	private String image;
	@NotEmpty(message = "Không được để trống tiêu đề!")
	private String title;
	private Date enteredDate;
	private Long categoryId;
	
	private Boolean isEdit = false;
}
