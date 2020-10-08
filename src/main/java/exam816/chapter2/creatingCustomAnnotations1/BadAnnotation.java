package exam816.chapter2.creatingCustomAnnotations1;

/**
 * The default value of an annotation cannot be just any value.
 * Similar to case statement value, the default value of an
 * annotation must be a non-null constant expression.
 */
public @interface BadAnnotation {
//    String name() default new String(""); // DOES NOT COMPILE
    String address() default "";
//    String title() default null; // DOES NOT COMPILE
}

/**
 * In this example, name() does not compile because it is not
 * a constant expression, while title() does not compile because
 * it is null.
 * Only address() compiles. Notice that while null is not permitted
 * as a default value, the empty String "" is.
 */