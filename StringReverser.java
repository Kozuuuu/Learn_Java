public class StringReverser {
    public static void main(String[] args) {
        String original = "Val Jayson!"; // Replace with your string
        String reversed = new StringBuilder(original).reverse().toString();
        System.out.println("Reversed: " + reversed);
    }
}
