/* 
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Mango");

        System.out.println(map);
    }
}*/

/* 
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CricketerScore {
    public static void main(String[] args) {

        Map<String, Integer> scoreMap = new HashMap<>();

        scoreMap.put("Virat", 120);
        scoreMap.put("Rohit", 98);
        scoreMap.put("Dhoni", 75);
        scoreMap.put("Rahul", 64);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter batsman name: ");
        String name = sc.next();

        if (scoreMap.containsKey(name)) {
            System.out.println("Score of " + name + " is " + scoreMap.get(name));
        } else {
            System.out.println("Batsman not found");
        }
    }
}

*/