package easy_questions;

import utils.TreeNode;

public class MaximumDepthofBinaryTree {
	public int maxDepth(TreeNode root){
		if(root == null){
			return 0;
		}else{
			int leftHeight=maxDepth(root.left);
			int rightHeight=maxDepth(root.right);
			return Math.max(leftHeight, rightHeight)+1;
		}
	}
}
