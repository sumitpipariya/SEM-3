public class CopyLinkedList{

	public static void main(String[] args) {
		LinkedListDemo ll = new LinkedListDemo();
		ll.insertNode(11);
		ll.insertNode(12);
		ll.insertNode(13);
		ll.insertNode(14);
		ll.insertNode(15);

		ll.display();

		LinkedListDemo copiedList = ll.Copy();

		copiedList.display();

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

class LinkedListDemo{
	public Node first = null;

	public void insertNode(int data){

		Node newNode = new Node(data);
		Node temp = first;

		if(first == null){
			first = newNode;
		}
		else{
			while(temp.link != null){
				temp = temp.link;
			}
			temp.link = newNode;
		}
	}

	public LinkedListDemo Copy(){
		LinkedListDemo copylist = new LinkedListDemo();

		Node temp = first;

		while(temp != null){
			copylist.insertNode(temp.data);
			temp = temp.link;
		}

		return copylist;
	}

	public void display(){

		Node temp = first;
		while(temp != null){
			System.out.print(temp.data+"-->");
			temp = temp.link;
		}
		System.out.println("/");
	}

}

