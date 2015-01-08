package easy_questions;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import utils.BinaryTreeTestingCases;
import utils.TreeNode;

public class SymmetricTree {
	public boolean isSymmetricRecursive(TreeNode root){
		if(root == null){
			return true;
		}else{
			return isSym(root.left,root.right);
		}
	}
	public boolean isSym(TreeNode left, TreeNode right){
		if(left == null && right == null){
			return true;
		}
		if((left ==null && right != null)||(left != null && right == null)){
			return false;
		}
		if(left.val != right.val){
			return false;
		}
		
		if(!isSym(left.left,right.right)){
			return false;
		}
		if(!isSym(left.right,right.left)){
			return false;
		}
		return true;
	}
	
	public boolean isSymmetricIteratively(TreeNode root){
		/*
		 * Using level order traversal. The key observation is that on each level, the value are mirrored.
		 */
		if(root == null){
			return true;
		}
		Queue<TreeNode> l = new LinkedList<TreeNode>();
		Queue<TreeNode> r = new LinkedList<TreeNode>();
		l.offer(root.left);
		r.offer(root.right);
		while(!l.isEmpty() && !r.isEmpty()){
			TreeNode left = l.poll();
			TreeNode right = r.poll();
			
			if((left == null && right != null) ||(left != null && right == null)){
				return false;
			}

			if(left != null && right != null){
				if(left.val != right.val){
					return false;
				}else{
					l.offer(left.left);
					l.offer(left.right);
					r.offer(right.right);
					r.offer(right.left);
				}
			}
		}
		return true;
		
	} 
	public static void main(String args[]){
		SymmetricTree ST = new SymmetricTree();
		BinaryTreeTestingCases BBTC = new BinaryTreeTestingCases();	
		
		List<TreeNode> testingCases = BBTC.allCases();
		
		for(TreeNode root:testingCases){
			if(root != null){
				root.print();
				System.out.println(ST.isSymmetricIteratively(root));
			}
		}
		System.out.println(ST.isSymmetricIteratively(null));
		BBTC.testingCase7().print();
		System.out.println(ST.isSymmetricIteratively(BBTC.testingCase7()));
		
		BBTC.testingCase8().print();
		System.out.println(ST.isSymmetricIteratively(BBTC.testingCase8()));
		
	}
}
