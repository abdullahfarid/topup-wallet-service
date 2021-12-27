package com.tap.payments.tappayments.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class TransactionDTO implements Serializable {
    private BigDecimal amount;
    private String currency;
    private String chargeId;
    private String customerId;
    private String walletId;
    private BigDecimal feeAmount;
    private String feeCurrency;
}
