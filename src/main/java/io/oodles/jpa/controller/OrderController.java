package io.oodles.jpa.controller;

import io.oodles.jpa.dto.OrderResponse;
import io.oodles.jpa.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
	public Customer placeOrder(@RequestBody Customer request) {
		return customerRepository.save(request);
	}

	@GetMapping("/findAllOrder")
	public List<Customer> findAllOrder(){
		return customerRepository.findAll();
	}

	@GetMapping("/getInfo")
	public List<OrderResponse> findJoin(){
		return customerRepository.getJoinInfo();
	}

	@GetMapping("/products")
	public List<Product> get(){
		return productRepository.findAll();
	}
}
