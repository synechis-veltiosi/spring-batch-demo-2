package com.synechisveltiosi.springbatchdemo.service;

import com.synechisveltiosi.springbatchdemo.model.Customer;
import org.springframework.batch.item.ItemProcessor;


public class CustomerProcessor implements ItemProcessor<Customer, Customer> {
    @Override
    public Customer process(Customer item) throws Exception {
        return item;
    }
}
