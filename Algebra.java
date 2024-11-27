// Implements algebraic operations and the square root function without using 
// the Java operations a + b, a - b, a * b, a / b, a % b, and without calling 
// Math.sqrt. All the functions in this class operate on int values and
// return int values.

public class Algebra {
	public static void main(String args[]) {
	    // Tests some of the operations
	    System.out.println(plus(2,3));   // 2 + 3
	    System.out.println(minus(7,2));  // 7 - 2
   		System.out.println(minus(2,7));  // 2 - 7
 		System.out.println(times(3,4));  // 3 * 4  
   		System.out.println(plus(2,times(4,2)));  // 2 + 4 * 2
   		System.out.println(pow(5,3));      // 5^3 
   		System.out.println(pow(3,5));      // 3^5 
   		System.out.println(div(12,3));   // 12 / 3    
   		System.out.println(div(5,5));    // 5 / 5  
   		System.out.println(div(25,7));   // 25 / 7
   		System.out.println(mod(25,7));   // 25 % 7 
   		System.out.println(mod(120,6));  // 120 % 6  
   		System.out.println(sqrt(36)); 
		System.out.println(sqrt(263169));
   		System.out.println(sqrt(76123));

	
	}  

	// Returns x1 + x2
	public static int plus(int x1, int x2) {
		// Replace the following statement with your code
		int sum = x1;
		for(int i=0; i<x2; i++){
			sum++;
		}
		return sum;
	}

	// Returns x1 - x2
	public static int minus(int x1, int x2) {
		// Replace the following statement with your code
		int sum = x1;
		for(int i=0; i<x2; i++){
			sum--;
		}
		return sum;
	}

	// Returns x1 * x2
	public static int times(int x1, int x2) {
		// Replace the following statement with your code
		int sum=0;
		for(int i=0; i<x2; i++){
			sum = plus(sum, x1);
		}
		return sum;
	}

	// Returns x^n (for n >= 0)
	public static int pow(int x, int n) {
		// Replace the following statement with your code
		int sum=x;
		for(int i=1; i<n; i++){
			sum = times(sum, x);
		}
		return sum;
	}

	// Returns the integer part of x1 / x2 
	public static int div(int x1, int x2) {
		// Replace the following statement with your code
		int count = 1;
		int sum = x2;
		while (x1 > sum) {
			count++;
			sum = times(x2, count);
		}
		if(x1 != sum) count--;
		return count;
	}

	// Returns x1 % x2
	public static int mod(int x1, int x2) {
		// Replace the following statement with your code
		int calc = div(x1, x2);
		int result = minus(x1, times(x2, calc));
		return result;
	}	

	// Returns the integer part of sqrt(x) 
	public static int sqrt(int x) {
		// Replace the following statement with your code
		double epsilon = 0.01;
		int g =x;
		g = div(g,2);
		double y1,y2,y3,y4,z;
		int sum = minus(times(g, g),x);
		if (sum<0) sum = minus(0, sum);
	
		while (sum > epsilon) {
			y1 = times (g,2);
			y2 = times (g,g);
			y3 = minus(y2, x);
			y4 = y3/y1;
			z = minus (g, y4);	
			g=(int)z;
			sum = (int)y3;
			if ((int)y4==0) sum=0;
			if (sum<0) sum = minus(0, sum);	
		}
		return g;
	}	  	
	// Returns x1 * x2
	public static double times(double x1, double x2) {
		// Replace the following statement with your code
		double sum=0;
		for(int i=0; i<x2; i++){
			sum += plus(sum, x1);
		}
		return sum;
	}
	// Returns x1 + x2
	public static double plus(double x1, double x2) {
		// Replace the following statement with your code
		double sum = x1;
		for(int i=0; i<x2; i++){
			sum++;
		}
		return sum;
	}
	// Returns x1 - x2
	public static double minus(double x1, double x2) {
		// Replace the following statement with your code
		double sum = x1;
		for(int i=0; i<x2; i++){
			sum--;
		}
		return sum;
	}

  // Returns the integer part of x1 / x2 
	public static double div(double x1, double x2) {
		// Replace the following statement with your code
		int count = 1;
		double sum = x2;
		while (x1 >= sum) {
			count++;
			sum = times(x2, count);
		}
		if(x1 != sum) count--;
		return count;
	}
}


