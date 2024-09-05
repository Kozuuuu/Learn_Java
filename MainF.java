public class MainF {
    void f(String message) {
        System.out.println(new StringBuilder(message).reverse().toString());
    }
    public static void main(String[] args) {
        new MainF().f("Hello World");
    }           
}