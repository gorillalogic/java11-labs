package com.gorillalogic.java.starter.cl7;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@EqualsAndHashCode
public class Person {
    private Integer documentNumber;
    @EqualsAndHashCode.Exclude
    private String name;
}
