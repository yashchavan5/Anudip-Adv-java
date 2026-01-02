/*import java.util.Scanner;

class Person {
    int rollNo;
    String name;

    public Person(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name:");
        String name = sc.nextLine();

        System.out.println("Enter Age:");
        int age = sc.nextInt();

        System.out.println("Enter Salary:");
        double salary = sc.nextDouble();

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}
*/



// DAY 2
/* 
import java.util.*;

public class Person {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter numerator");
        int num1 = sc.nextInt();

        System.out.println("enter denominator");
        int num2 = sc.nextInt();

        System.out.println(num1 / num2);
        System.out.println("hello");
    }
}
*/
/* 
import java.util.*;

public class Person {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numerator:");
        int num1 = sc.nextInt();

        System.out.println("Enter denominator:");
        int num2 = sc.nextInt();

        try {
            System.out.println("Result: " + (num1 / num2));
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

        System.out.println("hello");
    }
}



*/


/* 
import java.util.*;

public class ArraySum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int sum = 0;

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        System.out.println("Sum of array elements: " + sum);
    }
}
 */
/* 
 import java.util.*;

public class ArraySum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = null;
        try {
             System.out.println(s.length());
        }
        catch (NullPointerException){
            System.out.println();
        }


       
        }

       
}

*/

/* Tuesday


import java.io.FileNotFoundException;
import java.io.FileReader;

public class Run {

    public static void main (String [] ,args) throws FileNotFoundException {
        FileReader f= new FileReader ("abc.txt");
    }
}


*/


//ArrayList



