/*
 * the Solution for both BinaryTreeLevelOrderTraversal_I and BinaryTreeLevelOrderTraversal_II
 */


package easy_questions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import utils.BinaryTreeTestingCases;
import utils.TreeNode;

public class BinaryTreeLevelOrderTraversal {
	public List<List<Integer>> levelOrder(TreeNode root){
		List<List<Integer>> ll = new ArrayList<List<Integer>>();
		if(root == null){
			return ll;
		}
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.offer(root);
		
		 
		while(true){
			int nodeCount = q.size();
			
			if(nodeCount == 0){
				return ll;
			}
			List<Integer> l = new ArrayList<Integer>();
			
			while(nodeCount>0){
				TreeNode node = q.poll();
				l.add(node.val);
				
				if(node.left != null){
					q.offer(node.left);
				}
				if(node.right != null){
					q.offer(node.right);
				}
				nodeCount--;
			}
			ll.add(0, l);
		}
	}
	
	public static void main(String args[]){
		BinaryTreeLevelOrderTraversal BTLOT = new BinaryTreeLevelOrderTraversal();
		BinaryTreeTestingCases BBTC = new BinaryTreeTestingCases();	
		
		List<TreeNode> testingCases = BBTC.allCases();
		
		for(TreeNode root:testingCases){
			if(root != null){
				root.print();
				List<List<Integer>> ll = BTLOT.levelOrder(root);
				System.out.println(ll);
			}
		}
		System.out.println(BTLOT.levelOrder(null));
	}
}
