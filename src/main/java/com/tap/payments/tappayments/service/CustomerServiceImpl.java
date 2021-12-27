package com.tap.payments.tappayments.service;

import com.tap.payments.tappayments.models.Customer;
import com.tap.payments.tappayments.repositry.CustomerRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    CustomerRepositry customerRepositry;


    @Override
    public Customer updateCustomerBalance(Customer customer, BigDecimal amount) {
        customer.setBalance(customer.getBalance().add(amount));
        return customerRepositry.save(customer);
    }

    @Override
    public Customer findCustomerByIdAndWalletId(String customerId, String walledId) {
        return customerRepositry.findByIdAndWalletId(customerId, walledId);
    }
}
