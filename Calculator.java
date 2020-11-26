package calculatorJava;

public class Calculator {
  public static int add(String numbers) {
	  int returnValue=0; 
	if(numbers=="")
		return returnValue;
	else if(numbers.length()>2)
	{
		throw new RuntimeException("Give Only two numbers");
		
	}
	else
	{
		
		String[] arr=numbers.split(",");
		for(String arr1:arr)
			returnValue+=Integer.parseInt(arr1);
		
	}
	return returnValue;	
	
}
}
