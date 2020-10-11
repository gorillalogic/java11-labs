package exam816.chapter2.javaAnnotations10.repeatableAnnotation2;

import java.lang.annotation.Repeatable;

@Repeatable(Risks.class)
public @interface Risk {
    String danger();
    int level() default 1;
}

/**
 * Rules for declaring a repeatable annotation,
 * along with its associated containing
 * type annotation:
 *
 * 1. The repeatable annotation must be declared with @Repeatable
 * and contain a value the refers to the containing type annotation.
 *
 * 2. The containing type annotation must include an element named
 * value(), which is a primitive array of the repeatable annotation
 * type.
 */
