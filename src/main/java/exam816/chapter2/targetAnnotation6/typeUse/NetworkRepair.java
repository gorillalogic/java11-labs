package exam816.chapter2.targetAnnotation6.typeUse;

/**
 * The TYPE_USE parameter can be used anywhere there is a Java type.
 * By including it in @Target, it actually includes nearly all the
 * values in Table 2.1 including classes, interfaces, constructors,
 * parameters and more.
 * There are a few exceptions; for example, it can be used only on
 * a method that returns a value. Methods that return void would
 * still need the METHOD value defined in the annotation.
 */
public class NetworkRepair {
    class OutSrc extends @Technical NetworkRepair {
    }

    public void repair() {
        var repairSubclass = new @Technical NetworkRepair() {
        };

        var o = new @Technical NetworkRepair().new @Technical OutSrc();

        int remaining = (@Technical int) 10.0;

    }
}
