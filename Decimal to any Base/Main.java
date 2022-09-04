import java.io.*;
import java.util.*;
class Main{

    public static void decimal_to_base(int n,int b){

        int ans=0,multiplier=1,rem,temp=1,base=1;
        while(n>0){
            rem=n%10;
            ans=ans+rem*temp;
            System.out.println("x : "+ans);
            temp=base*multiplier;
            multiplier*=10;
            base*=b;
            n=n/10;

        }
        System.out.println("Result : "+ans);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,b;
        System.out.println("Enter any Number to Covert in Decimal");
        n=sc.nextInt();
        System.out.println("ENter the base digit for conversion");
        b=sc.nextInt();
        decimal_to_base(n, b);
    }
}