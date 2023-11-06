package collectionsprogram.week6.assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {
public static void main(String[] args) {
	 int[] num= {1,2,3,4,5,4,3,6,8,9,10};
	
Set<Integer> values=new TreeSet<Integer>();
	
	for (int i = 0; i < num.length; i++) {
		 values.add(num[i]);
		
			} 
	
	List<Integer> num2=new ArrayList<Integer>(values);
	for (int i = 0; i < num.length; i++) {
		if(num2.get(i+1)!=num2.get(i)+1) {
			System.out.println(num2.get(i)+1);
			break;
		}
	}
	
	}
		
	}


