import java.io.*;
import java.util.*;

class Main{

    public static void find_avg_largest_smallest(int[] arr){
        HashMap<Integer,Integer> hashmap=new HashMap<>();
        for (int i = 0; i < arr.length; i++) 
        {
            if(hashmap.containsKey(arr[i])){
                hashmap.put(arr[i],hashmap.get(arr[i])+1);
            }
            else{
                hashmap.put(arr[i],1);
            }
        }

        int minkey=Integer.MAX_VALUE;
        int maxkey=Integer.MIN_VALUE;
        for (int key : hashmap.keySet()) {
            if(key>maxkey){
                maxkey=key;
            }
            if(key<minkey){
                minkey=key;
            }
        }
        int a=hashmap.get(minkey);
        int b=hashmap.get(maxkey);
        int total=a+b;
        int avg=(minkey*a+maxkey*b)/total;
        System.out.println("Smallest : "+minkey+"*"+a+" Largest: "+maxkey+"*"+b);
        System.out.println("Average : "+avg);
    }

    
    public static void main(String[] args) {
        int[] arr=new int[]{1,4,3,4};
        find_avg_largest_smallest(arr);
    //     HashMap<Integer,Integer> hashmap=new HashMap<>();
    //     for (int i = 0; i < arr.length; i++) 
    //     {
    //         if(hashmap.containsKey(arr[i])){
    //             hashmap.put(arr[i],hashmap.get(arr[i])+1);
    //         }
    //         else{
    //             hashmap.put(arr[i],1);
    //         }
    //     }
    //     System.out.println(hashmap);

    //     int minkey=Integer.MAX_VALUE;
    //     int maxkey=Integer.MIN_VALUE;
    //     for (int key : hashmap.keySet()) {
    //         if(key>maxkey){
    //             maxkey=key;
    //         }
    //         if(key<minkey){
    //             minkey=key;
    //         }
    //     }
    //     System.out.println("Minkey : "+minkey+" Maxkey :"+maxkey);
    //     int a=hashmap.get(minkey);
    //     int b=hashmap.get(maxkey);
    //     System.out.println("minkey total values : "+a+" maxkey total vaues : "+b);
    //     int total=a+b;
    //     System.out.println("Total value : "+total);
    //     int avg=(minkey*a+maxkey*b)/total;
    //     System.out.println(avg);
     }
}