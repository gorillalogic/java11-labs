package exam816.chapter2.javadocAnnotations9;

/**
 * Javadoc has its own annotation that are used
 * solely in generating data within a Javadoc file
 */
public class ZooLightShow {
    /**
     * Performs a light show at the zoo.
     *
     * @param distance length the light needs to travel
     * @return the result of the light show operation
     * @author Valery Mendez
     * @since 1.5
     * @deprecated Use EnhancedZooLightShow.lights() instead
     */
    @Deprecated public static String perform(int distance) {
        return "Beginning light show!";
    }

    /**
     * Be careful not to confuse Javadoc annotation with Java
     * annotation. Take a look at the @deprecated and @Deprecated
     * annotations in this example. The first, @deprecated, is a
     * Javadoc annotation used inside a comment, while @Deprecated
     * is a Java annotation applied to a class. Traditionally,
     * Javadoc annotations are all lowercase, while Java
     * annotations start with uppercase letter.
     */
}
