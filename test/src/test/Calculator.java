package test;

public class Calculator {

	public static int fibonacci(int x){
		if (x<=1){
			return 1;
		}else{
			return (fibonacci(x-1)+fibonacci(x-2));
		}
		
		
	}
	
	
	public static int calculate(int x){
	
		int fib =fibonacci(x);
		//int fac= factorial(fib);
		
		return fib;
	}
	
	
	public static void main(String args[]){
		
		System.out.println(calculate(10));
	}
	

}
