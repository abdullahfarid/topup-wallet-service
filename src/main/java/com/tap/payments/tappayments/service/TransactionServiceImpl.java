package com.tap.payments.tappayments.service;

import com.tap.payments.tappayments.models.Customer;
import com.tap.payments.tappayments.models.Fee;
import com.tap.payments.tappayments.models.Transaction;
import com.tap.payments.tappayments.repositry.CustomerRepositry;
import com.tap.payments.tappayments.repositry.FeeRepository;
import com.tap.payments.tappayments.repositry.TransactionRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Date;

@Service
public class TransactionServiceImpl implements TransactionService{
    @Autowired
    TransactionRepositry transactionRepositry;

    @Autowired
    FeeRepository feeRepository;

    @Autowired
    CustomerService customerService;

    @Override
    @Transactional
    public Transaction createTransaction(BigDecimal amount, String status, String currency, String chargeId, String customerId, String walletId, BigDecimal feeAmount, String feeCurrency) {
        Customer customer = customerService.findCustomerByIdAndWalletId(customerId,walletId);
        Fee fee = new Fee();
        fee.setAmount(feeAmount);
        fee.setCurrency(feeCurrency);

        fee =feeRepository.save(fee);

        customer = customerService.updateCustomerBalance(customer, amount.subtract(feeAmount));
        Transaction transaction = new Transaction(new Date(),status,amount,currency,chargeId,customer,fee);

        return  transactionRepositry.save(transaction);

    }
}
