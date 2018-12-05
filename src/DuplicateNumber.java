import java.lang.reflect.Array;
import java.util.Scanner;

public class DuplicateNumber {
    public static void main(String[] args) {

        Scanner p = new Scanner(System.in);
        System.out.println(" Enter the number");
        int number = p.nextInt();

        int myArray[] = {12, 45, 35, 50, 90};
        boolean flag = true;

        for (int i = 0; i < 5; i++) {

            if (number == myArray[i]) {
                System.out.println("This number is duplicated ");

                flag = false;
                break;
            }


        }
        if (flag == true) {
            System.out.println("This number not duplicate");
        }
    }


}
