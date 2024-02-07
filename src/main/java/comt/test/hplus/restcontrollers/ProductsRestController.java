package comt.test.hplus.restcontrollers;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import comt.test.hplus.beans.Product;
import comt.test.hplus.repository.ProductRepository;

//@Controller
@RestController
public class ProductsRestController {
	
	@Autowired
	private ProductRepository productRepository;
	
	/*@GetMapping("/hplus/rest/products")
	@ResponseBody
	public List<Product> getProducts(){
		List<Product> products = new ArrayList<>();
		productRepository.findAll().forEach(product ->{
			products.add(product);
		});
	
	  return products;
	}*/
	
	@GetMapping("/hplus/rest/products")
	public ResponseEntity getProductByRequestParam(@RequestParam("name") String name) {
		List<Product> products = productRepository.searchByName(name);
		return new ResponseEntity<>(products, HttpStatus.OK);
	}
	
	@GetMapping("/hplus/rest/products/{name}")
	public ResponseEntity getProductByPathVariable(@PathVariable("name") String name) {
		List<Product> products = productRepository.searchByName(name);
		return new ResponseEntity<>(products, HttpStatus.OK);
	}
	
	

}
