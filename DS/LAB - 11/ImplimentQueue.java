public class ImplimentQueue{
	public static void main(String[] args) {

		Queue q = new Queue();
		q.push(1);
		q.push(2);
		q.push(3); 
		q.push(4);
		q.delete();

		q.Display();

	}
}

class Node {

    int data;
    Node link;

    public Node(int data){
        this.data = data;
        this.link = null;
    } 
}

class Queue{

	Node first = null;

	public void push(int data){

		Node newNode = new Node(data);
		Node save = first;

		if(save == null){
			first = newNode;
			return;
		}

		while(save.link != null){
			save = save.link;
		}
		save.link = newNode;

	}

	public int delete(){
		Node save = first;

		if(save == null || save.link==null){
			first = null;
			return -1;
		}

		int data = first.data;  
		first = first.link ;
		return data;

	}

	public void Display(){

		Node save = first;
		while(save!=null){
			System.out.print(save.data + " ");
			save = save.link;
		}
	}
}


