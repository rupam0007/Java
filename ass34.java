import java.util.Scanner;

class VowelCount {
    Scanner sc = new Scanner(System.in);
    int count = 0;
    String str;
    
    void input(){
        System.out.print("Enter a string: ");
        str = sc.nextLine().toLowerCase();
    }

    void calculate(){
        for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
    }
    void show(){
        input();
        calculate();
        System.out.println("Number of vowels: " + count);
    }
}

public class ass34{
    public static void main(String[] args) {
        VowelCount vc = new VowelCount();
        vc.show();
    }
}
