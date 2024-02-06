package trees;
import java.util.*;
class Node{
	int val;
	Node left;
	Node right;
	Node(int val){
		this.val = val;
		this.left = null;
		this.right = null;
	}
	
}
public class MainTree {

	

	public static void main(String[] args) {
		System.out.println("Tree Data Structure:");
		/*
		 * 
		 * 
		 * 
		 */
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		
		
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		System.out.println("In-Order Tree Traversal: ");
		inOrderTraversal(root);
		System.out.println();
		
		System.out.println("Pre-Order Tree Traversal: ");
		preOrderTraversal(root);
		System.out.println();
		
		System.out.println("Post-Order Tree Traversal: ");
		postOrderTraversal(root);
		System.out.println();
		
		System.out.println("Level Order Tree Traversal: ");
		leverOrderTraversal(root);
		System.out.println();
		
		
		System.out.println("Size of Binary Tree: ");
		System.out.println(sizeOfBinaryTree(root, 0));
		
	}

	private static int sizeOfBinaryTree(Node root, int size) {
		if(root==null) return 0;
		size = size +1;
		if(root.left!=null)
		return sizeOfBinaryTree(root.left, size+1);
		else if(root.right!=null)
			return sizeOfBinaryTree(root.right, size +1 );
		else
			return size;
			
		
	}

	//TREE: Level Order Traversal
	private static void leverOrderTraversal(Node root) {
		if(root==null) return;
		Queue<Node> queue  = new LinkedList<Node>();
		queue.add(root);
		
		while(queue.size()!=0) {
			
			Node currNode = queue.poll();
			
			if(currNode.left!=null) {
				queue.add(currNode.left);
			}
			if(currNode.right!=null) {
				queue.add(currNode.right);
			}
			System.err.print(currNode.val+" ");
			
		}
		
		
	}
	//TREE: POST Order Traversal
	private static void postOrderTraversal(Node root) {
		if(root==null)
			return;
		postOrderTraversal(root.right);
		System.out.print(root.val);
		postOrderTraversal(root.left);
		
	}
	//TREE: PRE Order Traversal
	private static void preOrderTraversal(Node root) {
		if(root==null) return;
		preOrderTraversal(root.left);
		System.out.print(root.val+" ");
		preOrderTraversal(root.right);
		
	}
	//TREE: IN Order Traversal
	private static void inOrderTraversal(Node root) {
		if(root==null) return;
		System.out.print(root.val+" ");
		inOrderTraversal(root.left);
		inOrderTraversal(root.right);
	}


}
