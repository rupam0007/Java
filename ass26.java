import java.util.Scanner;


class Staff {
    String name;
    int id;

    void readDetails(Scanner sc) {
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter ID: ");
        id = Integer.parseInt(sc.nextLine());
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}


class Officer extends Staff {
    String grade;

    void readDetails(Scanner sc) {
        super.readDetails(sc);
        System.out.print("Enter Grade: ");
        grade = sc.nextLine();
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Grade: " + grade);
    }
}

class Teacher extends Staff {
    String subject;

    void readDetails(Scanner sc) {
        super.readDetails(sc);
        System.out.print("Enter Subject: ");
        subject = sc.nextLine();
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Subject: " + subject);
    }
}

public class ass26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Staff staff;

        System.out.println("Enter Teacher Details:");
        staff = new Teacher();
        staff.readDetails(sc);
        System.out.println("\nTeacher Details:");
        staff.displayDetails();

        System.out.println("\nEnter Officer Details:");
        staff = new Officer(); 
        staff.readDetails(sc);
        System.out.println("\nOfficer Details:");
        staff.displayDetails();


    }
}
