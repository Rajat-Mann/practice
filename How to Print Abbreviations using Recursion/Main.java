// How to Print Abbreviations using Recursion
import java.io.*;
import java.util.*;

public class Main
{

    public static void solution(String str,String asf,int count,int pos)
    {
        if(pos==str.length()) //print solution
        {
            if(count==0){   //if count =0 in after final level just print the ans as it is
                System.out.println(asf);
            }
            else{
                System.out.println(asf+count); // if count!=0 then print asf+count
            }
            return;
        }
        // Yes Call because of the O/p reuired in question 
        //In yes there are 2 call 1- when count=0 and othe when count!=0
        //in both call you have to channge the value of count to 0 // in count>0 just add old string + count + new character else leave the count
        //increase the pos
        if(count>0){
            solution(str, asf+count+str.charAt(pos), 0, pos+1);
        }
        else{
            solution(str, asf+str.charAt(pos), 0, pos+1);
        }
        //NO call
        solution(str, asf, count+1, pos+1);

    }
    public static void main(String[] args)throws Exception {

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String str;
        str=br.readLine();
        solution(str,"", 0, 0);

        
    }

}