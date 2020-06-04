package chapter10.handlingExceptions.tryWithResources;

public class MyFileClass implements AutoCloseable {

    private final int num;

    public MyFileClass(int num) {
        this.num = num;
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing: " + num);
    }

    /*
        This is a pretty simple class that prints the number, set by the constructor,
        when a resource is closed. Based on these rules, can you figure out what
        this method prints?
     */
    public static void main(String[] args) {
        try (MyFileClass a1 = new MyFileClass(1);
             MyFileClass a2 = new MyFileClass(2)) {
            throw new RuntimeException();
        } catch (Exception e) {
            System.out.println("ex");
        } finally {
            System.out.println("finally");
        }
    }
}
