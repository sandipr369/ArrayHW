import java.util.Arrays;

public class EqualityofAray {
    public static void main(String[] args)  {
        int array1[] ={2,4,6,8,9};
        int array2[]={2,4,6,8,9};
        int array3[]={1,3,5,7,9};

        System.out.println("Is these two array equal? "+ Arrays.equals(array1,array2));
        System.out.println("Is these two array equal? "+ Arrays.equals(array2,array3));

    }
}

