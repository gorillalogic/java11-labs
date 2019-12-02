package com.gorillalogic.java.starter.cl8;

public class CompanyValidator {
    public static void validate(Company company) throws InvalidArgumentException {
        if(company==null)
            throw new InvalidArgumentException("company");

        if(company.getId()==null)
            throw new InvalidArgumentException("company.id");

        if(company.getName()==null)
            throw new InvalidArgumentException("company.name");
    }
}
