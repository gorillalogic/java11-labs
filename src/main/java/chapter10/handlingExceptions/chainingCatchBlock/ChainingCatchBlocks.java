package chapter10.handlingExceptions.chainingCatchBlock;

public class ChainingCatchBlocks {

    public void visitPorcupine() {
        try {
            seeAnimal();
        } catch (AnimalsOutForAWalk e) {
            System.out.print("try back later");
        } catch (ExhibitClosed e) {
            System.out.print("not today");
        }
    }

    private void seeAnimal() {
        /*
            There are three possibilities for when this code is run.
            If seeAnimal() doesn't throw an exception, nothing is printed out.
            If the animal is out for a walk, only the first catch block runs.
            If the exhibit is closed, only the second catch block runs.
            It is not possible for both catch blocks to be executed
            when chained together like this.
         */
    }

    /*
        A rule exists for the order of the catch blocks.
        Java looks at them in the order they appear.
        If it is impossible for one of the catch blocks to be executed,
        a compiler error about unreachable code occurs.
        For example, this happens when a superclass catch block appears
        before a subclass catch block.
     */
    public void visitMonkeys() {
//        try {
//            seeAnimal();
//        } catch (ExhibitClosed e) {
//            System.out.print("not today");
//        } catch (ExhibitClosedForLunch e) {
//            System.out.print("try back later");
//        }
    }

    public void visitSnakes() {
//        try {
//
//        } catch (IllegalArgumentException e) {
//
//        } catch (NumberFormatException e) {
//
//        }
    }

    /*
        To review multiple catch blocks, remember that at most one catch block
        will run, and it will be the first catch block that can handle it.
        Also, remember that an exception defined by the catch statement is
        only in scope for that catch block.
     */
    public void visitManatees() {
//        try {
//
//        } catch(NumberFormatException e1) {
//            System.out.println(e1);
//        } catch(IllegalArgumentException e2) {
//            System.out.println(e1);
//        }
    }
}
