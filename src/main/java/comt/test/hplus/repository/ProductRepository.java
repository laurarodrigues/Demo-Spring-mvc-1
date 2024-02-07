package comt.test.hplus.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import comt.test.hplus.beans.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
	
	@Query("select p from Product as p where p.name like %:search%")
	public List<Product> searchByName(@Param("search") String name); 

}
