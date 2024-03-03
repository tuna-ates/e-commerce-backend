package com.workintech.ecommerce.dto;

import com.workintech.ecommerce.entity.Category;

public record ProductResponseDto(Long id, String name, Integer quantity,
                                 Double price, Long categoryİd) {
}
