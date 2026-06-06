package com.tailor.service;

import com.tailor.model.Customer;
import com.tailor.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository repo;

    public CustomerService(CustomerRepository repo) {
        this.repo = repo;
    }

    public Customer add(Customer c) {
        return repo.save(c);
    }

    public List<Customer> getAll() {
        return repo.findAll();
    }
}
