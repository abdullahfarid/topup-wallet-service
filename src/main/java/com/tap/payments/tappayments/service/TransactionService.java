package com.tap.payments.tappayments.service;

import com.tap.payments.tappayments.models.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;


public interface TransactionService {
    public Transaction createTransaction(BigDecimal amount,String status, String currency, String chargeId, String customerId, String walletId, BigDecimal feeAmount, String feeCurrency);
}
