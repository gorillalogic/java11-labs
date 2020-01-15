package com.gorilla.java.intermediate.examples.optional;

import lombok.Getter;
import lombok.Setter;

import java.util.Optional;

@Getter @Setter
public class Computer {
    private Optional<Soundcard> soundcard;
}

