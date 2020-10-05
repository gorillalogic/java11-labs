package exam816.chapter2.passingAnArrayOfValues;

public class Giraffe {
    /**
     * If we want to provide only one value to the array,
     * we have a choice of two ways to write the annotation.
     */
    @Music(genres = {"Rock and roll"}) String mostDisliked;
    @Music(genres = "Classical") String favorites;


    /**
     * Example with several values
     */
    @Music(genres = {"Rock and roll", "Rock", "Classical"}) String mostLiked;

    /**
     * This notation (genres = "Classical") can be used only
     * if the array is composed of a single element.
     * For example, only one of the following annotations
     * compiles:
     */
    class Reinder {
        //@Music(genres = "Blues", "Jazz") String favorite; // DOES NOT COMPILE
        //@Music(genres = ) String mostDisliked; // DOES NOT COMPILE
        //@Music(genres = null) String other; // DOES NOT COMPILE
        @Music(genres = {}) String alternate;
    }

    /**
     * Combining Shorthand Notations
     */
    class Capybara {
        @Rhythm(value={"Swing"}) String favorite;
        @Rhythm(value="R&B") String secondFavorite;
        @Rhythm({"Classical"}) String mostDisliked;
        @Rhythm("Country") String lastDisliked;
    }
}
