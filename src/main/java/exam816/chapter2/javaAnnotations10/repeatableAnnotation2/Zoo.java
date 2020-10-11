package exam816.chapter2.javaAnnotations10.repeatableAnnotation2;

public class Zoo {
    public static class Monkey {}

    @Risk(danger = "Silly")
    @Risk(danger = "Aggressive", level = 5)
    @Risk(danger = "Violent", level = 10)
    private Monkey monkey;

    /**
     * Repeatable Annotations vs. an Array of Annotations
     *
     * Repeatable annotations were added in Java 8. Prior to this,
     * you would have had to use the @Risks containing annotation
     * type directly:
     */
    @Risks({
            @Risk(danger = "Silly"),
            @Risk(danger = "Aggressive", level = 5),
            @Risk(danger = "Violent", level = 10)
    })
    private Monkey monkey2;
    /**
     * With this implementation, @Repeatable is not required in the Risk
     * annotation declaration. The @Repeatable annotation is the preferred
     * approach now, as it is easier than working with multiple nested
     * statements.
     */

}
