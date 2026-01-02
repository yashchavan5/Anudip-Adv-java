import java.io.FileReader;
import java.io.IOException;

class FileReadDemo {
    public static void main(String[] args) {

        int ch;
        int count = 0;

        try {
            FileReader fr = new FileReader("input.txt"); // file name

            // read file character by character
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
                count++;
            }

            fr.close();

            System.out.println("\n\nTotal characters in file: " + count);

        } catch (IOException e) {
            System.out.println("File error: " + e);
        }
    }
}
