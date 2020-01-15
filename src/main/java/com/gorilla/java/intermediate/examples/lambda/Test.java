package com.gorilla.java.intermediate.examples.lambda;

import java.util.function.Supplier;

public class Test {
    public static void main(String[] args) {
        //Anonymous class
        /*Predicate<String> isALongWord = s -> s != null && s.length() > 10;
        System.out.println(isALongWord.test("Gorilla Logic"));

        Consumer<Product> calculateTax = p -> p.setTax(p.getPrice() * 0.2F);
        Product product = new Product(100F);
        calculateTax.accept(product);
        System.out.println(product.getTax());

        Function<Product, Float> getFullPrice = p -> p.getPrice()+p.getTax();
        System.out.println(getFullPrice.apply(product));*/

        Product product = new Product(100F, 20F);
        Supplier<Float> getFullPrice = () -> product.getTax() + product.getPrice();
        System.out.println(getFullPrice.get());

    }
}
