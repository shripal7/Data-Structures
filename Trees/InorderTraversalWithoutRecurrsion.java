import java.util.Stack;

public class InorderTraversalWithoutRecurrsion {

	Node root;

	void inorder()
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

			current = stack.pop();
			System.out.println(" "+current.key);

			if(current.right !=null) {
				System.out.println("checker"+current.key);
				current = current.right;
				while(current != null)
				{
					stack.push(current);
					current = current.left;
				}
			}

		}

	}

	public static void main(String[] args) {
		InorderTraversalWithoutRecurrsion tree = new InorderTraversalWithoutRecurrsion();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.inorder();
	}

}
