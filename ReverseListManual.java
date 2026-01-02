import java.util.ArrayList;

public class ReverseListManual {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JavaScript");

        int n = list.size();

        // Manual reverse logic
        for (int i = 0; i < n / 2; i++) {
            String temp = list.get(i);
            list.set(i, list.get(n - i - 1));
            list.set(n - i - 1, temp);
        }

        System.out.println("Reversed List: " + list);
    }
}
