import java.util.*;

public class treeSet {
    public static void main(String args[]) {
        TreeSet<String> rollNo = new TreeSet<Integer>();

        rollNo.add(29);
        rollNo.add(12);
        rollNo.add(34);
        rollNo.add(44);
        System.out.println("These are the students who registered for NPTEL exam : " + rollNo);
        // Adding more students
        System.out.println("Adding some more students who registered thorugh online");
        rollNo.add(55);
        rollNo.add(33);
        rollNo.add(5);
        System.out.println("this the full list of the student who register both online and offline  : " + rollNo);
        // Removing
        rollNo.add(29);
        rollNo.add(12);
        System.out.println("The students those who did not cancell the registered exam : " + rollNo);
        // Desending order because treemap return in acsending order
         System.out.println("In Descending order : ");
        Iterator<Integer> no = rollNo.descendingIterator();
        while (no.hasNext()){
            System.out.println(no.next()+" ");
        }
        }
    }
}
