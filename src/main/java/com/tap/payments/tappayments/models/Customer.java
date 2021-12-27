package com.tap.payments.tappayments.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Table(name = "customer")
@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Customer {

    @Id
    @Column(name="id")
    private String id;

    @Column(name = "walled_id")
    private String walletId;

    @Column(name = "balance")
    private BigDecimal balance;


}