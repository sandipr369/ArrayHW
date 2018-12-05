import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner p= new Scanner(System.in);
        System.out.println("Enter the number");

        int number= p.nextInt();

        int a=number%10;
        int b=number%100/10;
        int c= number%1000/100;
        int d= (c*c*c)+(b*b*b)+(a*a*a);

        if (number==d){
            System.out.println("This number is Armstrong Number");
        }
        else {
            System.out.println("This is not an Armstrong number");
        }
    }
}
