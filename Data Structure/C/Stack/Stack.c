// #include <stdio.h>
// #include <stdlib.h>
// #include <stdbool.h>

// #define MAX_SIZE 100

// // Structure for Stack
// typedef struct {
//     int arr[MAX_SIZE];
//     int top;
// } Stack;

// // 1. Initialize Stack
// void initStack(Stack *s) {
//     s->top = -1;  // Empty stack
// }

// // 2. Check if Stack is Empty
// bool isEmpty(Stack *s) {
//     return s->top == -1;
// }

// // 3. Check if Stack is Full
// bool isFull(Stack *s) {
//     return s->top == MAX_SIZE - 1;
// }

// // 4. Push Operation (Add element)
// void push(Stack *s, int value) {
//     if (isFull(s)) {
//         printf("Stack Overflow! Cannot push %d\n", value);
//         return;
//     }
//     s->top++;
//     s->arr[s->top] = value;
//     printf("Pushed %d to stack\n", value);
// }

// // 5. Pop Operation (Remove element)
// int pop(Stack *s) {
//     if (isEmpty(s)) {
//         printf("Stack Underflow! Cannot pop\n");
//         return -1;  // Error value
//     }
//     int value = s->arr[s->top];
//     s->top--;
//     printf("Popped %d from stack\n", value);
//     return value;
// }

// // 6. Peek/Top Operation (View top element)
// int peek(Stack *s) {
//     if (isEmpty(s)) {
//         printf("Stack is empty!\n");
//         return -1;
//     }
//     return s->arr[s->top];
// }

// // 7. Display Stack
// void display(Stack *s) {
//     if (isEmpty(s)) {
//         printf("Stack is empty!\n");
//         return;
//     }
    
//     printf("Stack (top to bottom): ");
//     for (int i = s->top; i >= 0; i--) {
//         printf("%d ", s->arr[i]);
//     }
//     printf("\n");
// }

// // 8. Get Stack Size
// int size(Stack *s) {
//     return s->top + 1;
// }

// // 9. Clear Stack
// void clear(Stack *s) {
//     s->top = -1;
//     printf("Stack cleared\n");
// }

// // Main function to test stack operations
// int main() {
//     Stack s;
//     initStack(&s);
    
//     int choice, value;
    
//     do {
//         printf("\n===== STACK OPERATIONS =====\n");
//         printf("1. Push\n");
//         printf("2. Pop\n");
//         printf("3. Peek\n");
//         printf("4. Display\n");
//         printf("5. Check Empty\n");
//         printf("6. Check Full\n");
//         printf("7. Get Size\n");
//         printf("8. Clear Stack\n");
//         printf("9. Exit\n");
//         printf("Enter your choice: ");
//         scanf("%d", &choice);
        
//         switch(choice) {
//             case 1:
//                 printf("Enter value to push: ");
//                 scanf("%d", &value);
//                 push(&s, value);
//                 break;
                
//             case 2:
//                 value = pop(&s);
//                 if (value != -1) {
//                     printf("Popped value: %d\n", value);
//                 }
//                 break;
                
//             case 3:
//                 value = peek(&s);
//                 if (value != -1) {
//                     printf("Top element: %d\n", value);
//                 }
//                 break;
                
//             case 4:
//                 display(&s);
//                 break;
                
//             case 5:
//                 if (isEmpty(&s)) {
//                     printf("Stack is empty\n");
//                 } else {
//                     printf("Stack is not empty\n");
//                 }
//                 break;
                
//             case 6:
//                 if (isFull(&s)) {
//                     printf("Stack is full\n");
//                 } else {
//                     printf("Stack is not full\n");
//                 }
//                 break;
                
//             case 7:
//                 printf("Stack size: %d\n", size(&s));
//                 break;
                
//             case 8:
//                 clear(&s);
//                 break;
                
//             case 9:
//                 printf("Exiting...\n");
//                 break;
                
//             default:
//                 printf("Invalid choice!\n");
//         }
//     } while (choice != 9);
    
//     return 0;
// }


#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

#define MAX_SIZE 10  // Fixed: Removed = sign

// Create a structure for stack - Fixed: Added typedef
typedef struct {
    int arr[MAX_SIZE];
    int top;
} Stack;

// Initialize Stack
void initStack(Stack *s) {
    s->top = -1;
}

// Check if Stack is Empty
bool isEmpty(Stack *s) {
    return s->top == -1;
}

// Check if Stack is Full
bool isFull(Stack *s) {
    return s->top == MAX_SIZE - 1;
}

// Push operation
void push(Stack *s, int value) {  // Fixed: Added int before value
    // Check overflow
    if (isFull(s)) {
        printf("Overflow! Cannot push %d\n", value);
        return;
    }
    s->top++;
    s->arr[s->top] = value;
    printf("Pushed: %d\n", value);
}

// Pop operation
int pop(Stack *s) {  // Fixed: Changed return type to int
    // Check underflow
    if (isEmpty(s)) {
        printf("Underflow! Cannot pop\n");
        return -1;
    }
    int value = s->arr[s->top];
    s->top--;
    printf("Popped: %d\n", value);
    return value;
}

// Peek operation
int peek(Stack *s) {
    if (isEmpty(s)) {
        printf("Stack is empty!\n");
        return -1;
    }
    return s->arr[s->top];
}

// Display Stack
void display(Stack *s) {
    if (isEmpty(s)) {
        printf("Stack is empty!\n");
        return;
    }
    
    printf("Stack (top to bottom): ");
    for (int i = s->top; i >= 0; i--) {
        printf("%d ", s->arr[i]);
    }
    printf("\n");
}

// Clear Stack
void clear(Stack *s) {
    s->top = -1;
    printf("Stack cleared\n");
}

int main() {  // Fixed: Changed void main() to int main()
    Stack s;
    initStack(&s);

    // Testing stack operations
    printf("Is empty? %s\n", isEmpty(&s) ? "Yes" : "No");
    
    push(&s, 10);
    push(&s, 20);
    push(&s, 30);
    push(&s, 40);
    
    printf("Is empty? %s\n", isEmpty(&s) ? "Yes" : "No");
    printf("Is full? %s\n", isFull(&s) ? "Yes" : "No");
    
    push(&s, 50);
    push(&s, 60);
    push(&s, 70);
    push(&s, 80);
    push(&s, 90);
    push(&s, 100);
    
    printf("Is full? %s\n", isFull(&s) ? "Yes" : "No");
    
    // Try to push when full (should show overflow)
    push(&s, 110);
    
    int top_value = peek(&s);
    if (top_value != -1) {
        printf("Top element: %d\n", top_value);
    }
    
    display(&s);
    
    // Pop some elements
    pop(&s);
    pop(&s);
    
    display(&s);
    
    // Clear stack
    clear(&s);
    display(&s);
    
    return 0;  // Added return statement
}