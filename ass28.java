class Insertion {
    int[] arr;
    Insertion(int[] inputArr) {
        arr = inputArr;
    }

    void sort() {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    void show() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class ass28{
    public static void main(String[] args) {
        int[] arr = {9, 5, 8, 2, 7};
        Insertion ob = new Insertion(arr); 
        ob.sort();                         
        ob.show();                         
    }
}
