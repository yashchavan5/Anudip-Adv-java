    public class StackDemo {

    Integer[] stack;
    int top = -1;

    StackDemo(int size) {
        stack = new Integer[size];
    }

    void push(Integer value) {
        top = top + 1;
        stack[top] = value;
    }

    Integer pop() {
        Integer item = stack[top];
        top = top - 1;
        return item;
    }

    Integer peek() {
        return stack[top];
    }

    boolean isEmpty() {
        if (top == -1)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        StackDemo s = new StackDemo(4);

        System.out.println(s.isEmpty()); // true

        s.push(5);
        s.push(15);

        System.out.println(s.peek());   // 15
        System.out.println(s.pop());    // 15
        System.out.println(s.isEmpty()); // false
    }
}
