package com.gorilla.java.intermediate.examples.lambda;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Product {
    private final Float price;
    private Float tax;
}

