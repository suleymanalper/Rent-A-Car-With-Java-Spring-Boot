package kodlama.io.rentACar.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Son kullanıcadan data alıyorsam request
@Data 
@AllArgsConstructor
@NoArgsConstructor
public class UpdateBrandRequest {

	private int id;
	private String name;
}
