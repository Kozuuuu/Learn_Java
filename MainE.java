import java.util.ArrayList;

public class MainE {
    void e(){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) list.add(i);
            list.forEach(System.out::println);
    }
    public static void main(String[] args) {
         new MainE().e();
    }
}    