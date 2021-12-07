import java.util.Scanner;
public class MaxBetweenTwoNum {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        // Data representation
        float first;
        float second;
        float greatest;

        // Step two, user input
        System.out.print("Enter first : ");
        first = sc.nextFloat();
        System.out.print("Enter second : ");
        second = sc.nextFloat();

        if (first > second){
            System.out.print(first + " is greater than " + second );
        }
        else {
            System.out.print(second + " is greater than " + first );
        }

    }
}
