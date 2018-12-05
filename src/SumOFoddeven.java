import java.util.Scanner;

public class SumOFoddeven {
    // 11.	WAP to input any five digit number then count total no of odd and even digit and find sum of them
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.println("Enter 5 digit number");
        int number = p.nextInt();
        //running while loop to separate the number and check condition
        int count_even = 0;
        int total_of_even = 0;
        int count_odd = 0;
        int total_of_odd = 0;

        while (number > 0) {
            int lastdigit = number % 10;
            if (lastdigit % 2 == 0) {
                count_even++;
                total_of_even = total_of_even + lastdigit;
            } else {
                count_odd++;
                total_of_odd = total_of_odd + lastdigit;
            }

            number = number / 10;

        }

        System.out.println("Total even " + count_even);
        System.out.println("sum of even number" + total_of_even);
        System.out.println("Total odds " + count_odd);
        System.out.println("sum of odd number " + total_of_odd);


    }
}
