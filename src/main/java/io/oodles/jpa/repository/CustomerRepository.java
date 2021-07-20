package io.oodles.jpa.repository;

import io.oodles.jpa.dto.OrderResponse;
import org.springframework.data.jpa.repository.JpaRepository;

import io.oodles.jpa.entity.Customer;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

    @Query("SELECT new io.oodles.jpa.dto.OrderResponse(c.name, p.productName) FROM Customer c JOIN c.products p")
    public List<OrderResponse> getJoinInfo();
}
