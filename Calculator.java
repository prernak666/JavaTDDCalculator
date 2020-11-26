package calculatorJava;

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
		for(String arr1:arr)
			returnValue+=Integer.parseInt(arr1);
		}
	return returnValue;	
	
}
}
