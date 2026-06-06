package com.tailor.service;

import com.tailor.model.Customer;
import com.tailor.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository repo;

    public CustomerServiceImpl(CustomerRepository repo) {
        this.repo = repo;
    }

    @Override
    public Customer save(Customer customer) {
        return repo.save(customer);
    }

    @Override
    public List<Customer> getAll() {
        return repo.findAll();
    }
}
