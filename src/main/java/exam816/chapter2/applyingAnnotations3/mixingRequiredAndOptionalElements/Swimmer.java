package exam816.chapter2.applyingAnnotations3.mixingRequiredAndOptionalElements;

public @interface Swimmer {

    int armLength = 10;

    String stroke();

    String name();

    String favoriteStroke() default "Backstroke";
}
