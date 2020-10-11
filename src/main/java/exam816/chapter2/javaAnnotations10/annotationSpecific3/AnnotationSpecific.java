package exam816.chapter2.javaAnnotations10.annotationSpecific3;

public class AnnotationSpecific {

    /**
     * The default behavior for most of the annotations in Table 2.3
     * is often intuitive. For example, without the @Documented or
     * @Inherited annotation, these features are not supported.
     * Likewise, the compiler will report an error if you try
     * to use an annotation more than once without the @Repeatable
     * annotation.
     * The @Target annotation is a bit of a special case. When
     * @Target is not present, an annotation can be used in any
     * place except TYPE_USE or TYPE_PARAMETER scenarios (cast
     * operations, object creation, generic declarations, etc.).
     */
}
