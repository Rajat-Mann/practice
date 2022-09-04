import java.io.*;
import java.util.*;

class Main{
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        
        
        int T=sc.nextInt();
        while(T>0){
            int[] arr=inputArray();
            
            int[] newArr=mergeSort(arr, 0, arr.length-1);
            print1DArray(newArr);
            T--;
        }
    }
    public static int[] mergeSort(int[] arr,int l,int r)
    {   if(l==r) return new int[]{arr[l]};
        int mid=(l+r)/2;
        int a[]=mergeSort(arr, l, mid);
        int b[]=mergeSort(arr, mid+1, r);
        return mergeTwoSortedArray(a, b);
    }
    public static int[] mergeTwoSortedArray(int[] a,int[] b){
        int ai=0;
        int bi=0;
        int k=0;
        int[] c=new int[a.length+b.length];
        while(ai<a.length&&bi<b.length)
        {
            if(a[ai]<b[bi])
            {
                c[k]=a[ai];
                ai++;
                k++;
            }
            else{
                c[k]=b[bi];
                bi++;
                k++;
            }
        }
        //for remaining elements in array a
        while(ai<a.length){
            c[k]=a[ai];
            k++;
            ai++;
        }
        //for remaining elements of array b
        while(bi<b.length){
            c[k]=b[bi];
            bi++;
            k++;
        }
        return c;
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