// Fibonacci sequence: F(n) = F(n-1) + F(n-2).
public class MainD {
    int d(int n) {
        if (n <= 1) return n;
        return d(n-1) + d(n-2);
    }
    public static void main(String[] args) {
        System.out.println(new MainD().d(5));
    }
}