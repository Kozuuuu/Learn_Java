public class MainM {
    void mainM() {
        try {
            int[] arr = new int[5];
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        }
    }    
    public static void main(String[] args) {
        new MainM().mainM();
    }
}
