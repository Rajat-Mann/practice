public class Maths {
    public static int add(int a,int b) {
        return a+b;
    }

    public static void singleDigitSumConvert(int n){
        int temp=n;
        int result=0;

        while(result>=0){
            result=digitSum(temp);
            if(countDigits(temp)==1){
                System.out.print(temp);
                return;
            }
            else{
                temp=result;
            }
        }
    }

    public static int countDigits(int n){

        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        return count;
    }

    public static int digitSum(int n){
        int temp=0,sum=0;
        while(n>0){
            temp=n%10;
            sum=sum+temp;
            n=n/10;
        }
        return sum;
    }
}
