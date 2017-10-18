import java.util.Scanner;
import java.util.Arrays;
public class DieDie{
    public static int M=1000000007;
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int test=scan.nextInt();
        for(int i=0;i<test;i++){
            long n=scan.nextLong();
            long x=DieDie.modularExponent(2,n-1);
            long result=DieDie.modularExponent(x,M-2);
            System.out.println(""+result);
        }
    }
    public static long modularExponent(long a,long b){
        long result=1;
        while(b>0){
            if(b%2==1){
                result=result*a;
                result=result%M;
            }
            a=a*a;
            a=a%M;
            b=b/2;
        }
        return result;
    }
}