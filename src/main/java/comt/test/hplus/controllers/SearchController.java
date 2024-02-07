package comt.test.hplus.controllers;

import java.util.List;
import java.util.concurrent.Callable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.AsyncTaskExecutor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.async.DeferredResult;

import comt.test.hplus.beans.Product;
import comt.test.hplus.repository.ProductRepository;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class SearchController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private AsyncTaskExecutor executor;
	
	
	public SearchController(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}


	@GetMapping("/search")
	public DeferredResult<String> goToSearch(@RequestParam("search") String search, Model model, HttpServletRequest request) {
		
		DeferredResult<String> deferredResult = new DeferredResult<>();
	    /*return()->{
	    	Thread.sleep(3000);
	    	List<Product> products = productRepository.searchByName(search);
			model.addAttribute("products", products);
			return "search";
	    };*/
		executor.execute( ()->{
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	List<Product> products = productRepository.searchByName(search);
			model.addAttribute("products", products);
			deferredResult.setResult("search");
		});
		
		return deferredResult;
	}
	
	
}
