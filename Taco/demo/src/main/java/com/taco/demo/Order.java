package com.taco.demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import javax.persistence.ManyToOne;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.CreditCardNumber;
import lombok.Data;

@Data
public class Order {

    private Long id;
    private Date placedAt;

    private List<Taco> tacos = new ArrayList<>();

    @ManyToOne
    private User user;

    @NotBlank(message="Name is required")
    private String name;

    @NotBlank(message="Street is required")
    private String street;

    @NotBlank(message="City is required")
    private String city;

    @Size(max=2, message="2 letters max")
    @NotBlank(message="State is required")
    private String state;

    @NotBlank(message="Zip code is required")
    @Size(max=10, message="10 numbers max")
    private String zip;

    @CreditCardNumber(message="Not a valid credit card number")
    private String ccNumber;

    @Pattern(regexp="^(0[1-9]|1[0-2])([\\/])([1-9][0-9])$",message="Must be formatted MM/YY")
    private String ccExpiration;
    
    @Digits(integer=3, fraction=0, message="Invalid CVV")
    private String ccCVV;
}
