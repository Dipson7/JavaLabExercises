import java.util.Scanner;
public class Qno7 {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        //value input

        System.out.println("Enter first floatpoint number:");
        float first_num=scan.nextFloat();
        System.out.println("Enter second floatpoint number");
        float second_num=scan.nextFloat();

        deci(first_num,second_num);

    }

    public static void deci (float first_num, float second_num)
    {
        if (Math.abs(first_num-second_num)<=0)
        {
            System.out.println("Its the same number");
        }
        else
        {
            System.out.println("Not a same Number");
        }

    }
}