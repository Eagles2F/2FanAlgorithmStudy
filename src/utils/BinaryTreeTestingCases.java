package utils;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeTestingCases {
	public TreeNode testingCase1(){
	/*testing case 1
		1
	   / \
	  1   1
	 /
	1
	 \
	  1
	   
	*/
		TreeNode root = new TreeNode(1);
		TreeNode n11 = new TreeNode(1);
		TreeNode n12 = new TreeNode(1);
		TreeNode n21 = new TreeNode(1);
		TreeNode n31 = new TreeNode(1);
		root.left = n11;
		root.right = n12;
		n11.left = n21;
		n21.right = n31;
				
		return root;
	}
	
	public TreeNode testingCase2(){
		/*testing case 2
			1
		 */
		return new TreeNode(1);
	}
	
	public TreeNode testingCase3(){
		/*testing case 3
			null
		 */
		return null;
	}
	public TreeNode testingCase4(){
		/*testing case 4
	  	1
	     \
	      1
		   \
		    1
		     \
		      1
		     /
		    1
		 */
		TreeNode root = new TreeNode(1);
		TreeNode n11 = new TreeNode(1);
		TreeNode n21 = new TreeNode(1);
		TreeNode n31 = new TreeNode(1);
		TreeNode n41 = new TreeNode(1);
		root.right = n11;
		n11.right = n21;
		n21.right = n31;
		n31.left = n41;
		return root;
	}
	
	public TreeNode testingCase5(){
		/*testing case 5
	  	 1
	   /   \
	  1     1
	 / \   / \
	1	1 1   1
	   /     / \
	  1	    1   1
		 */
		TreeNode root = new TreeNode(1);
		TreeNode n11 = new TreeNode(1);
		TreeNode n12 = new TreeNode(1);
		TreeNode n21 = new TreeNode(1);
		TreeNode n22 = new TreeNode(1);
		TreeNode n23 = new TreeNode(1);
		TreeNode n24 = new TreeNode(1);
		TreeNode n31 = new TreeNode(1);
		TreeNode n32 = new TreeNode(1);
		TreeNode n33 = new TreeNode(1);
		root.left = n11;
		root.right = n12;
		n11.left = n21;
		n11.right = n22;
		n12.right = n24;
		n12.left = n23;
		n22.left = n31;
		n24.left = n32;
		n24.right = n33;
		return root;
	}
	public TreeNode testingCase6(){
		/*testing case 6
	  	 1
	   /   \
	  1     1
	 / \   / \
	1	2 2   1
	   /   \  
	  1	    1   
		 */
		TreeNode root = new TreeNode(1);
		TreeNode n11 = new TreeNode(1);
		TreeNode n12 = new TreeNode(1);
		TreeNode n21 = new TreeNode(1);
		TreeNode n22 = new TreeNode(2);
		TreeNode n23 = new TreeNode(2);
		TreeNode n24 = new TreeNode(1);
		TreeNode n31 = new TreeNode(1);
		TreeNode n32 = new TreeNode(1);
		
		root.left = n11;
		root.right = n12;
		n11.left = n21;
		n11.right = n22;
		n12.right = n24;
		n12.left = n23;
		n22.left = n31;
		n23.right = n32;
		return root;
	}
	public TreeNode testingCase7(){
		/*testing case 7
	  	 1
	   /   \
	  3     2
	 /     /
	2	  3 
		 */
		TreeNode root = new TreeNode(1);
		TreeNode n11 = new TreeNode(3);
		TreeNode n12 = new TreeNode(2);
		TreeNode n21 = new TreeNode(2);
		TreeNode n22 = new TreeNode(3);
		
		root.left = n11;
		root.right = n12;
		n11.left = n21;
		n12.left = n22;
		return root;
	}
	public TreeNode testingCase8(){
		/*testing case 8
	  	 5
	   /   \
	  4     1
	   \     \
		1	  4
	   /     /
	  2		2
		 */
		TreeNode root = new TreeNode(5);
		TreeNode n11 = new TreeNode(4);
		TreeNode n12 = new TreeNode(1);
		TreeNode n21 = new TreeNode(1);
		TreeNode n22 = new TreeNode(4);
		TreeNode n31 = new TreeNode(2);
		TreeNode n32 = new TreeNode(2);
		
		
		root.left = n11;
		root.right = n12;
		n11.right = n21;
		n12.right = n22;
		n21.left = n31;
		n22.left = n32;
		return root;
	}
		public List<TreeNode> allCases(){
			TreeNode test1 = testingCase1();
			TreeNode test2 = testingCase2();
			TreeNode test3 = testingCase3();
			TreeNode test4 = testingCase4();
			TreeNode test5 = testingCase5();
			TreeNode test6 = testingCase6();
			ArrayList<TreeNode> testingCases = new ArrayList<TreeNode>();
			
			testingCases.add(test1);
			testingCases.add(test2);
			testingCases.add(test3);
			testingCases.add(test4);
			testingCases.add(test5);
			testingCases.add(test6);
			return testingCases;
		}
}
