package com.tap.payments.tappayments.service;

import com.tap.payments.tappayments.models.Customer;

import java.math.BigDecimal;

public interface CustomerService {
    public Customer updateCustomerBalance(Customer customer, BigDecimal amount);
    public Customer findCustomerByIdAndWalletId(String customerId, String walledId);
}
