import java.util.Scanner;
import java.util.Arrays;
//Probably the code is correct let's see what happens
//This was the most efficient code which i could write but on testing it found a pattern with which i can code it with O(1) complexity
//And the logic is as follows any even number except two can be expressed as sum of two primes 
 class InLoveWithPrime {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int testcase=scan.nextInt();
        int n;
        for(int i=0;i<testcase;i++){
            n=scan.nextInt();
            if(n==2)
                System.out.println("Arjit");
            else
                System.out.println("Deepa");
        }
    }
}