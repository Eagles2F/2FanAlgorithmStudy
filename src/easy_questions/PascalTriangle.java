package easy_questions;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	public List<List<Integer>> generate(int numRows){
		List<List<Integer>> triangle = new ArrayList<List<Integer>>();
		if(numRows == 0){
			return triangle;
		}
		
		for(int i=0;i<numRows;i++){
			List<Integer> row = new ArrayList<Integer>();
		
			if(i ==0){
				row.add(1);
			}else{
				row.add(1);
				row.add(1);
				if(i != 1){
					List<Integer> pre_row = triangle.get(triangle.size()-1);
					for(int j=0;j<i-1;j++){
						row.add(j+1, pre_row.get(j)+pre_row.get(j+1));  
					}
				}
			}
			
			triangle.add(row);
		}
		return triangle;
	}
	
	public static void main(String argvs[]){
		PascalTriangle PT = new PascalTriangle();
		for(int k=1;k<20;k++){
		List<List<Integer>> triangle = PT.generate(k);
		for(List<Integer> row:triangle){
			for(Integer i: row){
				System.out.print(i);
			}
			System.out.print('\n');
		}
		}
	}
}
