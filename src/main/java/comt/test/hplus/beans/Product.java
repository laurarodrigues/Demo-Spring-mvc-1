package comt.test.hplus.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
	
	@Id
	private int id;
	
	private String name;
	private String image_path;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImagePath() {
		return image_path;
	}
	public void setImagePath(String imagePath) {
		this.image_path = imagePath;
	}
	
	
	

}
