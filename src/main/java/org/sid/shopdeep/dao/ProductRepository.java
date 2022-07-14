package org.sid.shopdeep.dao;

import org.sid.shopdeep.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
