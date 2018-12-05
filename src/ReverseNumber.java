import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner p= new Scanner(System.in);
        System.out.println("Enter positive integer");
        int number=p.nextInt();
        int digit;
        int reverse=0;



        do{
        digit=number%10;
        reverse= (reverse*10)+digit;
        number=number/10;

        }
        while (number>0);
        System.out.println(reverse);
}}

