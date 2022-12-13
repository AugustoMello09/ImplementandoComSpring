package com.AugustoMello09.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AugustoMello09.demo.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
