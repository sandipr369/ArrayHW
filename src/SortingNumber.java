
import java.lang.reflect.Array;
import java.util.Arrays;

public class SortingNumber {



    //1.	Write a Java program to sort a numeric array and a string array.
    public static void main(String[] args) {
        int a[]={30,50,10,40,20};

        String name[]={"raj","sam","lina","malik","amina"};
        Arrays.sort(a);//inbuilt method for sorting

        Arrays.sort(name);
        for (int i=0;i<5;i++){
            System.out.println(a[i]);

        }

        for (int i=0;i<5;i++){

            System.out.println(name[i]);
        }
    }

}

