package kodlama.io.rentACar.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Son kullanıcadan data gönderiyorsam yani ben ona yanıt veriyorsam Response

@Data 
@AllArgsConstructor
@NoArgsConstructor
public class GetAllBrandsResponse {
	
	private int id;
	private String name;

}
