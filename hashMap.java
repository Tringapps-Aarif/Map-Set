
/* Simple haspmap operations */
import java.util.*;

public class hashMap {
    public static void main(String args[]) {
        HashMap<Integer, String> obj = new HashMap<>();

        obj.put(1, "Aarif");
        obj.put(2, "Adham");
        obj.put(3, "Mujjamil");
        System.out.println("The size of the Hashmap is :" + obj.size());
        // Using constraint key for checking
        if (obj.containsKey(1))
            System.out.println("yes,we have the student detail");
        else
            System.out.println("No,we does not have the student detail");

        if (obj.containsKey(4))
            System.out.println("yes,we have the student detail");
        else
            System.out.println("No,we does not have the student detail");
        // Adding elements and checking the size
        obj.put(4, "Shaheed");
        obj.put(5, "Mohammed");
        System.out.println("The size of the Hashmap is :" + obj.size());

        // Removing elements and checking the size
        obj.remove(2);
        System.out.println("The size of the Hashmap is :" + obj);
    }
}