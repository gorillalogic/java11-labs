package com.gorillalogic.java.starter.cl3;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@Data
@EqualsAndHashCode(exclude = {"id", "closeDate"})
public class Company {
    private final String name;
    private final LocalDate startDate;
    private String id;
    private LocalDate closeDate;
}

