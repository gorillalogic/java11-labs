package exam816.chapter2.elementTypes.constantVariables;

/**
 * Annotations can include constant variables that can be accessed
 * by other classes without actually creating the annotations.
 */
public @interface ElectricitySource {
    public int voltage();
    int MIN_VOLTAGE = 2;
    public static final int MAX_VOLTAGE = 18;
}

/*
* Just like interfaces variables, annotation variables are implicitly public,
* static, and final. These constant variables are not considered elements, though.
* For example, marker annotations can contain constants.
*/