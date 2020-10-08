package exam816.chapter2.retentionAnnotation7;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * In this example, both annotations will retain
 * the annotation information in their .class files,
 * although only Swimmer will be available (via reflection)
 * at runtime.
 */
@Retention(RetentionPolicy.CLASS)
public @interface Flier {
}

//@Retention(RetentionPolicy.RUNTIME)
//public @interface Swimmer {
//}