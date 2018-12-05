import java.util.Scanner;

public class MultiplicationNumber {
    public static void main(String[] args) {
        Scanner p= new Scanner(System.in);
        System.out.println("Enter positive integer");
        int number=p.nextInt();
        int i=1;
        do {
            System.out.println(number+"*"+ i+"="+(number*i));
            i++;
        }

        while(i<=10);


    }
}
