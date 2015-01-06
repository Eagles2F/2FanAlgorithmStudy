package easy_questions;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import utils.BinaryTreeTestingCases;
import utils.TreeNode;

public class BalancedBinaryTree {
	/*
	 * Solution pseudocode:
	 * for each node in the tree:
	 * 	1. calculate the height(by the count of nodes) of left_tree and right_tree.
	 *  2. compare the height and determine.	 
	 */
	public boolean isBalanced(TreeNode root){
		if(root == null){//empty tree is height-balanced
			return true;
		}
		//check whether the root node is height-balanced
		int leftHeight = heightIterativeVersion(root.left);
		int rightHeight = heightIterativeVersion(root.right);
		if(Math.abs(leftHeight-rightHeight)>1){
			return false;
		}
		
		if(root.left!= null){
			if(!isBalanced(root.left)){
				return false;
			}
		}
		
		if(root.right!=null){
			if(!isBalanced(root.right)){
				return false;
			}
		}
		
		return true;
	}
	public boolean isBalancedIterative(TreeNode root){
		if(root == null){//empty tree is height-balanced
			return true;
		}
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.offer(root);
		while(!(q.isEmpty())){
			TreeNode node = q.poll();

			//check whether the node is height-balanced
			int leftHeight = heightIterativeVersion(node.left);
			int rightHeight = heightIterativeVersion(node.right);
			if(Math.abs(leftHeight-rightHeight)>1){
				return false;
			}
			
			if(node.left != null){
				q.offer(node.left);
			}
			
			if(node.right != null){
				q.offer(node.right);
			}
		}
		return true;//haven't return false meaning every node is correct.
	}
	public int heightIterativeVersion(TreeNode root){
		/*
		 * calculate the height(by the count of nodes) of a binary tree iteratively 
		 *     Using level order traverse
		 */
		if(root==null){
			return 0;
		}
		Queue<TreeNode> q =  new LinkedList<TreeNode>();
		q.offer(root);
		int height = 0;
		
		while(true){
			int nodeCount = q.size();
			
			if(nodeCount == 0){
				return height;
			}else{
				height++;
			}
			
			while(nodeCount>0){
				TreeNode node = q.poll();
				if(node.left != null){
					q.offer(node.left);
				}
				if(node.right != null){
					q.offer(node.right);
				}
				nodeCount--;
			}
		}
	}
	
	public int heightRecursiveVersion(TreeNode root){
		/*
		 * calculate the height(by the count of nodes) of a binary tree recursively
		 */
		
		if(root == null){
			return 0;
		}else{
			int leftHeight=heightRecursiveVersion(root.left);
			int rightHeight=heightRecursiveVersion(root.right);
			return Math.max(leftHeight, rightHeight)+1;
		}
		
	}

	public TreeNode randomGen(TreeNode root){
		/*
		 * recursively generating children for a tree node
		 */
		if(Math.random()>0.5){
			root.left = new TreeNode(1);
			randomGen(root.left);
		}
		if(Math.random()>0.5){
			root.right = new TreeNode(1);
			randomGen(root.right);
		}
		return root;
	}
	
	//testing function
	public static void main(String args[]){
		BalancedBinaryTree BBT = new BalancedBinaryTree();
		BinaryTreeTestingCases BBTC = new BinaryTreeTestingCases();	
	
		List<TreeNode> testingCases = BBTC.allCases();
		
		for(TreeNode root:testingCases){
			if(root!=null){
				root.print();
				System.out.println("Recursive: "+BBT.heightRecursiveVersion(root));
				System.out.println("Iterative: "+BBT.heightIterativeVersion(root));
				System.out.println("Recursive: "+BBT.isBalanced(root));
				System.out.println("Iterative: "+BBT.isBalancedIterative(root));
			}
		}
	}
}
