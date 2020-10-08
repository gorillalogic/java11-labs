package exam816.chapter2.creatingCustomAnnotations1;

/**
 * An annotation element is an attribute that stores values about the particular
 * usage of an annotation.
 */
public @interface Exercise {
    /**
     * It looks a lot like an abstract method, although we're calling it
     * an element (or attribute).
     *
     * Annotations have their root in interfaces. Behind the scenes, the JVM
     * is creating elements as interface methods and annotations as
     * implementations of these interfaces.
     */
    int hoursPerDay();

    /**
     * Providing an Optional Element
     */
    int startHour() default 6;
}
