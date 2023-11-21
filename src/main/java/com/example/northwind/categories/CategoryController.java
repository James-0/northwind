package com.example.northwind.categories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/categories")
public class CategoryController {

    private final CategoryService categoryService;
    
    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }       



//***********************This is where the mapping starts***************************
    @GetMapping
    public ResponseEntity<List<Category>> getCategories() {
        return categoryService.getAllCategories();
    }


    @GetMapping("/{category_id}")
    public ResponseEntity<Category> getCategory(@PathVariable Integer category_id) {
        return categoryService.getCategory(category_id);
    }


    @PostMapping
    public ResponseEntity<ResponseEntity<Category>> createCategory(@RequestBody Category category) {
        return ResponseEntity.ok(categoryService.createCategory(category));
    }

    @GetMapping("/hello")
	public String helloString() {
		return "Hello World!";
	}

}
