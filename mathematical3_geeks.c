#include <stdio.h>

int main() {
	int i, a,r,n,gp,ans;
	printf("enter the number");
   scanf("%d",&n);
   printf("enter the first term");
   scanf("%d",&a);
   printf("enter the gross value");
   scanf("%d",&r);
   
   for(i=a;i<=n;i++){
   	gp=i*r;
   	ans=gp*r;
   	if(i==n)
   		printf("%d",ans);
	   }
   }
