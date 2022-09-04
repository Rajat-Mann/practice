import BUBBLE.add;
import java.io.*;
import java.util.*;

class Main
{
    public static void bubbleSort(int[] arr) // O(n^2)
    {   int n=arr.length;
        int temp;
        for(int i=0;i<n;i++){
            boolean swapped=false;
            for(int j=0;j<n-i-1;j++){  
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped)
                break;
        }   
    }

    public static void insertionSort(int[] arr){ //O(n^2)
        int i,j,temp;
        for(i=0;i<arr.length;i++){
            j=i;
            while(j>0 && arr[j-1]>arr[j]){
                temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j=j-1;
            }
        }
    }

    public static void countSort(int[] arr,int k) { // depends on the size of allowed elements O(n+k) k is the range of allowed elts
        //if the k is around n then the complexity will become O(n)
        // create a temp array & initialise it to 0
        
        int[] temp=new int[k+1];
        int[] output=new int[arr.length+1];

        for(int i=0;i<temp.length;i++){
            temp[i]=0;
        }
        // count the frequency of each elt
        for(int i=0;i<arr.length;i++){
            temp[arr[i]]=temp[arr[i]]+1;
           
        }
        //modify the temp array
        for(int i=1;i<k+1;i++){
            temp[i]=temp[i]+temp[i-1];
        }
        //Arrange the elts in output array according to modified temp array
        for(int i=0;i<arr.length;i++){
                output[temp[arr[i]]]=arr[i];
                temp[arr[i]]=temp[arr[i]]-1;
        }
        // output elt will be placed from 1 elt
        //Optional you can return the output array or change the original array
        for(int i=0;i<arr.length;i++){
            arr[i]=output[i+1];
        }
        
    }

    public static void main(String[] args){

        int[] arr=new int[]{2,5,6,7,3,0,2,9};
        //bubbleSort(arr);
       // insertionSort(arr);
       countSort(arr,10);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

   
}