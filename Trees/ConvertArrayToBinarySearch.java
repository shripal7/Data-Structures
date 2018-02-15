package Trees;

public class ConvertArrayToBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = new int[] {1,2,3,4,5};
		Node x = new ConvertArrayToBinarySearch().sortedArrayToBST(n);
		System.out.println(x.right.right.key);

	}

	Node sortedArrayToBST(int[] nums) {

		Node head = ToBST(nums, 0, nums.length-1);
		return head;
	}

	public Node ToBST(int[] nums, int l, int h) {
		if(l>h)
			return null;
		int mid = (l+h)/2;
		Node node = new Node(nums[mid]);
		node.left = ToBST(nums,l,mid-1);
		node.right = ToBST(nums,mid+1,h);
		
		return node;
	}
}