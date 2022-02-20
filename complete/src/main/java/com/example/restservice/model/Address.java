package com.example.restservice.model;


import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    private int number;
    private String streetName;
    private City city;

}

class Y{
    public void X(){


        Address address = Address.builder().streetName("A").city
                (new City("v", "ddd")).number(12).build();

        //newbee
        Address address1 = new Address(1, "A", new City("2", "ddd"));
    }
}
