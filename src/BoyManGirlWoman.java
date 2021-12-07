import java.util.Scanner;
public class BoyManGirlWoman {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        System.out.print("Are you male?  : ");
        boolean gender = sc.nextBoolean();

        if (gender) {
            if (age >= 20) {
                System.out.print("You are a man");
            }
            else {
                System.out.print("You are a boy");
            }
        }

        else {
            if (age >= 20) {
                System.out.print("You are a waman");
            }
            else {
                System.out.print("You are a gyal");
            }
        }
    }
}
