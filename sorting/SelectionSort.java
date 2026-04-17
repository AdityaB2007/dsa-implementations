package sorting;

public class SelectionSort {

    public static void sort(int[] arr) {
        if (arr == null || arr.length <= 1) return;

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }

            // swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    // Test
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        sort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}