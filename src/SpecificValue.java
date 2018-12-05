import java.util.Scanner;

public class SpecificValue {
    //2.	Write a Java program to test if an array contains a specific value.
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.println("Enter the value to check weather it is in loop or not");
        int value = p.nextInt();

        int array[] = {2, 4, 3, 50, 6};
        boolean flag = true;

        for (int i = 0; i < 5; i++) {
            if (value == array[i]) {
                System.out.println("This number is present in array");
                flag = false;

            }

        }
        if(flag==true){
                System.out.println("This number is Not present in array");

    }


}
}

