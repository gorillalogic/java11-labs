package chapter10.handlingExceptions.finallyBlock;

public class AddingAFinallyBlock {
    /*
        The exam will try to trick you with missing clauses or clauses in the wrong order.
     */
    public static void main(String[] args) {
//        try {
//            fall();
//        } finally {
//            System.out.println("all better");
//        } catch (Exception e) {
//            System.out.println("get up");
//        }

//        try {
//            fall();
//        }

//        try {
//            fall();
//        } finally {
//            System.out.println("all better");
//        }

        System.out.println(exceptions());
    }

    private static void fall() {
    }

    int goHome() {
        /*
            One problem with finally is that any realistic uses for it are out of the scope of the exam.
            A finally block is typically used to close resources such as files or databases --
            neither of which is a topic on this exam. This means most of the examples you
            encounter on the exam with finally are going to look contrived.
         */
        try {
            //Optionally throw an exception here
            System.out.print("1");
            return -1;
        } catch (Exception e) {
            System.out.print("2");
            return -2;
        } finally {
            System.out.print("3");
            return -3;
        }

        /*
            For the exam, you need to remember that a finally block will always be executed.
            That said, it may not complete successfully. If info is null, then the finally
            block would be executed, but it would stop on line info.printDetails();
            and throw a NullPointerException. Lines 57-58 would not be executed.
         */
//        } finally {
//            info.printDetails();
//            System.out.print("Exiting");
//            return "zoo";
//        }
    }

    /*
        This is one of the hardest examples you can be asked related to
        exception.
     */
    public static String exceptions() {
        StringBuilder result = new StringBuilder();
        String v = null;
        try {
            try {
               result.append("before_");
               v.length();
               result.append("after_");
            } catch (NullPointerException e) {
                result.append("catch_");
                throw new RuntimeException();
            } finally {
                result.append("finally_");
                throw new Exception();
            }
        } catch (Exception e) {
            result.append("done");
        }
        return result.toString();
    }
}
