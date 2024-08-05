class Queue{
    int size = 5;

    Queue(int size){
        this.size = size;
    }

    int arr[] = new int[size];
    int front = -1;
    int rear = -1;
    int N = size;
    public void enqueue(int val){
        
        if(rear == N-1){
            rear = 0;
        }
        else{
            rear++;
        }
        if(front == rear){
            System.out.println("queue is overflow");
            return ; 
        }
        if(front == -1){
            front = 0;
        }
        arr[rear] = val;
    }

    public int dequeue(){

        if(front == -1){
            System.out.println("queue is underflow");
            return -1; 
        }

        int val = arr[front];
        arr[front] = 0;

        if(front == rear){
            front = rear = -1;
            return val;
        }

        if(front == N-1){
            front = 0;
        }
        else{
            front++;
        }
        return val;
    }

    public void display(){
        int i= 0;
        for (i = front; i != rear; i=(i+1)%N) {
            System.out.print(arr[i] + " ");
        }
            System.out.print(arr[i]);

    }
    
}

public class CirculerQueue {
    
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println("Delete element is : "+ q.dequeue());
        q.enqueue(4);
        q.enqueue(5);  
        System.out.println("Delete element is : "+ q.dequeue());
        q.enqueue(6);  


        q.display();

    }    
}
