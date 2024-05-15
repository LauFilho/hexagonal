package com.hexa.hexagonal.application.ports.out;

import com.hexa.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);
}
