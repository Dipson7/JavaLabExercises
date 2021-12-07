import java.security.PublicKey;
import  java.util.Scanner;

public class Palindrome {
    public  static  void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number : ");
        int num = sc.nextInt();

        int rem = num % 10;
        int quot = num / 10;
        int result = (rem * 10) + quot;

        if (rem==num){
            System.out.print("It's not palindrome");
        }

        else {
            System.out.print("It's palindrome");
        }
    }
}
