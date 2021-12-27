package com.tap.payments.tappayments.repositry;

import com.tap.payments.tappayments.models.Fee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeeRepository extends JpaRepository<Fee,Long> {

}
