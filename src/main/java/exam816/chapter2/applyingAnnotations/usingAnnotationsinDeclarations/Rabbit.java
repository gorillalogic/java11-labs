package exam816.chapter2.applyingAnnotations.usingAnnotationsinDeclarations;

@LongEars
@Soft @Cuddly public class Rabbit {

    @Deprecated public Rabbit(@NotNull Integer size) {}

    @Speed(velocity = "fast") public void eat(@Edible String input) {
        @Food(vegetarian = true) String m = "carrots";
        //@Food(vegetarian = true) String m = (@Tasty String) "carrots";

        //Speedster s1 = new @Racer Speedster() {
        Speedster s1 = new Speedster() {
            public void go(@FirstName @NotEmpty String name) {
                System.out.print("Start! " + name);
            }
        };

        Speedster s2 = (@Valid String n) -> System.out.print(n);
    }
}
