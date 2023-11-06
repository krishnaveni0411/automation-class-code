package collectionsprogram.week6.assignment1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {
public static void main(String[] args) {
	int[] data = {3,2,11,4,6,7,2,3,3,6,7};
	Set<Integer> values=new TreeSet<Integer>();
	
	for (int i = 0; i < data.length; i++) {
		values.add(data[i]);
	}
	System.out.println(values);
	List<Integer> digits=new ArrayList<Integer>(values);
	int size = digits.size();
	Integer number = digits.get(size-2);
	System.out.println("Second Largest Number in the Array : "+number);
	
	
}
}
