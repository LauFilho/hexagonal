package com.hexa.hexagonal.application.ports.out;

import com.hexa.hexagonal.application.core.domain.Customer;

public interface InsertCustomerOutputPort {

    void insertCustomerInDB(Customer customer);
}
