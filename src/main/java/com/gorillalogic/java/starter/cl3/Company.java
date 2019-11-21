package com.gorillalogic.java.starter.cl3;

import lombok.*;

import java.time.LocalDate;

@Data
@EqualsAndHashCode(exclude = {"id", "closeDate"})
public class Company {
    private String id;
    private final String name;
    private final LocalDate startDate;
    private LocalDate closeDate;
}

