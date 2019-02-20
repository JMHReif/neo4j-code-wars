package com.jmhreif.neo4jcodewars;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    private final CustomerRepo customerRepo;

    public CustomerController(CustomerRepo customerRepo) { this.customerRepo = customerRepo; }

    @GetMapping
    public Iterable<Customer> getAllCustomers() { return customerRepo.findAll(); }
}
