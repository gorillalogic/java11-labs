package exam816.chapter2.valueElement;

/**
 * Rules to use annotations without the element's name
 *
 * The annotation declaration must contain an element named
 * value(), which may be optional or required.
 *
 * The annotation declaration must not contain any any other
 * elements that are required.
 *
 * The annotation usage must not provide values for any elements.
 *
 */
public abstract class Elephant {
    @Injured("Legs") public void fallDown() {}
    @Injured(value = "Legs") public abstract int trip();
    @Injured String injuries[];
}

/*
  For the exam, make sure that if the shorthand notation is used,
  then there is an element named value(). Also, check that there
  are no other required elements. For example, the following
  annotation declarations cannot be used with a shorthand annotation:
 */

//public @interface Sleep {
//    int value();
//    String hours();
//}

//public @interface Wake {
//    String hours();
//}
