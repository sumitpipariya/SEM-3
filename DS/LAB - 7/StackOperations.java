import java.util.Scanner;

class Stack {
     int maxSize;
     int[] stackArray;
     int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full. Cannot push " + value);
        } else {
            stackArray[++top] = value;
            System.out.println("Pushed " + value);
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack is empty. Cannot pop");
        } else {
            System.out.println("Popped " + stackArray[top--]);
        }
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stackArray[i]);
            }
        }
    }

    public void peep(int position) {
        if (top - position + 1 < 0) {
            System.out.println("Invalid position");
        } else {
            System.out.println("Element at position " + position + " is " + stackArray[top - position + 1]);
        }
    }

    public void change(int position, int newValue) {
        if (top - position + 1 < 0) {
            System.out.println("Invalid position");
        } else {
            stackArray[top - position + 1] = newValue;
            System.out.println("Changed element at position " + position + " to " + newValue);
        }
    }
}

public class StackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the stack: ");
        int size = scanner.nextInt();
        Stack stack = new Stack(size);

        while (true) {
            System.out.println("\nStack Operations Menu:");
            System.out.println("1. PUSH");
            System.out.println("2. POP");
            System.out.println("3. DISPLAY");
            System.out.println("4. PEEP");
            System.out.println("5. CHANGE");
            System.out.println("6. EXIT");
            System.out.print("Choose an operation: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a value to push: ");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    System.out.print("Enter the position to peep: ");
                    int position = scanner.nextInt();
                    stack.peep(position);
                    break;
                case 5:
                    System.out.print("Enter the position to change: ");
                    position = scanner.nextInt();
                    System.out.print("Enter the new value: ");
                    int newValue = scanner.nextInt();
                    stack.change(position, newValue);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid operation.");
            }
        }
    }
}
