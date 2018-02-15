package Trees;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<List<Integer>> levelOrder(Node root) {

		List<List<Integer>> list = new ArrayList<>();

		Queue<Node> q = new LinkedList();
		q.add(root);
		while(q.size() != 0)
		{
			Node dev = q.poll();
			if(dev.left != null)
				q.add(dev.left);
			if(dev.right != null)
				q.add(dev.right);

		}
		return list;
	}
}
