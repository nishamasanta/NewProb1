import java.util.Scanner;

public class NewProb1{

    
    static int bubbleSortAsc(int[] array) {
        int n = array.length;
        int swapCount = 0;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                    swapCount++;
                }
            }
            if (!swapped) break; 
        }
        return swapCount;
    }

    
    static int bubbleSortDesc(int[] array) {
        int n = array.length;
        int swapCount = 0;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                    swapCount++;
                }
            }
            if (!swapped) break; 
        }
        return swapCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        
        int[] arrAsc = arr.clone();
        int[] arrDesc = arr.clone();

        
        int ascSwaps = bubbleSortAsc(arrAsc);
        int descSwaps = bubbleSortDesc(arrDesc);

        
        System.out.println(Math.min(ascSwaps, descSwaps));

        sc.close();
    }
}
