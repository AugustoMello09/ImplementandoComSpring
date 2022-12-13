package com.AugustoMello09.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AugustoMello09.demo.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

}
