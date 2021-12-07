import  java.util.Scanner;
public class GradingSubjects {
    public static  void  main(String[]args){
        Scanner sc = new Scanner(System.in);

        // Data representation
        float maths;
        float english;
        float chem;
        float physics;
        float bio;
        float average;

        // User input
        System.out.print("Enter marks in Mathematics : ");
        maths = sc.nextFloat();
        System.out.print("Enter marks in English : ");
        english = sc.nextFloat();
        System.out.print("Enter marks in Chemistry : ");
        chem = sc.nextFloat();
        System.out.print("Enter marks in Physics : ");
        physics = sc.nextFloat();
        System.out.print("Enter marks in Biology : ");
        bio = sc.nextFloat();

        average = (maths + english + chem + physics + bio) / 5;

        if (average >= 90){
            System.out.print("You got " +average+"% and your grade is A" );
        }
        else if (average >= 80){
            System.out.print("You got " +average+"% and your grade is B" );
        }
        else if (average >= 70){
            System.out.print("You got " +average+"% and your grade is C" );
        }
        else if (average >= 60){
            System.out.print("You got " +average+"% and your grade is D" );
        }
        else if (average >= 50){
            System.out.print("You got " +average+"% and your grade is E" );
        }
        else {
            System.out.print("You got " +average+"% and your grade is F" );
        }
    }
}
