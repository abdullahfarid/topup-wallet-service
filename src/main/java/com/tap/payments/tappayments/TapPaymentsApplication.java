package com.tap.payments.tappayments;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages = {"com.tap.payments.tappayments"})
@EnableJpaRepositories(basePackages = {"com.tap.payments.tappayments.repositry"})

public class TapPaymentsApplication {

    public static void main(String[] args) {
        SpringApplication.run(TapPaymentsApplication.class, args);
    }

}
