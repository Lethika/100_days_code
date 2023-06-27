#include<stdio.h>
int main()
{
	int i,n,mid,key,low,high;
	
	int array[n];
	printf("enter the no of elements in array\n");
	scanf("%d",&n);
	printf("enter the numbers in ascending order\n");
	for(i=0;i<n;i++){
		scanf("%d",&array[i]);
	}
	printf("enter the element to search");
	scanf("%d",&key);
	low=0;
	high=n-1;
	mid= (low+high)/2;
	while(low<=high)
	{

		if(array[mid]>key)
		{
			high=mid-1;
			mid=(low+high)/2;
			
		}
		else if(key==array[mid])
		{
			printf("%d element found at %d",key,mid+1);
		
			break;
			
		}
		else if(array[mid]<key)
		{
			low=mid+1;
			mid=(low+high)/2;
			
	}
		
	}
	
	return 0;
}
	
