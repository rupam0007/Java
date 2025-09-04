import java.util.Scanner;

public class ass33{
    public static void main(String[] args) {
      DayNumberToDate dtd = new DayNumberToDate();
      dtd.input();
      dtd.calculate();
      dtd.show();
    }
}


class DayNumberToDate{
    int year;
    int dayNumber;
    int month = 0;

    int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    String[] monthNames = {"January", "February", "March", "April", "May", "June", 
                            "July", "August", "September", "October", "November", "December"};

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day number : ");
        dayNumber = sc.nextInt();
        System.out.print("Enter year : ");
        year = sc.nextInt();
    }
    void calculate(){

        if (year < 1000 || year > 9999) {
            System.out.println("Invalid year. Please enter a 4-digit year.");
            return;
        }

        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if (isLeap) {
            daysInMonths[1] = 29;
        }

        int maxDays = isLeap ? 366 : 365;

        if (dayNumber < 1 || dayNumber > maxDays) {
            System.out.println("Invalid day number for the year " + year);
            return;
        }
    }
    void show(){

          while (dayNumber > daysInMonths[month]) {
            dayNumber -= daysInMonths[month];
            month++;
        }

        System.out.println("Date: " + dayNumber + "th " + monthNames[month] + ", " + year);
    }
}