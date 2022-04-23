package shimkin.lab3;

import java.util.ArrayList;
import java.util.LinkedList;

public class Lab3 {

    public static void main(String[] args) {
        MyTester tester = new MyTester(10000);
        
        ArrayList<Integer> arr = new ArrayList<>();
        LinkedList<Integer> linked = new LinkedList<>();

        System.out.println();
        System.out.println(String.format("Add (ArrayList -> %s ms) (LinkedList -> %s ms)", tester.testAdd(arr), tester.testAdd(linked)));
    }
}
