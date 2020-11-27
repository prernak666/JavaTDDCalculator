package calculatorJava;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
  public static int add(String numbers) {
	  String delimit=",|\n";
	  if (numbers.startsWith("//")) {
	        int delimiterIndex = numbers.indexOf("//") + 2;
	        delimit = numbers.substring(delimiterIndex, delimiterIndex + 1);
	        numbers = numbers.substring(numbers.indexOf("n") + 1);
	    }
	  return add1(numbers,delimit);}
	  private static int add1(String numbers,String delimit) {
	  int returnValue=0; 
	if(numbers=="")
		return returnValue;
	
	else
	{
		String[] arr=numbers.split(delimit);
		List<Integer> l=new ArrayList<>();
		int num1=0;
		for(String arr1:arr) {
			num1=Integer.parseInt(arr1);
			if(num1<0)
				l.add(num1);
			returnValue+=num1;
		}
		 if (l.size() > 0) {
	            throw new RuntimeException("Negatives not allowed: " + l.toString());
	        }
	return returnValue;	
	
}
}
}

