package com.workintech.ecommerce.util;

import com.workintech.ecommerce.dto.CategoryResponseDto;
import com.workintech.ecommerce.entity.Category;

import java.util.ArrayList;
import java.util.List;

public class ConvertCategoryAndProduct {
    public static List<CategoryResponseDto> converCategoryList(List<Category> categories) {
        List<CategoryResponseDto> resultCategories=new ArrayList<>();
        categories.forEach(category -> resultCategories.add(new CategoryResponseDto(category.getId(),category.getName(),category.getDescription(),category.getProducts())));
        return resultCategories;
    }

    public static CategoryResponseDto converCategoryResponseDto(Category category) {
         return new CategoryResponseDto(category.getId(), category.getName(), category.getDescription(), category.getProducts());
    }
}
