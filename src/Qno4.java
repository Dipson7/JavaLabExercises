import java.util.Scanner;
import java.util.StringTokenizer;
public class Qno4 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integers with one space gap:");
        String t = sc.nextLine();
        StringTokenizer st = new StringTokenizer(t, " ");
        while (st.hasMoreTokens()) {
            String temp = st.nextToken();
            int s = Integer.parseInt(temp);
            System.out.println(s);
            sum = sum + s;
        }
        System.out.println("sum of the integers is: " + sum);

    }



}
