package com.springboot.product.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SallerRepository extends JpaRepository<Seller, Long> {
	// Seller findByEmail(String email);

}
