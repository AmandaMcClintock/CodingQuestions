#include <stdio.h>
#include <stdlib.h>

	struct Node{
		int data;
		struct Node *next;
	};
int main(int argc, char *argv[]){
	struct Node *head;
	head = (struct Node *) malloc(sizeof(struct Node)); 
	struct Node *traverse;
	traverse = head;

	head->data = 0;
	head->next = 0;	
	struct Node n;
	n = (struct Node *) malloc(sizeof(struct Node));
	if(traverse != 0){
		while(traverse->next != 0){
			traverse = traverse->next;
		}


	}
	
	
}