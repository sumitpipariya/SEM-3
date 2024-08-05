public class SimpleQueue{
    public static void main(String[] args) {
        
        Queue q = new Queue(5);
        q.Enqueue(1);
        q.Enqueue(2);
        q.Enqueue(3);
        q.Enqueue(4);
        q.Dequeue();
        q.Display();

    }
}

class Queue{

    int size = 5;

    public Queue(int size){
        this.size = size;
    }

    int arr[] = new int[size];
    int front = -1;
    int rear = -1;
    int n = size;

    public void Enqueue(int val){

        if(front > n-1){
            System.out.println("Queue Overflow");
            return;
        }
        if(front == -1){
            front++;
        }
        rear++;
        arr[rear] = val;

    }

    public int Dequeue(){

        if(front == n || front == -1){
            System.out.println("Queue Underflow");
            return -1;
        }
        int val = arr[front];
        arr[front] = 0;
        front++;
        return val;

    }

    public void Display(){
        for(int i = front; i <= rear; i++){
            System.out.println(arr[i] + " ");
        }
    }

}