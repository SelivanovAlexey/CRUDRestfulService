package com.netcracker.service;

import com.netcracker.dao.ICustomerDAO;
import com.netcracker.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    ICustomerDAO customerDAO;

    public List<Customer> getAllCustomers() {
        return customerDAO.getAllCustomers();
    }

    public Customer getCustomerByID(int id) {
        return customerDAO.getCustomerByID(id);
    }

    public void addCustomer(Customer customer) {
        customerDAO.addCustomer(customer);
    }

    public boolean deleteAllCustomers() {
        return customerDAO.deleteAllCustomers();
    }

    public boolean deleteCustomerByID(int id) {
        return customerDAO.deleteCustomerByID(id);
    }
}
