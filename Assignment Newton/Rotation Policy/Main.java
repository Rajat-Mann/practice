import java.io.*;
import java.util.*;
class Main{
    


    public static void main(String[] args) {
        int ans;
        int A,B;
        A=3;
        B=8;

        ans=RotationPolicy(A, B);
       // System.out.println(ans);
       // System.out.println(countToWeekDay(5));
        func("hello world");

    }
    static void func(String str){
        String[] res=str.split(" ");
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
        
    }
    static int RotationPolicy(int A, int B)
    {
        //Enter your code here
        int week,count=0;
        week=countWeeks(A,B);
        if(week==1)
        {
           count = countDays1Week(A,B);
           return count;
        }
        else
        {
            count=(week-1)*2;//full weeks
            int a=(week-1)*7;//starting 
            count+=countDays1Week(a+1,B);
            return count;
        }
       // return -1;
        //return count;
        }
    
        
        
        static int countToWeekDay(int x){
            int count=0;
            for(int i=1;i<=7&&i<=x;i++){
                if(i==2||i==6)
                {
                count++;
                }
            }
            return count;
        }
        
        
        static int countDays1Week(int A,int B){
            int x=B-A;
            x=x+1;
            int count=0;
            count=x/7+countToWeekDay(x);
            return count;
        }
        
        static int countWeeks(int x,int y)
        {
            int count=0;
            for(int i=x;i<=y;i=i+7){
                count++;
            }
            return count;
        }
}