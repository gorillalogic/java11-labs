package com.gorillalogic.java.starter.cl3;

import lombok.*;

import java.time.LocalDate;

@Data
@Builder @RequiredArgsConstructor
@EqualsAndHashCode(exclude = {"id", "closeDate"})
public class Company {
    private String id;
    private final String name;
    private final LocalDate startDate;
    private LocalDate closeDate;

    public static class CompanyBuilder {
        private String id;
        private String name;
        private LocalDate startDate;
        private LocalDate closeDate;

        public CompanyBuilder id(String id) {
            this.id = id;
            return this;
        }

        public CompanyBuilder name(String name) {
            this.name = name;
            return this;
        }

        public CompanyBuilder startDate(LocalDate startDate) {
            this.startDate = startDate;
            return this;
        }

        public CompanyBuilder closeDate(LocalDate closeDate) {
            this.closeDate = closeDate;
            return this;
        }

        public Company build(){
            return new Company(id, name, startDate, closeDate);
        }
    }

    public static CompanyBuilder builder(){
        return new CompanyBuilder();
    }
}

