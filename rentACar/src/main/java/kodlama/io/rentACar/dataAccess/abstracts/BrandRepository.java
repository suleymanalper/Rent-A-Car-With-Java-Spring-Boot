package kodlama.io.rentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository; //Spring Jpa kullanarak ver işlemlerimizi çok güzel bir şekilde kullanabiliyoruz


import kodlama.io.rentACar.entities.concretes.Brand;
  
public interface BrandRepository extends JpaRepository<Brand,Integer>{
	
	boolean existsByName(String name); //spring jpa keywords


}
