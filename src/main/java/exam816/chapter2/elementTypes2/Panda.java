package exam816.chapter2.elementTypes2;

import exam816.chapter2.creatingCustomAnnotations1.Exercise;

/**
 * Similar to a default element value, an annotation element
 * cannot be declared with just any type. It must be a primitive
 * type, a String, a Class, an enum, another annotations, or an array
 * of any of these types.
 */
public @interface Panda {
//    Integer height();
//    String[][] generalInfo();
    Size size() default Size.SMALL;
//    Bear friendlyBear(); // Does not compile. The type of friendlyBear() is Bear(not Class).
//    Even if Bear were changed to an interface, the friendlyBear() element would still not
//    compile since it is not one of the supported types.

    Exercise exercise() default @Exercise(hoursPerDay = 2);
}
