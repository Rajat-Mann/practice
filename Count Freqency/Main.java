import java.io.*;
import java.text.NumberFormat.Style;
import java.util.*;

class Main{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int arr[]=new int[]{1,2,4,1,3,3,3,3,3,6,6,7,3,1,5,6,5,5,5,7,8,1};
        
        // contains maximum frequency
        countmaxFrequency(arr);

    }

    public static void countmaxFrequency(int[] arr){
        HashMap<Integer,Integer> hashmap=new HashMap<>();
        for (int i : arr) {
            if(hashmap.containsKey(i)){
                hashmap.put(i,hashmap.get(arr[i])+1);
            }
            else{
                hashmap.put(i,1);
            }
        }
        System.out.println(hashmap);
        System.out.println(hashmap.keySet());
        int max=Integer.MIN_VALUE;
        for (int i: hashmap.keySet()) {
        
            if(i>max){
                max=i;
            }
        }
        System.out.println(max);
    }
}