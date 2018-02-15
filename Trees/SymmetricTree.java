package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import javax.management.Query;

public class SymmetricTree {

	public static void main(String[] args) {

		Node root = new Node(1);
		root.left= new Node(2);
		root.right = new Node(2);
		root.left.left = new Node(3);
	//	root.left.right = new Node(4);
		root.right.left = new Node(3);
	//	root.right.right = new Node(3);
		System.out.println(new SymmetricTree().isSymmetric(root));

	}

	boolean isSymmetric(Node root) {

		Queue<Node> q = new LinkedList<Node>();
		
		if(root == null)
			return true;
		
		q.add(root.left);
		q.add(root.right);
		while(q.size() != 0)
		{
			Node tempL = q.poll();
			Node tempR = q.poll();

			if(tempL == null && tempR == null)
			{
				continue;
			}
			if((tempL != null && tempR == null ) || (tempL == null && tempR != null))
			{
				return false;
			}
			if(tempL.key != tempR.key )
			{
				return false;
			}
				q.add(tempL.left);
				q.add(tempR.right);
				q.add(tempL.right);
				q.add(tempR.left);
			
		}
		return true;
	}

	public boolean check(int l)
	{
		while(l!=1)
		{
			if(l%2!=0)
			{
				return false;
			}
			l = l/2;
		}
		return true;
	}
}
