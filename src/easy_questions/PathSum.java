package easy_questions;

import java.util.List;

import utils.BinaryTreeTestingCases;
import utils.TreeNode;

public class PathSum {
	public boolean hasPathSum(TreeNode root, int sum){
		if(root == null){
			return false;
		}
		
		sum = sum - root.val;
		if(sum == 0 && root.left == null && root.right == null){
			return true;
		}else{
			if(hasPathSum(root.left,sum)){
				return true;
			}
			if(hasPathSum(root.right,sum)){
				return true;
			}
		}
		return false;
	}
	
	public static void main(String args[]){
		PathSum PS = new PathSum();
		BinaryTreeTestingCases BBTC = new BinaryTreeTestingCases();	
		
		List<TreeNode> testingCases = BBTC.allCases();
			
		for(TreeNode root:testingCases){
			if(root != null){
				root.print();
				System.out.println(PS.hasPathSum(root, 1));
			}
		}

		
	}
}
