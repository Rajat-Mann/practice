import java.io.*;
import java.util.*;

class Main{
    
     public static void main(String[] args) {
        
        int[] a={1,2,3,4,5};
        int[] b={0,9,5,4,9};
        int[] c={2,1,4};
       // rotateSteps(a, 22);
       // rotateStepsOptimised(a, 22);
      // reverseArray(a, 0, a.length-1);
      //  printArray(a);
     // addTwoArray(b, c);
      //subTwoArray(c,b);
     // printSecondMinAndMax(a);
     double a=3,b=2;
     double var=Math.pow(a,b);
    // Scanner scanner=new Scanner(System.in);
     //   var=scanner.nextInt();
    // int t=Maths.digitSum(var);
     //System.out.println(t);
    // Maths.singleDigitSumConvert(var);
    System.out.println(var);

     
    }
    public static void addTwoArray(int[] a,int[] b) {
        String one="";
        String two="";
       // System.out.println(sum);
       for(int i=0;i<a.length;i++){
           one=one+a[i];
       }
       for(int i=0;i<b.length;i++){
           two=two+b[i];
       }
       System.out.println(Integer.parseInt(one)+Integer.parseInt(two));    
    }

    public static void subTwoArray(int[] a,int[] b) {
        String one="";
        String two="";
       // System.out.println(sum);
       for(int i=0;i<a.length;i++){
           one=one+a[i];
       }
       for(int i=0;i<b.length;i++){
           two=two+b[i];
       }
       int x=Integer.parseInt(one);
       int y=Integer.parseInt(two);
       if (x>y)
       System.out.println(x-y); 
       else
       System.out.println(y-x);
    }
    

    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" is at "+i);
        }
    }
    public static void rotate(int[] arr){
        int temp=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
    }
    public static void rotateSteps(int[] arr,int k){
        k=k%arr.length; // because array will be same after array length times
        for(int i=0;i<k;i++){
            rotate(arr);
        }
    }

    public static void rotateStepsOptimised(int[] arr,int k){

        int st;
        k=k%arr.length;
        st=arr.length-k;
        
        reverseArray(arr, 0, st-1);
        reverseArray(arr, st, arr.length-1);
        reverseArray(arr, 0, arr.length-1);
    }

    public static void swapArrayElement(int[] arr,int a,int b){
        int temp;
        temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void reverseArray(int[] arr,int s,int e){
        
        while (s<=e){
            swapArrayElement(arr, s, e);
            s++;
            e--;
        }    
    }
    public static void printSecondMinAndMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                smax = max;
                max = arr[i];
            } else if (arr[i] > smax) {
                smax = arr[i];
            }
        }
        System.out.println("Second max is " + smax);
        int min = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= min) {
                smin = min;
                min = arr[i];
            } else if (arr[i] < smin) {
                smin = arr[i];
            }
        }
        System.out.println("Second min is " + smin);
    }

}