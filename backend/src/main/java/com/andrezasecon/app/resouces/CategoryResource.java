package com.andrezasecon.app.resouces;

import com.andrezasecon.app.dto.CategoryDTO;
import com.andrezasecon.app.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<CategoryDTO>> findAllCategories() {
        List<CategoryDTO> list = categoryService.findAll();
        return ResponseEntity.ok().body(list);

    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<CategoryDTO> findCategoryById(@PathVariable Long id) {
        CategoryDTO dto = categoryService.findCategoryById(id);
        return ResponseEntity.ok().body(dto);

    }



}
