import java.util.Scanner;

public class Qno8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a wt: ");
        float weight = sc.nextFloat();
        System.out.println(" Enter a height: ");
        float height = sc.nextFloat();


        float ans=order(weight, height);
        System.out.println("BMI ; " + ans);
    }
    public static float order(float weight, float height) {
        return weight/(height*height);
    }
}
