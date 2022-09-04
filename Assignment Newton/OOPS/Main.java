import java.io.*;
import java.util.*;
class Main{
    
static class Student
{
    String name;
    int eng;
    int math;
    int hindi;
    Student(String name,int eng,int math,int hindi){
        this.name=name;
        this.eng=eng;
        this.math=math;
        this.hindi=hindi;
    }
    //Enter your code here
}

static Student[] createStudentArray(int n)
    {
        Student st[]=new Student[n];
        //Student st[n];
        
        for(int i=0;i<n;i++)
        {
            System.out.print("hello");
            //Scanner in=new Scanner(System.in);
            String name;
            int eng,math,hindi;
          /*  name=in.next();
            eng=in.nextInt();
            math=in.nextInt();
            hindi=in.nextInt();
            System.out.println("name : "+name);
            */
            
           String input;
            input=System.console().readLine();
            String[] inputValue=input.split(" ");
            name=inputValue[0];
            eng=Integer.parseInt(inputValue[1]);
            math=Integer.parseInt(inputValue[2]);
            hindi=Integer.parseInt(inputValue[3]);
            
        
            st[i]=new Student(name, eng, math, hindi);
            //in.close();
        }

       //Enter your code here
       return st;
    }
    
    static int engAverage(Student st[], int n)
    {
        //Enter your code here
        int sum=0;
        double avg=0;
        for(int i=0;i<n;i++){
            sum+=st[i].eng;
        }
        avg=Math.floor(sum/(double)n);
        int average;
        average=(int)avg;
        return average;

    }
    
    static int avgPercentageOfClass(Student st[], int n)
    {
        int averagePercentage;
        int[] sum=new int[n];
        
        for(int i=0;i<n;i++){
            sum[i]=(st[i].eng+st[i].math+st[i].hindi)/3;
        }
        int total=0;
        double avg;
        for(int i=0;i<n;i++){
            total+=sum[i];
        }
        avg=Math.floor(total/(double)n);
        averagePercentage=(int)avg;
        return averagePercentage;
        //Enter your code here
        
    }

    public static void main(String[] args) 
    {
        int n;
        //Scanner sc=new Scanner(System.in);
        n=inputclass.in.nextInt();
      //  sc.close();
        Student[] st=new Student[n];
        
        st=createStudentArray(n);
        int avg=engAverage(st, n);
        int avgPercentage=avgPercentageOfClass(st, n);
        System.out.println(avg);
        System.out.println(avgPercentage);

    }
}
class inputclass
{
    static Scanner in = new Scanner(System.in);
}