public class MainF {
    void f(String message) {
        System.out.println(new StringBuilder(message).reverse().toString());
    }
    public static void main(String[] args) {
        // new MainA().a(5);
        // new MainC().c(5);
        // System.out.println(new MainD().d(5));
        // new MainE().e();
        new MainF().f("Hello World");
    }           
}
