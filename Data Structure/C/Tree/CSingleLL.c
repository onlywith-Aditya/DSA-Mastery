#include <stdio.h>
#include <stdlib.h>

// Define the node structure.
struct Node
{
    int data;
    struct Node *next;
};

int main()
{
    // Create initial nodes
    struct Node *head = NULL;
    struct Node *second = NULL;
    struct Node *third = NULL;

    // Memory Allocation
    head = (struct Node *)malloc(sizeof(struct Node));
    second = (struct Node *)malloc(sizeof(struct Node));
    third = (struct Node *)malloc(sizeof(struct Node));

    // Assign Data and Link Nodes
    head->data = 10;
    head->next = second;

    second->data = 20;
    second->next = third;

    third->data = 30;
    third->next = NULL;

    printf("Original list: ");
    struct Node *temp = head;
    while (temp != NULL)
    {
        printf("%d -> ", temp->data);
        temp = temp->next;
    }
    printf("NULL\n");

    // 1. Insert new node at beginning.
    printf("\nInserting 50 at beginning...\n");
    struct Node *zero = (struct Node *)malloc(sizeof(struct Node));
    zero->data = 50;
    zero->next = head;
    head = zero;

    // Print after first insertion
    printf("After inserting 50: ");
    temp = head;
    while (temp != NULL)
    {
        printf("%d -> ", temp->data);
        temp = temp->next;
    }
    printf("NULL\n");

    // 2. Insert new node at end.
    printf("\nInserting 60 at end...\n");
    struct Node *last = (struct Node *)malloc(sizeof(struct Node));
    last->data = 60;
    last->next = NULL;

    // Find the last node
    struct Node *current = head;
    while (current->next != NULL)
    {
        current = current->next;
    }
    current->next = last;

    // Print after second insertion
    printf("After inserting 60: ");
    temp = head;
    while (temp != NULL)
    {
        printf("%d -> ", temp->data);
        temp = temp->next;
    }
    printf("NULL\n");

    // 3. Insert new node after specific value (30)
    printf("\nInserting 101 after 30...\n");
    struct Node *mid = (struct Node *)malloc(sizeof(struct Node));
    mid->data = 101;

    struct Node *trav = head;
    int found = 0;

    while (trav != NULL)
    {
        if (trav->data == 30)
        {
            mid->next = trav->next;
            trav->next = mid;
            found = 1;
            break; // Exit after insertion
        }
        trav = trav->next;
    }

    if (!found)
    {
        printf("Value 30 not found for insertion\n");
    }

    // Print after third insertion
    printf("After inserting 101: ");
    temp = head;
    while (temp != NULL)
    {
        printf("%d -> ", temp->data);
        temp = temp->next;
    }
    printf("NULL\n");

    // 4. Delete the Node (FIXED)
    printf("\nDeleting node with value 60...\n");
    int del = 60;
    struct Node *prev = NULL;
    struct Node *x = head;
    int deleted = 0;

    // Handle case when deleting head node
    if (x != NULL && x->data == del)
    {
        head = x->next;
        free(x);
        deleted = 1;
    }
    else
    {
        // Search for node to delete
        while (x != NULL && x->data != del)
        {
            prev = x;
            x = x->next;
        }

        // If node found
        if (x != NULL)
        {
            prev->next = x->next;
            free(x);
            deleted = 1;
        }
    }

    if (deleted)
    {
        printf("Successfully deleted %d\n", del);
    }
    else
    {
        printf("Value %d not found in list\n", del);
    }

    // 5. Final Printed Linked List
    printf("\nFinal linked list: ");
    temp = head;
    while (temp != NULL)
    {
        printf("%d -> ", temp->data);
        temp = temp->next;
    }
    printf("NULL\n");

    // 6. Free all allocated memory
    printf("\nFreeing memory...\n");
    temp = head;
    while (temp != NULL)
    {
        struct Node *to_free = temp;
        temp = temp->next;
        free(to_free);
    }

    return 0;
}