package kodlama.io.rentACar.business.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Son kullanıcadan data alıyorsam request
@Data 
@AllArgsConstructor
@NoArgsConstructor
public class CreateBrandRequest {
	
	@NotNull
	@NotBlank
	@Size(min=3,max = 20)
	private String name; //son kullancı lazım olan tek şey name  id'yi bilemez bu sebepten sadece name yeterli	
}
