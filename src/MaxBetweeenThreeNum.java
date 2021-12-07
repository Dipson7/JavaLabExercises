import java.util.Scanner;
public class MaxBetweeenThreeNum {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        // Data representation
        float first;
        float second;
        float third;
        float greatest;

        // Step two, user input
        System.out.print("Enter first : ");
        first = sc.nextFloat();
        System.out.print("Enter second : ");
        second = sc.nextFloat();
        System.out.print("Enter third : ");
        third = sc.nextFloat();

        if (first > second && first > third){
            System.out.print(first + " is greatest" );
        }
        else if (second > first && second > third){
            System.out.print(second + " is greatest" );
        }
        else if (third > first && third > second){
            System.out.print(third + " is greatest" );
        }
        else {
            System.out.print( "they are all equal" );
        }


    }
}
