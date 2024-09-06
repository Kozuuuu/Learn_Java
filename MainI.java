class Maini {
    int i;
    Maini(int i) {
        this.i = i;
    }
    
    void j() {
        System.out.println(i);
    }
}    

public class MainI {
    public static void main(String[] args) {
        Maini obj = new Maini(10);
        obj.j();
    }
}
