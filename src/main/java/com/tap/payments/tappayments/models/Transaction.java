package com.tap.payments.tappayments.models;

import lombok.*;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "transaction")
@Getter @Setter @NoArgsConstructor
public class Transaction {


    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @NonNull
    @Column(name = "created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;

    @NonNull
    @Column(name = "status")
    private String status;

    @NonNull
    @Column(name = "amount")
    private BigDecimal amount;

    @NonNull
    @Column(name = "currency")
    private String currency;

    @NonNull
    @Column(name = "charge_id")
    private String chargeId;

    @NonNull
    @ManyToOne
    @JoinColumn(name = "customer_ID")
    private Customer customer;

    @OneToOne
    @JoinColumn(name = "fee_Id")
    private Fee fee;

    public Transaction(@NonNull Date created, @NonNull String status, @NonNull BigDecimal amount, @NonNull String currency, @NonNull String chargeId, @NonNull Customer customer, Fee fee) {
        this.created = created;
        this.status = status;
        this.amount = amount;
        this.currency = currency;
        this.chargeId = chargeId;
        this.customer = customer;
        this.fee = fee;
    }
}
