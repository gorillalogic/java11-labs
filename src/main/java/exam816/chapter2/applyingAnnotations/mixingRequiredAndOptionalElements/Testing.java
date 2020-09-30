package exam816.chapter2.applyingAnnotations.mixingRequiredAndOptionalElements;

public class Testing {
    /**
     * Which of the following compile?
     */

    //@Swimmer() class Amphibian {}

    //@Swimmer(favoriteStroke = "Breaststroke", name = "Sally") class Tadpole {}

    //@Swimmer(stroke="FrogKick", name="Kermit") class Frog {}

    //@Swimmer(stroke = "Butterfly", name = "Kip", armLength = 1) class Reptile {}

    //@Swimmer(stroke = "", name = "", favoriteStroke = "") class Snake {}
}
