package com.netcracker.service;

import com.netcracker.model.Customer;

import java.util.List;

public interface ICustomerService {

    List<Customer> getAllCustomers();

    Customer getCustomerByID(int id);

    void addCustomer(Customer customer);

    boolean deleteAllCustomers();

    boolean deleteCustomerByID(int id);

}
