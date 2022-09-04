import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
					  Scanner sc=new Scanner(System.in);
					  String str=sc.next();
					 // Palindrome(str);
                     palindromOptimised(str);
	}
	public static void Palindrome(String str){
		String res="";
		for(int i=str.length()-1;i>=0;i--)
		{
			res+=str.charAt(i);
		}
		if(res.equals(str)){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
	}
    public static void palindromOptimised(String str){
        int i=0;
        int j=str.length()-1;
        while(str.charAt(i)!=str.charAt(j)){
            System.out.println("0");
            return;
        }
        System.out.println("1");
    }
    import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
					   Scanner sc=new Scanner(System.in);
					  String str=sc.next();
					  printOdd(str);
	}
	public static void printOdd(String str){
		for(int i=0;i<str.length();i++){
			if(i%2!=0) continue;
			System.out.print(str.charAt(i)+" ");
		}
	}
}
}
