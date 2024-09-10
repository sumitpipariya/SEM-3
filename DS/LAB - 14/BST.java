public class BST{
	public static void main(String[] args) {
		BinarySerachTree bs = new BinarySerachTree();
		bs.insert(20);
		bs.insert(5);
		bs.insert(40);
		bs.insert(10);
		bs.insert(1);
		bs.insert(6);
		bs.inOrder();
		
		bs.DeleteNode(bs.root,10);
		bs.inOrder();
	}
}

class TreeNode{

	int key;
	TreeNode left;
	TreeNode right;

	public TreeNode(int value){
		this.key = value;
		this.left = null;
		this.right = null;
	}
}

class BinarySerachTree{

	TreeNode root;
	public BinarySerachTree(){
		root = null;
	}

	void insert(int value){
		root = insertRecord(root,value);
	}	

	public TreeNode insertRecord(TreeNode root, int value){
		if(root == null){
			root = new TreeNode(value);
			return root;
		}
		if(value < root.key){
			root.left = insertRecord(root.left,value);
		}
		else if(value > root.key){
			root.right = insertRecord(root.right,value);
		}
		return root;
	}

	public void inOrder(){
		inOrderRec(root);
		System.out.println();
	}
	
	public void inOrderRec(TreeNode root){
		if(root != null){
			inOrderRec(root.left);
			System.out.print(root.key + " ");
			inOrderRec(root.right);
		}
	}

	public void preOrder(){
		preOrderRec(root);
		System.out.println();
	}

	public void preOrderRec(TreeNode root){
		if(root != null){
			System.out.print(root.key + " ");
			preOrderRec(root.left);
			preOrderRec(root.right);
		}
	}

	public void postOrder(){
		postOrderRec(root);
		System.out.println();
	}

	public void postOrderRec(TreeNode root){
		if(root != null){
			postOrderRec(root.left);
			postOrderRec(root.right);
			System.out.print(root.key + " ");
		}
	}

	public TreeNode DeleteNode(TreeNode root, int key){
		if(root == null){
			return root;
		}
		if(key < root.key){
			root.left = DeleteNode(root.left, key);
		}
		else if(key > root.key){
			root.right = DeleteNode(root.right, key);
		}
		else{
			if(root.left == null){
				return root.right;
			}
			else if (root.right == null) {
				return root.left;
			}
			root.key = minValue(root.right);
			root.right = DeleteNode(root.right, root.key);
		}
		return root;
	}

	private int minValue(TreeNode root){
		int minv = root.key;
		while(root.left != null){
			minv = root.left.key;
			root = root.left;
		}
		return minv;
	}

}