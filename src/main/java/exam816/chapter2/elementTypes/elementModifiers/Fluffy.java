package exam816.chapter2.elementTypes.elementModifiers;


/**
 * Like abstract interface methods, annotation elements are implicitly
 * abstract and public, whether you declare them that way or not.
 */
public @interface Fluffy {
    int cuteness();
    public abstract int softness() default 11;
//    protected Material material(); // DOES NOT COMPILE
//    private String friendly(); // DOES NOT COMPILE
//    final boolean isBunny(); // DOES NOT COMPILE
}
