package Trees;

public class MinValueBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(2);
		root.left= new Node(1);
		root.right = new Node(3);
		root.left.left = new Node(0);
		root.right.left = new Node(-2);
		root.right.right =  new Node(-1);
		root.right.right.left = new Node(-25);
		
		System.out.println(new MinValueBST().minValue(root));
	}
	
	public int minValue(Node n)
	{
		int left, right;
		if(n == null)
			return -1;
		if(n.left != null)
			left = minValue(n.left);
		else 
			left = n.key;
		if(n.right != null)
			right = minValue(n.right);
		else
			right = n.key;
		
		if(left < right)
			return left;
		else
			return right;
		
		
	}

}
