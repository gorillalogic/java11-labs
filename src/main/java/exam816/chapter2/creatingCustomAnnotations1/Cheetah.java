package exam816.chapter2.creatingCustomAnnotations1;

/**
 * Like interfaces, annotations can be applied to unrelated classes.
 */

@ExerciseMarkerAnnotation() public class Cheetah {
    /**
     * When using a marker annotation, parentheses are optional.
     * Once we start adding elements, though,
     * they are required if the annotation includes any values.
      */
}

@ExerciseMarkerAnnotation
class Sloth {

}

@ExerciseMarkerAnnotation
class ZooEmployee {

}

/**
 * Whether you put annotations on the same line as the type they apply to
 * or on separate lines is a matter of style. Either is acceptable.
 */

