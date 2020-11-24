package example;

/***************************************************************************************************************************************************
 * Sample Code Taken from: https://www.tutorialspoint.com/design_pattern/strategy_pattern.htm
 * 
 * In Strategy pattern, a class behavior or its algorithm can be changed at run time. This type of design pattern comes under behavior pattern. 
 * In Strategy pattern, we create objects which represent various strategies and a context object whose behavior varies as per its strategy object. 
 * The strategy object changes the executing algorithm of the context object.
 *
 ***************************************************************************************************************************************************/

public class Demo {

	public static void main(String[] args) {
		
		//"context" is initially established as an "OperationAdd"
		Context context = new Context(new OperationAdd());		
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

		//"context" now changed to an "OperationSubtract"
		context = new Context(new OperationSubtract());		
  		System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

  		//"context" now changed to an "OperationMultiply"
  		context = new Context(new OperationMultiply());		
  		System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
  		
  		//Output...
  		//10 + 5 = 15
  		//10 - 5 = 5
  		//10 * 5 = 50
	}

}
