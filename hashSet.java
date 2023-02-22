import java.util.*;

public class hashSet {
    public static void main(String args[]) {

        HashSet<String> clg = new HashSet();

        clg.add("Thiagarajar college");
        clg.add("American college");
        clg.add("Madura college");
        clg.add("PSNA college");

        System.out.println("The preffered college in Madurai are: \n" + clg);
        // Adding elements and checking whether it takes duplicate or not
        clg.add("Vellammal college");
        clg.add("PSNA college");
        System.out.println("To check it takes duplicate or not: \n" + clg);
        // Removing certain elements and elements and cheking whether it is empty or not
        System.out.println("Before removing : " + clg);
        clg.remove("American college");
        clg.remove("Madura college");
        System.out.println("After removing : " + clg);
        if (clg.isEmpty()) {
            System.out.println("The hashset is empty");

        } else {
            System.out.println("The hashset is not empty" + clg);
        }
    }
}