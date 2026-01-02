import java.util.HashSet;

public class HashSetAllInOne {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        set.add(5);
        set.add(10);
        set.add(15);
        set.add(20);
        set.add(25);

        System.out.println("HashSet elements: " + set);

        System.out.println("Contains 10: " + set.contains(10));

        set.remove(15);

        System.out.println("Size of the set: " + set.size());
    }
}

*/