/**
 * 
 */
package com.store.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

/**
 * @author shaleenkumar
 *
 */
public class Products {
	@Id
	public String id;
	@Indexed
	public String name;
	public String description;
	@Indexed
	public List<String> categories;
	public Images images;
	public String brand;
	public String material;
	public List<String> sizes;
	public List<String> colours;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<String> getCategories() {
		return categories;
	}
	public void setCategories(List<String> categories) {
		this.categories = categories;
	}
	public Images getImages() {
		return images;
	}
	public void setImages(Images images) {
		this.images = images;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public List<String> getSizes() {
		return sizes;
	}
	public void setSizes(List<String> sizes) {
		this.sizes = sizes;
	}
	public List<String> getColours() {
		return colours;
	}
	public void setColours(List<String> colours) {
		this.colours = colours;
	}
	@Override
	public String toString() {
		return "Products [id=" + id + ", name=" + name + ", description=" + description + ", categories=" + categories
				+ ", images=" + images + ", brand=" + brand + ", material=" + material + ", sizes=" + sizes
				+ ", colours=" + colours + "]";
	}
	
	
	
}
