import java.util.Scanner;

public class SumofFirstAndLast {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.println("Enter any 5 digit number");
        int number=p.nextInt();

        int lastDigit;
        lastDigit= number%10;
        while (number>10){

            number= number/10;

        }

        System.out.println(number+lastDigit);
    }
}
