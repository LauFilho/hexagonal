package com.hexa.hexagonal.application.core.usecase;

import com.hexa.hexagonal.application.core.domain.Customer;
import com.hexa.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import com.hexa.hexagonal.application.ports.out.InsertCustomerOutputPort;

public class InsertCustomerUseCase {

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutPutPort;
    private final InsertCustomerOutputPort insertCustomerOutputPort;

    public InsertCustomerUseCase(FindAddressByZipCodeOutputPort findAddressByZipCodeOutPutPort, InsertCustomerOutputPort insertCustomerOutputPort) {
        this.findAddressByZipCodeOutPutPort = findAddressByZipCodeOutPutPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
    }


    public void insert(Customer customer, String zipCode) {

        var address = findAddressByZipCodeOutPutPort.find(zipCode);
        customer.setAddress(address);
        insertCustomerOutputPort.insertCustomerInDB(customer);
    }
}
