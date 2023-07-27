#include<stdio.h>
int f=-1,r=-1,n=100;
int q[100];
void enqueue(int x){
	if(r>=n){
		printf("\nqueue overflow");
	}
	else{
		f=0;
		r++;
		q[r]=x;
		printf("\n queue is enqueue %d",q[r]);
	}
}
void dequeue()
{
	printf("\n element dequeued is %d",q[f]);
	f++;
}
int main(){
	enqueue(10);
	enqueue(20);
	enqueue(30);
	enqueue(40);
	enqueue(50);
	dequeue();
	dequeue();
	enqueue(1);
	
	
}
