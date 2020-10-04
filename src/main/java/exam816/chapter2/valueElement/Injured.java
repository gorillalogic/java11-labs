package exam816.chapter2.valueElement;

public @interface Injured {
    String veterinarian() default "unassigned";
    String value() default "foot";
    int age() default 1;
}
