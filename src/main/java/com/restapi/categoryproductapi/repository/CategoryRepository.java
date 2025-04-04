package com.restapi.categoryproductapi.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import com.restapi.categoryproductapi.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
	Page<Category> findAll(Pageable pageable);
}
