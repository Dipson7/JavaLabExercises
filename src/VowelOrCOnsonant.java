import java.util.Scanner;

public class VowelOrCOnsonant {
    public static  void  main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a character : ");
        char chr = sc.next().charAt(0);

        if (chr == 'a' || chr == 'e' || chr =='i' || chr =='o' || chr == 'u'){
            System.out.print("Vowel");
        }
        else {
            System.out.print("Consonant");
        }

    }
}
