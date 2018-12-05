import java.util.Scanner;

public class SumOf5digit {
    public static void main(String[] args) {
        Scanner p= new Scanner(System.in);
        System.out.println("Enter any 5 digit");
        int number= p.nextInt();
        int sum=0;
        while (number>0){
            int lastdigit=number%10;
            sum=sum+lastdigit;
            number=number/10;

        }
        System.out.println(sum);
    }
}
