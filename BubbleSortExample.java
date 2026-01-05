import java.util.Arrays;

public class BubbleSortExample {
    public static void main(String[] args) {

        int[] arr = {5, 2, 9, 1, 5, 6};

        System.out.println("Original Array: " + Arrays.toString(arr));

        int[] bubbleArr = arr.clone();

        for (int i = 0; i < bubbleArr.length - 1; i++) {
            for (int j = 0; j < bubbleArr.length - 1 - i; j++) {
                if (bubbleArr[j] > bubbleArr[j + 1]) {
                    int temp = bubbleArr[j];
                    bubbleArr[j] = bubbleArr[j + 1];
                    bubbleArr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted using Bubble Sort: " + Arrays.toString(bubbleArr));

        int[] libraryArr = arr.clone();
        Arrays.sort(libraryArr);

        System.out.println("Sorted using Arrays.sort(): " + Arrays.toString(libraryArr));
    }
}
