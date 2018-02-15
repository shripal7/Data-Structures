import java.util.ArrayList;
import java.util.Stack;

public class IterativePostOrderTraversal {

	Node root;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IterativePostOrderTraversal tree = new IterativePostOrderTraversal();

		// Let us create trees shown in above diagram
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);

		//ArrayList<Integer> mylist = 
		tree.postOrder(tree.root);
		//	          
		//	        System.out.println("Post order traversal of binary tree is :");
		//	        System.out.println(mylist);

	}

	void postOrder(Node root)
	{
		if(root == null)
			return;
		Node current = root;
		Stack<Node> stack = new Stack<Node>();
		while(current != null)
		{
			stack.push(current);
			current = current.left;
		}

		while(stack.size() > 0)
		{
			if( current.right != null)
			{
				
				current = current.right;
				while(current != null)
				{
					stack.push(current);
					current = current.left;
				}
			}
			current = stack.pop();
			System.out.println(current.key+" ");
			
		}
	}

}
