public class LinkedList{
	public static void main(String[] args) {

		LinkedList ln = new LinkedList();
		ln.InsertAtFirst(5);
		ln.InsertAtLast(20);
		ln.InsertAtOrdered(10);
		ln.InsertAtOrdered(30);

		ln.DeleteNode(5);
		ln.display();

	}

	public class Node{
		int info;
		Node link;

		public Node(int data){
			this.info = data;
			this.link = null;
		}
	}

	public Node first = null;

	public void InsertAtFirst(int data){
		Node newNode = new Node(data);

		if(first == null){
			first = newNode;
			return;
		}

		newNode.link = first;
		first = newNode;
	}

	public void InsertAtLast(int data){
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

	public void InsertAtOrdered(int data){
		Node newNode = new Node(data);
		Node save = first;

		if(first == null){
			first = newNode;
			return;
		}

		if(newNode.info <= save.info){
			newNode.link = first;
			first = newNode;
			return;
		}

		
		while(save.link != null && newNode.info >= save.link.info){
			save = save.link;
		}
		newNode.link = save.link;
		save.link = newNode;
	}

	public void DeleteNode(int data){
		Node newNode = new Node(data);
		Node save = first;
		Node temp = null;

		if(first == null){
			System.out.println("Empty Node");
			return;
		}

		if(save.info == data){
			first = save.link;
			return;
		}

		while(save != null && save.info != data){
			temp = save;
			save = save.link;
		}

		if(save == null){
			System.out.println("Node Not Found ");
			return;
		}
		temp.link = save.link;

	}
	
	public void display(){
		Node temp = first;
		while(temp !=null){
			System.out.println(temp.info);
			temp = temp.link;
		}
	}


}