import java.io.*;
import java.util.*;

class Main{
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        
        
        int T=sc.nextInt();
        while(T>0){
            int[] arr=inputArray();
            insertionSort(arr);
            T--;
        }
    }
    public static void insertionSort(int[] arr)
    {
        for(int i=1;i<arr.length;i++)
        {
            for(int j=i;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    swapArrayElement(arr, j, j-1);
                }
                else 
                {
                    break;
                }
            }
        }
        print1DArray(arr);
        
    }


    public static void print1DArray(int[] arr)
    {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    public static void swapArrayElement(int[] arr,int i,int j){
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    public static int[] inputArray(){
        int n=sc.nextInt();
        int[] newArr=new int[n];
        for(int i=0;i<newArr.length;i++){
            newArr[i]=sc.nextInt();
        }
        return newArr;
    }
}