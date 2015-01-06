package easy_questions;

import java.util.List;

import utils.BinaryTreeTestingCases;
import utils.TreeNode;

public class SymmetricTree {
	public boolean isSymmetric(TreeNode root){
		if(root == null){
			return true;
		}else{
			String s1 = leftTraversal(root.left);
			String s2 = rightTraversal(root.right);
			System.out.println(s1);
			System.out.println(s2);
			return s1.equals(s2);
		}
	}
	
	public String leftTraversal(TreeNode root){
		if(root == null){
			return "";
		}
		String result = "";
		if(root.left == null && root.right == null){
			result += root.val;
			return result;
		}
		if(root.left != null){
			result+=leftTraversal(root.left);
		}else{
			result+="#";
		}
		result += root.val;
		if(root.right != null){
			result+=leftTraversal(root.right);
		}else{
			result+="#";
		}
		return result;
	}
	
	public String rightTraversal(TreeNode root){
		if(root == null){
			return "";
		}
		String result = ""; 
		if(root.left == null && root.right == null){
			result += root.val;
			return result;
		}
		if(root.right != null){
			result+=rightTraversal(root.right);
		}else{
			result+="#";
		}
		
		result += root.val;
		
		if(root.left != null){
			result+=rightTraversal(root.left);
		}else{
			result+="#";
		}
		return result;
	}
	public static void main(String args[]){
		SymmetricTree ST = new SymmetricTree();
		BinaryTreeTestingCases BBTC = new BinaryTreeTestingCases();	
		
		List<TreeNode> testingCases = BBTC.allCases();
		
		for(TreeNode root:testingCases){
			if(root != null){
				root.print();
				System.out.println(ST.isSymmetric(root));
			}
		}
		System.out.println(ST.isSymmetric(null));
		BBTC.testingCase7().print();
		System.out.println(ST.isSymmetric(BBTC.testingCase7()));
		
		BBTC.testingCase8().print();
		System.out.println(ST.isSymmetric(BBTC.testingCase8()));
		
	}
}
