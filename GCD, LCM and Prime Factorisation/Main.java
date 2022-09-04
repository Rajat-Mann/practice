import java.io.*;
import java.util.*;

class Main{

    public static int gcd(int a,int b){ 

        int rem=a%b;
        while(a%b!=0){
            rem=a%b;
            a=b;
            b=rem;
        }
        return b;
    }
    public static void primeFactors(int n)
    {
        int temp=n;
        for(int i=2;i<temp;i++)
        {
            // System.out.println("i: "+i);
            
            while(n%i==0)
            {
                System.out.print(i+", ");
                n=n/i;
            }
        }
        System.out.print(1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1,n2;
        System.out.println("Enter two number to find their GCD");
        n1=sc.nextInt();
        n2=sc.nextInt();
        int gcd=gcd(n1, n2);
        int lcm=0; // gcd*lcm=n1*n1
        lcm=(n1*n2)/gcd;
        System.out.println("GCD : "+gcd+" LCM : "+lcm);
        System.out.println("Enter number to find the prime factors");
     
        n1=sc.nextInt();
        primeFactors(n1);
        

    }
}