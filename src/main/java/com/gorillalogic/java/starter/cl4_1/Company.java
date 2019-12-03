package com.gorillalogic.java.starter.cl4_1;

import lombok.*;

import java.time.LocalDate;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(exclude = {"id", "closeDate"})
@Builder(toBuilder = true)
public class Company {
    @NonNull
    private final String name;
    @NonNull
    private final LocalDate startDate;
    private String id;
    private LocalDate closeDate;
}

