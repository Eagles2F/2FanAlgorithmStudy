package easy_questions;

import java.util.List;

import utils.BinaryTreeTestingCases;
import utils.TreeNode;

public class SameTree {
	public boolean isSameTree(TreeNode a,TreeNode b){
		if(a== null && b==null){
			return true;
		}
		if((a ==null && b!=null)||(a!=null && b==null)){
			return false;
		}
		if(!isSameTree(a.left,b.left)){
			return false; 
		}
		if(!isSameTree(a.right,b.right)){
			return false;
		}
		if(a.val != b.val){
			return false;
		}
		
		return true;
	}
	
	public static void main(String args[]){
		SameTree ST = new SameTree();
		BinaryTreeTestingCases BBTC = new BinaryTreeTestingCases();	
		
		List<TreeNode> testingCases = BBTC.allCases();
		
		System.out.println("Result: "+ST.isSameTree(null,null));
		
		
		testingCases.get(0).print();
		testingCases.get(0).print();
		System.out.println("Result: "+ST.isSameTree(testingCases.get(0),testingCases.get(0)));
		
		testingCases.get(1).print();
		testingCases.get(0).print();
		System.out.println("Result: "+ST.isSameTree(testingCases.get(1),testingCases.get(0)));
		
		testingCases.get(3).print();
		testingCases.get(4).print();
		System.out.println("Result: "+ST.isSameTree(testingCases.get(3),testingCases.get(4)));

		testingCases.get(5).print();
		testingCases.get(4).print();
		System.out.println("Result: "+ST.isSameTree(testingCases.get(5),testingCases.get(5)));

		
	}
}
