public class Day82 {

    void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            boolean swapped = false;
            
            // Melakukan perbandingan dan pertukaran elemen
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }

            // Jika tidak ada pertukaran, maka data sudah terurut
            if (!swapped) {
                break;
            }
        }
    }

    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Contoh penggunaan
    public static void main(String args[]) {
        Day82 ob = new Day82();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Array sebelum diurutkan:");
        ob.printArray(arr);

        ob.bubbleSort(arr);

        System.out.println("Array setelah diurutkan:");
        ob.printArray(arr);
    }
}
