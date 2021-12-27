package com.tap.payments.tappayments.controller;

import com.tap.payments.tappayments.models.Transaction;
import com.tap.payments.tappayments.models.TransactionDTO;
import com.tap.payments.tappayments.service.TransactionService;
import com.tap.payments.tappayments.service.TransactionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
@RequestMapping("/")
public class TopupController {
    @Autowired
    private TransactionService transactionService;


    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Transaction createTransaction(@RequestBody TransactionDTO transactionDTO) {
        return transactionService.createTransaction(transactionDTO.getAmount(),"SUCCESS", transactionDTO.getCurrency(),transactionDTO.getChargeId()
        ,transactionDTO.getCustomerId(), transactionDTO.getWalletId(),transactionDTO.getFeeAmount(),transactionDTO.getFeeCurrency());

    }
}
