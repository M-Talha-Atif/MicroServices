package com.talhaati.accounts.repository;


import com.talhaati.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {


    // derived method call
    // find then column name
    // spring will take care of it and will convert it into query
    Optional<Customer> findByMobileNumber(String mobileNumber);


}
