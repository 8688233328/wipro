package com.wipro.medicine.repository;

import com.wipro.medicine.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
    // You can add custom query methods here if needed
}
