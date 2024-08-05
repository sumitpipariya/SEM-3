import java.util.*;
//. Write a program to implement queue using singly linked list.

//create a node class
class Node {
    int data;
    Node link;

    public Node(int data){
        this.data = data;
        this.link = null;
    } 
}

class Queue{
	//initialize first with null
	Node first=null;

	//implement a push method 
	public void push(int x){
		Node newNode = new Node(x);
		Node save = first;
		//first is null
		if(save == null){
			first=newNode;
			return;
		}

		//goes to last node 
		while(save.link!=null){
			save = save.link;
		}

		//In last node push a newNode  
		save.link = newNode;

	}

	//implement a pop method 
	public int delete(){
		Node save = first;
		//first is null then
		if(save == null || save.link==null){
			first=null;
			return -1;
		}

		//In last delete node
		int data = first.data;  
		first = first.link ;
		return data;

	}

	//print a stack
	public void printQueue()
	{
		Node save = first;
		while(save!=null){
			System.out.print(save.data + " ");
			save=save.link;
		}
	}
}
public class Lab_11b{
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.push(2);
		queue.push(3);
		queue.push(4);
		queue.delete();

		queue.printQueue();

	}
}