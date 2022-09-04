import java.io.*;
import java.util.*;

class Main{
    
    
    public static int getUniqueCharacter(String s) {

         
            int j;
        int[] a=new int[26];
        for(j=0;j<s.length();j++)
 	        a[s[j]-97]+=1;    
        for(j=0;j<s.length();j++)
        {
            if(a[s[j]-97]==1)
                return j;
        }
        return -1;

    
    }

    public static void main(String[] args) {
        
        String str="hackthegame";
        int n;
        n=getUniqueCharacter(str);
        System.out.print(n);

    }
}