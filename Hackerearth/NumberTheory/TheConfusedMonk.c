/*		Programmer Name - Abhey Rana
		Institute - Motilal Nehru National Institute Of Technology
		Registration Number - 20154015
		Program Name - The Confused Monk
*/
#include <stdio.h>
#include <stdlib.h>
#include <limits.h>
#include <string.h>
#include <math.h>
#include <ctype.h>
#include <unistd.h>
#include <signal.h>
#include <fcntl.h>
#include <sys/wait.h>
#include <time.h>
#define max(a,b) ((a>b)?a:b)
#define min(a,b) ((a<b)?a:b)

long long int c=1000000007;
long long int gcd(long long int a,long long int b){
	long long int A,B;
	if(a>b){
		A=a;
		B=b;
	}
	else{
		A=b;
		B=a;
	}
	long long int rem=1;
	while(B!=0){
	   rem=A%B;
	   A=B;
	   B=rem;
	}
	return A;
}
long long int power(long long int a,long long int b){
	long long int ans=1;
	while(b>0){
		if(b%2==1){
			ans=ans*a;
			ans=ans%c;
		}
		a=a*a;
		a=a%c;
		b=b/2;
	}
	return ans;
}
int main()
{
    int n,i;
    scanf("%d",&n);
    long long int f=1,g=1;
    long long int a[1000000];
    if(n==1){
    	scanf("%d",&n);
    	printf("%lld",power(n,n));
    }
    else{
    for(i=0;i<n;i++){
    	scanf("%lld",&a[i]);
    	a[i]=a[i]%c;
    	f=f*a[i];
    	f=f%c;
    	 if(i==1){
    		g=gcd(a[0],a[1]);
    	}
    	else if(i>1){
    		g=gcd(g,a[i]);
    	}
    }
    long long int result=power(f,g);
    printf("%lld",result);
}
}