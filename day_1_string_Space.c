#include<stdio.h>
#include<string.h>
int main(){
	int i,j;
	char a[100];
	printf("enter a string \n");
	gets(a);
	for(i=0;a[i];i++){
		if(a[i]==' ' && a[i+1]==' '){
			for(j=i;a[j];j++){
			
			a[j]=a[j+1];
		}
		i--;
		}
	}
	printf("%s",a);
}
