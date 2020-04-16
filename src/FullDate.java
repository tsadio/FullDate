import java.util.Scanner;

public class FullDate {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        int month, days,year;
        String myMonth;

        System.out.print("Enter a number for the month: ");
        month = in.nextInt();
        while (month < 1 || month > 12){
            System.out.println("Wrong response.");
            System.out.print("Enter a number 1-12: ");
            month = in.nextInt();
        }
        System.out.print("Enter a number for the day: ");
        days = in.nextInt();
        while (days < 1 || days > 31){
            System.out.println("Wrong response.");
            System.out.print("Enter a number 1-31: ");
            days = in.nextInt();
        }
        System.out.print("Enter a year: ");
        year = in.nextInt();

        switch (month){
            case 1:
                myMonth = "January";
                break;
            case 2:
                myMonth = "February";
                break;
            case 3:
                myMonth = "March";
                break;
            case 4:
                myMonth = "April";
                break;
            case 5:
                myMonth = "May";
                break;
            case 6:
                myMonth = "June";
                break;
            case 7:
                myMonth = "July";
                break;
            case 8:
                myMonth = "August";
                break;
            case 9:
                myMonth = "September";
                break;
            case 10:
                myMonth = "October";
                break;
            case 11:
                myMonth = "November";
                break;
            default:
                myMonth = "December";

        }
        System.out.println("It is " + myMonth + " " + days + ", " + year + "." );
    }
}