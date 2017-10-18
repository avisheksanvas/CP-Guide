import java.util.Scanner;
import java.util.Arrays;
import java.math.BigInteger;
 class TestClass {
    public static void main(String args[] ) throws Exception {
     Scanner scan=new Scanner(System.in);
     int test=scan.nextInt();
     for(int i=0;i<test;i++){
     	int a=scan.nextInt();
     	int b=scan.nextInt();
     	int c=scan.nextInt();
     	int n=scan.nextInt();
     	int number[]=new int[n];
     	if(n==1){
     	  if(a==0)
     	    System.out.println("YES");
     	  else
     	    System.out.println("NO");
     	}
     	else{
     	number[0]=a;
     	number[1]=b;
     	for(int j=2;j<n;j++){
     		number[j]=(number[j-1]*c+number[j-2])%10;
     	}
     	int A=(number[0]*10+number[1])%41;
        for(int j=2;j<n;j++){
        	A=(A*10+number[j])%41;
        }
        if(A==0)
           System.out.println("YES");
        else
           System.out.println("NO");
      }
     }
    }
}