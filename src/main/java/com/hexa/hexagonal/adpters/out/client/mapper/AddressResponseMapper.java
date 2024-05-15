package com.hexa.hexagonal.adpters.out.client.mapper;

import com.hexa.hexagonal.adpters.out.client.response.AddressResponse;
import com.hexa.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);

}
