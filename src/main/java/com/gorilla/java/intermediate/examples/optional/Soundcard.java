package com.gorilla.java.intermediate.examples.optional;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Optional;

@Getter @Setter @AllArgsConstructor
public class Soundcard {
    private Optional<USB> usb;
}

