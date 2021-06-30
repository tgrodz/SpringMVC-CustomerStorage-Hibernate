package org.tgrodz.customerstorage.service;

import org.tgrodz.customerstorage.model.Customer;

import java.util.List;



public interface CustomerService {

    public List <Customer> getCustomers();

    public void saveCustomer(Customer customer);

    public Customer getCustomer(int id);

    public void deleteCustomer(int id);

}