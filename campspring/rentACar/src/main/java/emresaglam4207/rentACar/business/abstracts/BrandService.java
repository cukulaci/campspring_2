package emresaglam4207.rentACar.business.abstracts;

import java.util.List;

import emresaglam4207.rentACar.business.requests.CreateBrandRequest;
import emresaglam4207.rentACar.business.responses.GetAllBrandsResponse;

public interface BrandService {

	List<GetAllBrandsResponse> getAll();
	void add(CreateBrandRequest createBrandRequest);

}
