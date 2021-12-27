package com.tap.payments.tappayments.repositry;

import com.tap.payments.tappayments.models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TransactionRepositry extends JpaRepository<Transaction, UUID> {
    Transaction getTransactionById(UUID id);

}
