package collectionsprogram.week6.assignment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {
public static void main(String[] args) {
	String[] companyName= {"HCL", "Wipro",  "Aspire Systems", "CTS"};
	/* Sorting using Array method program:
    String[] companyName= {"HCL", "Wipro",  "Aspire Systems", "CTS"};
    int length=companyName.length;
    Arrays.sort(companyName);
    for (int i = companyName.length-1; i >=0; i--) {
    	System.out.println(companyName[i]);
	}*/

	List<String> orgnazationName=new ArrayList<String>();
	for(int i=0;i<companyName.length;i++) {
		orgnazationName.add(companyName[i]);
	}
	Collections.sort(orgnazationName);
	Collections.reverse(orgnazationName);
	System.out.println(orgnazationName);
}
}
