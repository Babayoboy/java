import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        HashMap<String, Integer> Hmap = new HashMap<>();
        Hmap.put("Pihu", 19);
        Hmap.put("Ansh", 19);
        Hmap.put("Uday", 15);
        Hmap.put("Kamla", 42);

        // System.out.println(Hmap);

        // Hmap.remove("Uday");
        
        // System.out.println(Hmap.get("Kamla"));
        // System.out.println(Hmap.containsValue("16"));
        // System.out.println(Hmap.containsKey("Pihu"));
        // System.out.println(Hmap.size());
        // System.out.println(Hmap);
        for(String key: Hmap.keySet()){
            System.out.printf("%s's age is %d\n", key, Hmap.get(key));
        }
    }
}
