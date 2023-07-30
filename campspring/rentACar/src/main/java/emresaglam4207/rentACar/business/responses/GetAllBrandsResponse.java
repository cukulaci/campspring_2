package emresaglam4207.rentACar.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllBrandsResponse { //api yi kullanan kişiye ne vermek istiyoruz onu yazıyoruz.
	
	private int id;
	private String name;

}
