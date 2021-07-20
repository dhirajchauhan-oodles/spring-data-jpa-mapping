package io.oodles.jpa.controller;

import io.oodles.jpa.dto.OrderResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.oodles.jpa.dto.OrderRequest;
import io.oodles.jpa.entity.Customer;
import io.oodles.jpa.repository.CustomerRepository;
import io.oodles.jpa.repository.ProductRepository;

import java.util.List;

@RestController
public class OrderController {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private ProductRepository productRepository;

	@PostMapping("/placeOrder")
	public Customer placeOrder(@RequestBody OrderRequest request) {
		return customerRepository.save(request.getCustomer());
	}

	@GetMapping("/findAllOrder")
	public List<Customer> findAllOrder(){
		return customerRepository.findAll();
	}

	@GetMapping("/getInfo")
	public List<OrderResponse> findJoin(){
		return customerRepository.getJoinInfo();
	}
}
