package com.wipro.medicine.service;

import java.util.List;

import com.wipro.medicine.entity.Category;

public interface CategoryService {

	Category saveCategory(Category category);
	
	Category getCategoryById(int categoryId);

	List<Category> getAllCategory();
}
