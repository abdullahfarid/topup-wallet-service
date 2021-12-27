package com.tap.payments.tappayments.repositry;

import com.tap.payments.tappayments.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepositry extends JpaRepository<Customer, String> {
    Customer findByIdAndWalletId(String customerId, String walletId);
    List<Customer> getCustomerById(String customerId);


}
