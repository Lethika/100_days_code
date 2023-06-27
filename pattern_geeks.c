#include<stdio.h>
int main(){
	int i,j,n,k;
	printf("enter the number\n");
	scanf("%d",&n);
	for(i=n;i>=1;i--){
		for(j=n;j>=1;j--){
			for(k=1;k<=i;k++){
			
			printf("%d",j);
		}
	}
	printf("\n");
}
}
