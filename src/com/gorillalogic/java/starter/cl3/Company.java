package com.gorillalogic.java.starter.cl3;

import lombok.*;

import java.time.LocalDate;
import java.util.Objects;

@Setter @Getter @RequiredArgsConstructor
public class Company {
    private String id;
    private final String name;
    private final LocalDate startDate;
    private LocalDate closeDate;

    @Override
    public String toString() {
        return "Company{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", startDate=" + startDate +
                ", closeDate=" + closeDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(name, company.name) &&
                Objects.equals(startDate, company.startDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, startDate);
    }

}
