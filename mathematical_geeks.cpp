#include<stdio.h>
int main(){
	int i,n,mult;
	int result[100];
	scanf("%d",&n);
	int a[10];
	for(i=1;i<=10;i++){
		mult=i*n;
		result[i]=mult;
		printf("%d ",result[i]);
	}
}
