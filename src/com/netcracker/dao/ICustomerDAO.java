package com.netcracker.dao;

import com.netcracker.model.Customer;

import java.util.List;

public interface ICustomerDAO {

    List<Customer> getAllCustomers();

    Customer getCustomerByID(int id);

    void addCustomer(Customer customer);

    boolean deleteAllCustomers();

    boolean deleteCustomerByID(int id);
}
