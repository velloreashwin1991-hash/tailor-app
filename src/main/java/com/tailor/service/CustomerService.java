package com.tailor.service;

import com.tailor.model.Customer;
import java.util.List;

public interface CustomerService {
    Customer save(Customer customer);
    List<Customer> getAll();
}
