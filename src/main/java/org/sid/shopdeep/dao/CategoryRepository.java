package org.sid.shopdeep.dao;

import org.sid.shopdeep.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
