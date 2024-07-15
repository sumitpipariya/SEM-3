public class LinkedList{
	public static void main(String[] args) {

		LinkedList ln = new LinkedList();
		ln.InsertAtFirst(5);
		ln.InsertAtFirst(15);

		ln.InsertAtLast(10);
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

	
	public void display(){
		Node temp = first;
		while(temp !=null){
			System.out.println(temp.info);
			temp = temp.link;
		}
	}


}