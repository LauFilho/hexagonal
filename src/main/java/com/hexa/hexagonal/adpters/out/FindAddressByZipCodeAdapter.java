package com.hexa.hexagonal.adpters.out;

import com.hexa.hexagonal.adpters.out.client.FindAddresByZipCodeClient;
import com.hexa.hexagonal.adpters.out.client.mapper.AddressResponseMapper;
import com.hexa.hexagonal.adpters.out.client.response.AddressResponse;
import com.hexa.hexagonal.application.core.domain.Address;
import com.hexa.hexagonal.application.core.domain.Customer;
import com.hexa.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeAdapter implements FindAddressByZipCodeOutputPort {

    @Autowired
    private FindAddresByZipCodeClient findAddresByZipCodeClient;
    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        AddressResponse addressResponse = findAddresByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }
}
