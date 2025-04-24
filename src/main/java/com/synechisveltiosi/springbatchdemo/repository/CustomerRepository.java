package com.synechisveltiosi.springbatchdemo.repository;

import com.synechisveltiosi.springbatchdemo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}