import java.util.Scanner;

class MatrixTranspose {

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
    void transpose(){
        System.out.println("Transpose of the matrix:");
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
   }
}


public class ass30{
    public static void main(String[] args) {
        MatrixTranspose mt = new MatrixTranspose();
        mt.input();
        mt.transpose();
    }
}