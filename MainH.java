import java.util.HashMap;

public class MainH{
    void mainh() {
        HashMap<Integer, String> hashmap = new HashMap<>();
        hashmap.put(1, "One");
        hashmap.put(2, "Two");
        hashmap.put(3, "Three");
        System.out.println(hashmap.get(3));
    }
    public static void main(String[] args) {
        new MainH().mainh();
    }
}
