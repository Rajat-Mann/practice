import java.io.*;
import java.util.*;

class Main{
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
     {
        
        
        int T=sc.nextInt();
        while(T>0){
            int[] arr=inputArray();
            quickSort(arr, 0, arr.length-1);
            print1DArray(arr);
            T--;
        }
        
    }

    public static void quickSort(int[] arr, int l, int r) {
        if (l >= r) return;
        int pivot = arr[r];
        int pi = partitionIndex(arr, pivot, l, r);
        quickSort(arr, l, pi - 1);
        quickSort(arr, pi + 1, r);
    }
    public static int partitionIndex(int[] arr, int pivot, int l, int r) {
        int i = l;
        int j = l;
        while (i <= r) {
            if (arr[i] <= pivot) {
                swapArrayElement(arr, i, j);
                i++;
                j++;
            } else {
                i++;
            }
        }
        return j - 1;
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