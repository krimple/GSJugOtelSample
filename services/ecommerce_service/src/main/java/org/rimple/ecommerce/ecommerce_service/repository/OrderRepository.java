package org.rimple.ecommerce.ecommerce_service.repository;

import org.rimple.ecommerce.ecommerce_service.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByUserId(String userId);
} 