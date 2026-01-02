@FunctionalInterface
interface Operation {
    int calculate(int a, int b);
}

@FunctionalInterface
interface StringOp {
    String work(String s);
}

public class LambdaDemo {
    public static void main(String[] args) {

        // Numbers
        int a = 10;
        int b = 5;

        // Arithmetic lambda expressions
        Operation add = (x, y) -> x + y;
        Operation sub = (x, y) -> x - y;
        Operation mul = (x, y) -> x * y;
        Operation div = (x, y) -> x / y;

        System.out.println("Addition = " + add.calculate(a, b));
        System.out.println("Subtraction = " + sub.calculate(a, b));
        System.out.println("Multiplication = " + mul.calculate(a, b));
        System.out.println("Division = " + div.calculate(a, b));

        // String operations
        String str = "Java";

        StringOp upper = s -> s.toUpperCase();
        StringOp lower = s -> s.toLowerCase();
        StringOp reverse = s -> {
            String rev = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                rev = rev + s.charAt(i);
            }
            return rev;
        };

        System.out.println("\nUppercase = " + upper.work(str));
        System.out.println("Lowercase = " + lower.work(str));
        System.out.println("Reverse = " + reverse.work(str));
    }
}
