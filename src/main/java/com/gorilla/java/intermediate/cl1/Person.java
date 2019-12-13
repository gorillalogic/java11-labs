package com.gorilla.java.intermediate.cl1;

import lombok.Data;
import lombok.Getter;

import java.util.Date;

@Data
public class Person {
    private String id;
    private String name;
    private Date birthday;
    private String phone;

    @Getter
    public class PersonStatus{
        private final String value;

        public PersonStatus(){
            if(id==null){
                value="NEW";
            }else{
                value="OLD";
            }
        }
    }
}
