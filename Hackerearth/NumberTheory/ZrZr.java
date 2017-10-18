import java.io.*;
import java.util.Scanner;
public class ZrZr {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int testcase=scan.nextInt();
        long n;
        for(int i=0;i<testcase;i++){
            n=scan.nextLong();
            long result=0;
            while(n>=5){
            	n=n/5;
            	result=result+n;
            }
            System.out.println(""+result);
        }
    }
}