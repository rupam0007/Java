import java.util.Scanner;
import java.util.Arrays;
public class ass29 {
    public static void main(String[] args) {
        
    BinarySearch bs = new BinarySearch();
    bs.input();
    bs.check();
    }
}
    class BinarySearch{
         int[] arr;
         int key;
            void input(){
                Scanner sc = new Scanner(System.in);
                arr = new int[n];
                System.out.print("Enter n: ");
                int n = sc.nextInt();
                System.out.print("Enter " + n + " elements: ");
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
                Arrays.sort(arr);

                System.out.print("Search Value: ");
                key = sc.nextInt();
            }
            void check(){
                   

                 int result = binarySearch(arr, key);
                    if (result == -1) {
                        System.out.println("Value not found");
                    } else {
                        System.out.println("Value found at index: " + result);
                    }
            }

            int binarySearch(int[] arr, int key) {
                    int low = 0, high = arr.length - 1;

                    while (low <= high) {
                        int mid = (low + high) / 2;

                        if (arr[mid] == key)
                            return mid;
                        else if (arr[mid] < key)
                            low = mid + 1;
                        else
                            high = mid - 1;
                    }

                    return -1; 
                }
  }
