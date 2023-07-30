package emresaglam4207.rentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import emresaglam4207.rentACar.entities.concretes.Brand;

public interface BrandRepository extends JpaRepository<Brand, Integer> { // concreate kısmını sildik Inmemory kısmını
																			// sildik yani generate bir yapıda çalışıyor
																			// JpaRepository için bellekte onu sanki
																			// implemente etmiş gibi bizim için bellekte
																			// hazırlıyor.

}
