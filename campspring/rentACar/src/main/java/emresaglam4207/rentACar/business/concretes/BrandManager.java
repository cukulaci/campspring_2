package emresaglam4207.rentACar.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import emresaglam4207.rentACar.business.abstracts.BrandService;
import emresaglam4207.rentACar.business.requests.CreateBrandRequest;
import emresaglam4207.rentACar.business.responses.GetAllBrandsResponse;
import emresaglam4207.rentACar.dataAccess.abstracts.BrandRepository;
import emresaglam4207.rentACar.entities.concretes.Brand;

@Service // Bu sınıf bir business nesnesidir.
public class BrandManager implements BrandService {

	private BrandRepository brandRepository;

	@Autowired
	public BrandManager(BrandRepository brandRepository) { // generate using consc ile yaptık. gevşek bağlı ilerde
															// Hibernate tipinde olabilir
		this.brandRepository = brandRepository;
	}

	@Override
	public List<GetAllBrandsResponse> getAll() {
		
		List<Brand> brands = brandRepository.findAll();
		List<GetAllBrandsResponse> brandsResponse = new ArrayList<GetAllBrandsResponse>();
		
		
		for (Brand brand : brands) {
			GetAllBrandsResponse responseItem = new GetAllBrandsResponse();
			responseItem.setId(brand.getId());
			responseItem.setName(brand.getName());
			
			brandsResponse.add(responseItem);
		}
		

		// iş kuralları
		return brandsResponse; // findAll u lombok bize sağladı. daha bir sürü özellik var. üzerine gelince
											// ne verdiğini söylüyor.
	}

	@Override
	public void add(CreateBrandRequest createBrandRequest) {
		
		Brand brand = new Brand();
		brand.setName(createBrandRequest.getName());
		
		this.brandRepository.save(brand);
		
	}

}
