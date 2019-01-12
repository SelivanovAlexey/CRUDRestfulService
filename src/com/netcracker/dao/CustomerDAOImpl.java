package com.netcracker.dao;


import com.netcracker.model.Customer;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository("customerDAO")
@Transactional
public class CustomerDAOImpl extends BasicDAO implements ICustomerDAO {


    public List<Customer> getAllCustomers() {
        Query query = getSession().createQuery("FROM Customer");
        return query.list();
    }

    public Customer getCustomerByID(int id) {
        Query query = getSession().createQuery("FROM Customer WHERE id = :id");
        query.setInteger("id",id);
        return (Customer) query.uniqueResult();
    }

    public void addCustomer(Customer customer) {
        persist(customer);

    }

    public boolean deleteAllCustomers() {
        Query query = getSession().createQuery("DELETE FROM Customer");
        boolean res = (query.executeUpdate() == 1) ? true : false;
        return res;
    }

    public boolean deleteCustomerByID(int id) {
        Query query = getSession().createQuery("DELETE FROM Customer WHERE id = :id");
        query.setInteger("id",id);
        boolean res = (query.executeUpdate() == 1) ? true : false;
        return res;
    }
}
