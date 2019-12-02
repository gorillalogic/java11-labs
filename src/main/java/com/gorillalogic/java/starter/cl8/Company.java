package com.gorillalogic.java.starter.cl8;

import lombok.*;

import java.time.LocalDate;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(exclude = {"id", "closeDate"})
@Builder(toBuilder = true)
public class Company {
    private String id;
    @NonNull private final String name;
    @NonNull private final LocalDate startDate;
    private LocalDate closeDate;
}

