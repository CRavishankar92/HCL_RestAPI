package com.ravi.springdatajpa.service;

import java.util.List;
import java.util.Optional;

import com.ravi.springdatajpa.entity.Customer;

public interface ICustomerService {

    Customer add(Customer customer);

    List get();

    Optional get(Long id);

    void delete(Long id);
}