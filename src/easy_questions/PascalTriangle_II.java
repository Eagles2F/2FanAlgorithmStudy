package easy_questions;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle_II {
	public List<Integer> getRow(int rowIndex){
		List<Integer> row = new ArrayList<Integer>();
		if(rowIndex<0){
			return row;
		}
		
		for(int i=0;i<rowIndex+1;i++){
			if(i ==0){
				row.add(1);
			}else{
				if(i != 1){
					for(int j=0;j<i-1;j++){
						row.set(j, row.get(j)+row.get(j+1));  
					}
				}
				row.add(0,1);	
			}
		}
		
		return row;
	}
	public static void main(String argvs[]){
		PascalTriangle_II PT = new PascalTriangle_II();
		for(int i:PT.getRow(5)){
			System.out.print(i);
		}
	}
}
