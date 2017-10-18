import java.util.Scanner;
import java.util.Arrays;
public class CoprCopr{
    public static void main(String args[]){
        int prime[]=new int[10000001];
        prime[1]=1;
        prime[0]=1;
        for(int i=2;i*i<=10000000;i++){
            if(prime[i]==0){
                for(int j=2;j*i<=10000000;j++){
                    prime[i*j]=1;
                }
            }
        }
        long CC[]=new long[10000001];
        for(int i=0;i<=10000000;i++){
            CC[i]=i;
        }
        for(int i=2;i<=10000000;i++){
            if(prime[i]==0){
                CC[i]=i-1;
                for(int j=2;j*i<=10000000;j++){
                    CC[j*i]=CC[j*i]-(CC[j*i]/i);
                }
            }
        }
        for(int i=1;i<=10000000;i++){
            CC[i]=CC[i]+CC[i-1];
        }
        Scanner scan=new Scanner(System.in);
        int test=scan.nextInt();
        for(int i=0;i<test;i++){
            int n=scan.nextInt();
            System.out.println(""+CC[n]);
        }
        
    }
}