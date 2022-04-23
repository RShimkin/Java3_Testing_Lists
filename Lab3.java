package shimkin.lab3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Lab3 {

    public static void main(String[] args) {
        System.out.print("Введите количество операций: ");
        Scanner scanner = new Scanner(System.in);
        int ops = scanner.nextInt();
        MyTester tester = new MyTester(ops);
        
        ArrayList<Integer> arr = new ArrayList<>();
        LinkedList<Integer> linked = new LinkedList<>();

        System.out.println();
        System.out.println(String.format("метод Add %s раз (ArrayList -> %s ms) (LinkedList -> %s ms)", 
                tester.getOpsAmount(), tester.testAdd(arr), tester.testAdd(linked)));
        System.out.println(String.format("метод Head %s раз (ArrayList -> %s ms) (LinkedList -> %s ms)", 
                tester.getOpsAmount(), tester.testAddHead(arr), tester.testAddHead(linked)));
        System.out.println(String.format("метод Tail %s раз (ArrayList -> %s ms) (LinkedList -> %s ms)", 
                tester.getOpsAmount(), tester.testAddTail(arr), tester.testAddTail(linked)));
        System.out.println(String.format("метод Delete %s раз (ArrayList -> %s ms) (LinkedList -> %s ms)", 
                tester.getOpsAmount(), tester.testDelete(arr), tester.testDelete(linked)));
        System.out.println(String.format("метод Get %s раз (ArrayList -> %s ms) (LinkedList -> %s ms)", 
                tester.getOpsAmount(), tester.testGet(arr), tester.testGet(linked)));
    }
}
