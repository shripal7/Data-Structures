package Trees;


class Node
{
	Node left;
	Node right;
	int key;
	Node(int d)
	{
		left = right = null;
		key = d;

	}
}


public class Traversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(2);
		root.left= new Node(1);
		root.right = new Node(3);

		System.out.println(new Traversal().traversal(root));

		System.out.println(new Traversal().isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE));

	}

	int traversal(Node n)
	{
		if(n == null)
		{
			System.out.println("checker");
			return 0;
			
		}
		int left = traversal(n.left);
		int right = traversal(n.right);
		if(left>right)
			return (left+1);
		else
			return (right+1);
	}

	boolean isValidBST(Node root, long min, long max) {
		if(root == null)
			return true;
		if(root.key < min || root.key > max)
			return false;
		return  isValidBST(root.left, min, root.key) && isValidBST(root.right, root.key, max);


	}
}




