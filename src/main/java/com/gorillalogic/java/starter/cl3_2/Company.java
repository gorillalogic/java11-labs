package com.gorillalogic.java.starter.cl3_2;

import lombok.*;

import java.time.LocalDate;

@Data
@RequiredArgsConstructor
@EqualsAndHashCode(exclude = {"id", "closeDate"})
public class Company {
    private String id;
    private final String name;
    private final LocalDate startDate;
    private LocalDate closeDate;
}

