import  java.util.Scanner;

public class LeapYearOrNot {
    public static  void  main(String[]args){
        Scanner sc = new Scanner(System.in);

        // User input

        int year = sc.nextInt();
        System.out.print("Enter any year : ");

        if (year % 4 ==0){
            System.out.print("It's a leap year");
        }
        else {
            System.out.print("It's not a leap year");
        }
    }
}
