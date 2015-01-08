package easy_questions;

import java.util.List;

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
	

	public static void main(String args[]){
		SymmetricTree ST = new SymmetricTree();
		BinaryTreeTestingCases BBTC = new BinaryTreeTestingCases();	
		
		List<TreeNode> testingCases = BBTC.allCases();
		
		for(TreeNode root:testingCases){
			if(root != null){
				root.print();
				System.out.println(ST.isSymmetricRecursive(root));
			}
		}
		System.out.println(ST.isSymmetricRecursive(null));
		BBTC.testingCase7().print();
		System.out.println(ST.isSymmetricRecursive(BBTC.testingCase7()));
		
		BBTC.testingCase8().print();
		System.out.println(ST.isSymmetricRecursive(BBTC.testingCase8()));
		
	}
}
