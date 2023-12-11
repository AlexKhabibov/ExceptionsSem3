public class Task1 {
    public static void main(String[] args) {
        try {
            doSomething();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void doSomething() throws Exception {

    }
}
