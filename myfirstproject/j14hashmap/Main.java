import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        HashMap<String, Integer> Hmap = new HashMap<>();
        Hmap.put("Pihu", 19);
        Hmap.put("Ansh", 19);
        Hmap.put("Uday", 15);
        Hmap.put("Kamla", 42);

        System.out.println(Hmap);

        Hmap.remove("Uday");
        
        System.out.println(Hmap);
    }
}
