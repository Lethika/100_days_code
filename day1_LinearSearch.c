#include<stdio.h>
int main(){
	int i,n,a,count=0;
	printf("enter the no of elements in the array: \n");
	scanf("%d",&n);
	int array[n];
	printf("enter the numbers in the array: \n");
	for(i=0;i<n;i++){
		scanf("%d",&array[i]);
	}
	printf("enter the search element\n");
	scanf("%d",&a);
	for(i=0;i<n;i++){
		if(a==array[i]){
			printf("%d element found at the position %d,\n",a,i+1);
			count++;
		}
	
	}
	if(count==0){
		printf("element not present in the array");
	}
	return 0;
}
	

