import java.util.Scanner;
class  OctalMatrix {
int M, N;
int[][] matrix = new int[100][100];
int[] decimalEquivalents = new int[100];
    void inputMatrix(){
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter number of rows (M) [1-9]: ");
            M = sc.nextInt();
        } while (M <= 0 || M >= 10);

        do {
            System.out.print("Enter number of columns (N) [3-5]: ");
            N = sc.nextInt();
        } while (N <= 2 || N >= 6);


            for (int i = 0; i < M; i++) {
            System.out.print("Enter elements for row " + (i + 1) + ": ");
            for (int j = 0; j < N; j++) {
                int val;
                do {
                    val = sc.nextInt();
                    if (val < 0 || val > 7) {
                        System.out.print("Enter valid octal digit (0-7): ");
                    }
                } while (val < 0 || val > 7);
                matrix[i][j] = val;
            }
        }
    }

    void calculate(){
         for (int i = 0; i < M; i++) {
            int decimal = 0;
            for (int j = 0; j < N; j++) {
                decimal = decimal * 8 + matrix[i][j];
            }
            decimalEquivalents[i] = decimal;
        }
    }
    void show(){
        System.out.println("\nOUTPUT:.........................");
        System.out.println("FILLED MATRIX\t\tDECIMAL EQUIVALENT");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("\t\t" + decimalEquivalents[i]);
        }
    }
}
public class ass32{
    public static void main(String[] args) {
     
       OctalMatrix omx = new OctalMatrix();
       omx.inputMatrix();
       omx.calculate();
       omx.show();
    }
}
