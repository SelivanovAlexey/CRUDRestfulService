package com.netcracker.service;

import com.netcracker.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerServiceController {

    @Autowired
    ICustomerService customerService;

    @GetMapping(value = "/buyer",produces ="application/json" )
    public ResponseEntity<List<Customer>> getAllCustomers(){

        List<Customer> customers = customerService.getAllCustomers();

        if (customers.isEmpty())
            return new ResponseEntity<List<Customer>>(HttpStatus.NO_CONTENT);

        return new ResponseEntity<List<Customer>>(customers, HttpStatus.OK);
    }


    @GetMapping(value = "/buyer/{id}",produces ="application/json" )
    public ResponseEntity<Customer> getCustomerByID(@PathVariable("id") int id){

        Customer customer = customerService.getCustomerByID(id);

        if (customer.equals(null))
            return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);

        return new ResponseEntity<Customer>(customer, HttpStatus.OK);
    }

    @PostMapping(value = "/buyer",consumes = "application/json")
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer){
        customerService.addCustomer(customer);
        return new ResponseEntity<Customer>(customer, HttpStatus.CREATED);
    }

    @DeleteMapping(value="/buyer")
    public ResponseEntity<Customer> deleteAllCustomers(){
        boolean result = customerService.deleteAllCustomers();

        if (!result)
            return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
        else
            return new ResponseEntity<Customer>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping(value="/buyer/{id}")
    public ResponseEntity<Customer> deleteCustomerByID(@PathVariable("id") int id){
        boolean result = customerService.deleteCustomerByID(id);

        if (!result)
            return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
        else
            return new ResponseEntity<Customer>(HttpStatus.NO_CONTENT);
    }





}
