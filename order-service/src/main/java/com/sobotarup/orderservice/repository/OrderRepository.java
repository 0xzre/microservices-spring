package com.sobotarup.orderservice.repository;

import com.sobotarup.orderservice.model.Order;
import com.sobotarup.orderservice.service.OrderService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
