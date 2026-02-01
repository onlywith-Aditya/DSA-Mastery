#include<stdio.h>
#include<stdlib.h>

// Tree Node-> Structure 
struct Node
{
    int data;
    struct Node* left;
    struct Node* right;
};

// Function Creation-> Create Node
struct Node* createNode(int value){
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode-> data = value;
    newNode-> left = NULL;
    newNode-> right = NULL;
    return newNode;
}

// Function for "PreOrder" Traversal.
void PreOrder(struct Node* root){
    if(root != NULL){
        printf(" %d ", root-> data);
        PreOrder(root-> left);
        PreOrder(root-> right);
    }
}

// Function for "InOrder" Traversal.
void InOrder(struct Node* root){
    if(root != NULL){
        InOrder(root-> left);
        printf(" %d ", root-> data);
        InOrder(root-> right);
    }
}

// Function for "PostOrder" Traversal.
void PostOrder(struct Node* root){
    if(root != NULL){
        PostOrder(root-> left);
        PostOrder(root-> right);
        printf(" %d ", root-> data);
    }
}



// Main Fuction
int main(){
    
// Declartikon is verbose, without "typedef"
struct Node* root = createNode(1);
root-> left = createNode(3);
root-> left-> left = createNode(2);
root-> left-> right = createNode(4);
root-> right = createNode(5);
root-> right->right = createNode(8);


// Print Pre, In , & Post Order.
printf("PreOrder: \n");
PreOrder(root);
printf("\nInOrder: \n");
InOrder(root);
printf("\nPostOrder: \n");
PostOrder(root);

// Free Memory
free(root-> left);
free(root-> right);
free(root);

return 0;

}
