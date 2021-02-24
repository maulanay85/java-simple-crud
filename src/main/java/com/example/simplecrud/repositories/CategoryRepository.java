package com.example.simplecrud.repositories;

import com.example.simplecrud.models.Category;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer>, JpaSpecificationExecutor<Category> {
}
