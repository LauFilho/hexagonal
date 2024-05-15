package com.hexa.hexagonal.adpters.out.client.response;

import lombok.Data;

// Como o adapter não faz parte do Core, não tem problema usar Annotations

@Data
public class AddressResponse {

    private String street;
    private String number;
    private String district;
    private String country;

}