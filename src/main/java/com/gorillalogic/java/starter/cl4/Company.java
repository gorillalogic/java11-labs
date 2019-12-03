package com.gorillalogic.java.starter.cl4;

import lombok.*;

import java.time.LocalDate;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(exclude = {"id", "closeDate"})
public class Company {
    @NonNull
    private final String name;
    @NonNull
    private final LocalDate startDate;
    private String id;
    private LocalDate closeDate;

    public static CompanyBuilder builder() {
        return new CompanyBuilder();
    }

    public CompanyBuilder toBuilder() {
        CompanyBuilder builder = new CompanyBuilder();
        return builder
                .id(this.id)
                .name(this.name)
                .startDate(this.startDate)
                .closeDate(this.closeDate);
    }

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

        public Company build() {
            return new Company(id, name, startDate, closeDate);
        }
    }
}

