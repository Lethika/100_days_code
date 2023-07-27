#include<stdio.h>
int n =100, a[100];
int top =-1;
void push(int x){
	if(top==n){
		printf("stack overflow");
	}
	else{
		top++;
		a[top]=x;
		printf("%d\n",a[top]);
	}
}
	void pop(){
		if(top ==-1){
			printf("stack underflow");
		}
		else{
			printf("element popped is %d\n",a[top]);
			top--;
		}
	}
	void peek(){
		printf("top element in the stack is %d\n",a[top]);
	}
	int main(){
		push(5);
		push(10);
		push(15);
		push(1);
		pop();
		pop();
		peek();
		return 0;
	}

