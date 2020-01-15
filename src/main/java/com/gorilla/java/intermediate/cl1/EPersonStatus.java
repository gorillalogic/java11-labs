package com.gorilla.java.intermediate.cl1;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EPersonStatus {
    NEW("NUEVO"), OLD("VIEJO"), UNDEFINED("INDEFINIDO");

    private String translation;
}

