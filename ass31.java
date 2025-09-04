import java.util.Scanner;

class ReverseMatrixElements {

    int[][] matrix = new int[100][100]; 
    int m,n;
    void input(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter m: ");
        m = sc.nextInt();
        System.out.print("Enter n: ");
        n = sc.nextInt();

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }
    int reverseNumber(int num) {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }
    void show(){
        System.out.println("Matrix with reversed elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(reverseNumber(matrix[i][j]) + " ");
            }
            System.out.println();
        }
    }
}


public class ass31{
    public static void main(String[] args) {
        ReverseMatrixElements rme = new ReverseMatrixElements();
        rme.input();
        rme.show();
    }
}