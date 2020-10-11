package exam816.chapter2.applyingAnnotations3.usingAnnotationsInDeclarations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE_USE) public @interface Tasty {
}
