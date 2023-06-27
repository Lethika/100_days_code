#include<stdio.h>
#include<string.h>
int main(){
	int i,j;
	char a[100];
	printf("enter the string\n");
	scanf("%s",a);
	for(i=0;i<strlen(a);i++)
	{
		
			if(a[i]>='0'&& a[i]<='9')
			{
			
				for(j=0;j<a[i]-48;j++)
				{
					printf("%c",a[i-1]);
				}
				
		}
		}
		return 0;
	}

