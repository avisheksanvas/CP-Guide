/*
Given a prime number X, you need to give the count of all numbers in range 1 to 10^6 inclusive which 
have minimum prime factor X. 
*/
import java.util.Scanner;
import java.util.Arrays;
public class AnshuAndPrime {
    public static void main(String args[]){
        Scanner scan =new Scanner(System.in);
        int testcase=scan.nextInt();
        int prime[]=new int[1000001];
        Arrays.fill(prime,1);
        int count;
        prime[0]=0;
        prime[1]=0;
        for(int i=2;i*i<1000001;i++){
            count=1;
            if(prime[i]==1){
                for(int j=i*i;j<1000001;j=j+i){
                    if(prime[j]!=0){
                        
                    prime[j]=0;
                    count++;
                  }
                }
                prime[i]=count;
            }
        }
        int num;
        for(int i=0;i<testcase;i++){
            num=scan.nextInt();
            if(prime[num]!=0){
                System.out.println(""+prime[num]);
            }
            else 
                System.out.println("0");
        }
    }
}
