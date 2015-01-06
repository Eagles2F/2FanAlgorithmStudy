package easy_questions;

import java.util.List;

import utils.BinaryTreeTestingCases;
import utils.TreeNode;

public class MinimumDepthofBinaryTree {
	public int minDepth(TreeNode root){
		if(root == null){
			return 0;
		}
		if(root.left == null && root.right == null){
			return 1;
		}	
		
		int leftMinDepth=9999999;
		int rightMinDepth=9999999;
		if(root.left!=null){
			leftMinDepth=minDepth(root.left);
		}
		if(root.right != null){
			rightMinDepth=minDepth(root.right);
		}
			
		return Math.min(leftMinDepth, rightMinDepth)+1;
	}
	
	public static void main(String args[]){
		MinimumDepthofBinaryTree MDBT = new MinimumDepthofBinaryTree();
		BinaryTreeTestingCases BBTC = new BinaryTreeTestingCases();	
		
		List<TreeNode> testingCases = BBTC.allCases();
		
		for(TreeNode root:testingCases){
			if(root != null){
				root.print();
				System.out.println(MDBT.minDepth(root));
			}
		}
		System.out.println(MDBT.minDepth(null));
	}
}
