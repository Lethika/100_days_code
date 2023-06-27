#include<stdio.h>
int main()
{
	int i,j,n,temp,min;
	printf("enter the number of elements in array\n");
	scanf("%d",&n);
	int a[n];
	
	printf("enter the elements in array\n");
	
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	for(i=0;i<n-1;i++)
	{
		min=i;
	for(j=i+1;j<n;j++)
	{
	
	if(a[j]<a[min])
	
		min=j;
	}
	if(min!=i)
	{
	

		temp=a[i];
		a[i]=a[min];
		a[min]=temp;
	}

}
printf("sorted array is:\n");
for(i=0;i<n;i++)
	printf("%d",a[i]);
	return 0;

}
