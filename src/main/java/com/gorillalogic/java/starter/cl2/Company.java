package com.gorillalogic.java.starter.cl2;

import java.time.LocalDate;
import java.util.Objects;

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

    public Company(String name, LocalDate startDate) {
        this.name = name;
        this.startDate = startDate;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(LocalDate closeDate) {
        this.closeDate = closeDate;
    }
}
