public class ReversLinkedList{

	public static void main(String[] args) {
		
		LinkesList ln = new LinkesList();
		ln.InsertNode(10);
		ln.InsertNode(20);
		ln.InsertNode(30);
		ln.InsertNode(40);
		ln.InsertNode(50);

		ln.Display();

		LinkesList revers = ln.Revers();

		revers.Display();

	}

}

class Node{

	int data;
	Node link;

	public Node(int data){
		this.data = data;
		this.link = null;
	}
}

class LinkesList{

	public Node first = null;

	public void InsertNode(int data){

		Node newnode = new Node(data);

		if(first == null){
			first = newnode;
			return;
		}
		newnode.link = first;
		first = newnode;
	}

	public LinkesList Revers(){

		LinkesList ll = new LinkesList();

		Node temp = first;

		while(temp != null){
			ll.InsertNode(temp.data);
			temp = temp.link;
		}
		return ll;

	}

	public void Display(){
		Node temp = first;
		while(temp != null){
			System.out.print(temp.data + "-->");
			temp = temp.link;
		}
		System.out.println("/");
	}

}