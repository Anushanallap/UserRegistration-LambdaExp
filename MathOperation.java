package JUNIT.LambdaExpression;


@FunctionalInterface
interface IMathfunction{
	int calculate(int a,int b);
	static void printResult(int a, int b,String function, IMathfunction fobj) {
		System.out.println(" Result of " +function+" is " + fobj.calculate( a, b));
	}
}
public class MathOperation {
	
	public static void main(String[] args) {
		//using method reference integer of Lambda expression
		//this expression 'implements IMathfunction' interface
		IMathfunction add = Integer :: sum;
		
		
		//Lambda expression for multiplication and division for the two parameters
		//this expression 'implements IMathfunction' interface
		IMathfunction Substract = ( x , y) -> x- y;
		IMathfunction Multiply = (x ,y) -> x * y;
		IMathfunction divide = (int x , int y) -> {
			if( y == 0 ) return 0;
			return x / y;
		};
		
		//add and multiply using two numbers with Lambda expression
		System.out.println("Substraction is " + substraction.calculate(a: 6 , b: 3));
		System.out.println("Addition is " + add.calculate( a: 9, b: 3));
		System.out.println("Multiplication is " + multiply.calculate( a: 9, b: 3));
		System.out.println("Division is " + division.calculate( a: 9, b: 3));
		
		
		//passing Lambda Expression as function parameter to print result using static function
		IMathfunction.printResult( a:6, b:3, function: "Addition", add);
		IMathfunction.printResult( a:6, b:3, function: "Multiplication", multiply);
		IMathfunction.printResult( a:6, b:3, function: "Division", divide);
		
		

	}
}



