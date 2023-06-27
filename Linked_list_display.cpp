#include<stdio.h>
#include<stdlib.h>

struct node{
	int data;
	struct node*next;
};
display(struct node *head)
{
    struct node *tmp;
    tmp = head;
    while(tmp != NULL)
    {
        printf("%d\n",tmp->data);
        tmp = tmp->next;
    }
}
int main()
{
	struct node*prev,*head,*p;
	int n,i;
	printf("enter the no of nodes\n");
	scanf("%d",&n);
	head=NULL;
	for(i=0;i<n;i++)
	{
		p=(struct node*)malloc(sizeof(struct node));
		printf("enter the elements to insert in linkedlist\n");
		scanf("%d",&p->data);
		p->next=NULL;
		if(head==NULL)
			p=head;
		
		else
			prev->next=p;
			prev=p;
		}
	 display(head);
	 return 0;
}
