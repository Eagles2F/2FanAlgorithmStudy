package utils;

import java.util.ArrayList;
import java.util.List;

/*
 * Definition for a binary tree
 */
public class TreeNode {
	      public int val;
	      public TreeNode left;
	      public TreeNode right;
	      public TreeNode(int x) { val = x; }
	      
	      public void print(){
	    	 print("",true);
	      }
	      public void print(String prefix, boolean isTail){
	    	  System.out.println(prefix+(isTail?"©¸©¤©¤ " : "©À©¤©¤ ") + val);
	    	  List<TreeNode> children = new ArrayList<TreeNode>();
	    	  if(left != null){
	    		  children.add(left);
	    	  }
	    	  if(right != null){
	    		  children.add(right);
	    	  }
	    	  for (int i = 0; i < children.size() - 1; i++) {
	              children.get(i).print(prefix + (isTail ? "    " : "©¦   "), false);
	          }
	          if (children.size() > 0) {
	              children.get(children.size() - 1).print(prefix + (isTail ?"    " : "©¦   "), true);
	          }
	      }
}
