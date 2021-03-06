package com.ravi.springdatajpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ravi.springdatajpa.entity.Customer;
import com.ravi.springdatajpa.repository.ICustomerRepo;

@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    ICustomerRepo customerRepo;

    @Override
    public Customer add(Customer customer) {
        return customerRepo.save(customer);
    }

    @Override
    public List get() {
        return customerRepo.findAll();
    }

    @Override
    public Optional get(Long id) {
        return customerRepo.findById(id);
    }

    @Override
    public void delete(Long id) {
        if (get(id).isPresent()) {
            customerRepo.delete((Customer) get(id).get());
        }
    }

}