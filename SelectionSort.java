public class SelectionSort {
    public static int[] selectionSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr;
        }
        
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] numbers = {64, 34, 25, 12, 22};
        int[] sortedNumbers = selectionSort(numbers);
        System.out.print("Lista ordenada: ");
        for (int num : sortedNumbers) {
            System.out.print(num + " ");
        }
    }
}
