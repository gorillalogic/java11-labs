package com.gorillalogic.java.starter.demos.session2;

// Correct class name
public class NamingConvention {

    // Correct constant names
    static final int CONSTANT = 1;
    static final int CONSTANT_HERE = 1;

    // Incorrect constant names
    static final int constant = 1;        // Should be capitalized
    static final int constant_HERE = 1;   // Should be all capitalized
    static final int $CONSTANT_HERE = 1;  // Start with "$"
    static final int _CONSTANT_HERE = 1;  // Start with "_"
    static final int CST_HERE = 1;        // Don't use abbreviations


    // Correct variable names
    int variableHere;
    int variable;

    // Incorrect variable names
    int Variable;           // Does not start with upper case letter
    int $variableHere;      // Start with "$", does not fallow naming convention
    int _variableHere;      // Start with "_", does not fallow naming convention
    int varHere;            // Don't use abbreviations (eg. "var" stands for variable)


    // Correct method names
    void methodHere() {};
    void method() {};

    // Incorrect method names
    void MethodHere() {};       // Does not start with lower case letter
    void _methodHere() {};      // Start with "_", does not fallow naming convention
    void $methodHere() {};      // Start with "$", does not fallow naming convention
    void metHere() {};          // Don't use abbreviations (eg. "met" stands for method)

}

interface AnInterface {}

// Incorrect class name
class car {}            // Does not start with capital letter
class fourwheelcar {}   // Does not follow CamelCase
class _Car {}           // Valid syntax but not following naming convention
class $Car {}           // Valid syntax but not following naming convention
class $1Car {}          // Valid syntax but not following naming convention
class Emp {}            // Don't use abbreviations (eg. Emp stands for Employee)

