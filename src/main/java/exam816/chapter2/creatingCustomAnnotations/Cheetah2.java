package exam816.chapter2.creatingCustomAnnotations;

@Exercise(hoursPerDay = 3) public class Cheetah2 {
}

//@Exercise hoursPerDay = 3 class Sloth2 { // DOES NOT COMPILE
    /**
     * Parentheses are optional only if no values are included
     */
//}

//@Exercise class ZooEmployee2 { // DOES NOT COMPILE
    /**
     * This class doesn't compile because the hoursPerDay
     * field is required
     */
//}

/**
 * When declaring an annotation, any element without a default
 * value is considered required.
 */

@Exercise(startHour = 5, hoursPerDay = 3) class Cheetah3 {
}

@Exercise(hoursPerDay = 0) class Sloth3 {
}

//@Exercise(hoursPerDay = 7, startHour = "8") class ZooEmployee3 { // DOES NOT COMPILE
//}
