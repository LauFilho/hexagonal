package com.hexa.hexagonal.adpters.out.client;

import com.hexa.hexagonal.adpters.out.client.response.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "FindAddresByZipCodeClient",
        url = "${hexagonal.client.address.url}"

)
public interface FindAddresByZipCodeClient {

    @GetMapping("/{zipCode}")
    AddressResponse find(@PathVariable("zipCode") String zipCode);

}
