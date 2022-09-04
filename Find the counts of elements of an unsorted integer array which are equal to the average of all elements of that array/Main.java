import java.io.*;
import java.util.*;
class Main{

    public static void count_elts_avg_of_all(int[] arr){
        
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        //
        int avg=sum/arr.length;
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(i==avg){
                count++;
            }
        }
        System.out.println("Array : "+Arrays.toString(arr));
        System.out.println("Average of Array is : "+avg);
        System.out.println("Count of "+avg+" is : "+count);
    }

    public static void main(String[] args) {
        
        int[] arr=new int[]{6,5,4,1,2,3};

        count_elts_avg_of_all(arr);

    }
}