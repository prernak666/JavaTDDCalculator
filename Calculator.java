package calculatorJava;

public class Calculator {
  public static int add(String numbers) {
	  int returnValue=0; 
	if(numbers=="")
		return returnValue;
	
	else
	{   
		String[] arr=numbers.split(",");
		for(String arr1:arr)
			returnValue+=Integer.parseInt(arr1);
		
	}
	return returnValue;	
	
}
}
