#include<stdio.h>
int main(){
	int i,j,c=1;
	int a[]={1,2,3,4,6,7,8,9,10};
	int length = sizeof(a) / sizeof(a[0]);
	for(i=0;i<length;i++){
		if(a[i]-a[i-1]!=1){
			c=a[i-1]+1;
			printf("%d is missing",c);
		}
			}
		}
		
	
