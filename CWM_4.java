
import java.util.Scanner;

public class CWM_4 {
    static void main() {


        int max= 100;



        System.out.println("Taking output from the User");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Subject 1st Marks");
        int a =  sc.nextInt();
        System.out.println("Enter Subject 2nd Marks");
        int b = sc.nextInt();
        System.out.println("Enter Subject 3rd Marks");
        int c = sc.nextInt();
        System.out.println("Enter Subject 4th Marks");
        int d = sc.nextInt();
        System.out.println("Enter Subject 5th Marks");
        int e = sc.nextInt();

      int sum = a+b+c+d+e;

      double  percentage = sum/500.00*100;

      System.out.println("The Sum of the marks is" + " " + sum);
        System.out.println("Marks In percentage = " + percentage);


        if (percentage>=90.0){
            System.out.println("Grade A1");
        }else if (percentage>=80.0){
            System.out.println("Grade A2");


        }else if (percentage>=70.0){
            System.out.println("Grade B1");


        }else if (percentage>=60.0){
            System.out.println("Grade B2");

        }else if (percentage>=50.0){
            System.out.println("Grade C1");

        }else if (percentage<=40.0){
            System.out.println("FAIL");
        }


        if (percentage<=40.0) {
            System.out.println("Better Luck Next Time");
        }
        else if(percentage>40.0) {
                System.out.println("Congratulations You are Passed");
        }


    }


}