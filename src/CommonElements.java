public class CommonElements {
    public static void main(String[] args) {


    int array1[] = {10, 12, 252, 36, 51};
    int array2[]={11,12,10,24,45};

    for(int i = 0; i<5 ; i++){
        for (int j=0;j<5;j++ ){
            if(array1[i]==array2[j]){
                System.out.println(array1[i]+"  is common element ");
            }
        }

    }

    }
}

