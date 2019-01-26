import java.util.Scanner;

public class Calculator2{
// Functions were declared first. Main body is at line 69//	
	static double addition(double x, double y) {
		return x+y;
	}
	static double subtraction(double x, double y) {
		return x-y;
	}
	static double multiplication(double x, double y) {
		return x*y;
	}
	static double division(double x, double y) {
		return x/y;
	}
	static double powerfunc(double x, double y) {
		double Y1 = 1;
		double Y2 = y;
		double x1 = x;
		if (x>=0){
			if (y==0){
				return 1;
			}
			else {
				while (Y1 != Y2) {
					x= x*x1;
					Y1++;
				}
			}
			return x;
		}
		else {
			System.out.println("Domain Error");
			return 0;
		}
	}
	static double squareroot (double x) {
		double X1;
		double X2 = x/2;
		
		do {
			X1 = X2;
			X2 = (X1 + (x/X2))/2;
		}while((X2-X1) !=0);
		
		return X2;
	}
	static double factorial (double x){
		double n1=x;
		double n2 = n1-1;
		
		if (x>0){
			while (n2 > 0){
				n1 = n1 * n2;
				n2--;
			}
			return n1;
		}
		else if (x==0){
			return 1;
		}
		else{
			System.out.println("invalid input");
			return 0;
		}
	}
	
	public static void main(String[] args) {
		double x =0,y =0,result=0;
		int Response;
		Scanner UI = new Scanner(System.in);
		do {
		System.out.println("What mathematical operation do you want to perform?\n 1)addidtion\n 2)substraction\n 3)multiplication\n 4)division\n 5)Var1^Var2\n 6)sqrt of var 1\n 7)var1!");
		Response = UI.nextInt();
			if (Response <= 7) {
				System.out.println("What is variable 1?");
				x = UI.nextDouble();
				System.out.println("What is variable 2?");
				y = UI.nextDouble();
				break;
			}
			else {
				System.out.println("Invalid Option, try again.");
			}			
		}while(Response > 7);
		String Response2;
		int abs = 0;
		do {
			System.out.println("Do want the absolute value of the result? (yes or no)");
			Response2 = UI.next();
			if (Response2.contentEquals("yes")) {
				abs = 1;
				break;
			}
			else if (Response2.contentEquals("no")) {
				abs = 0;
				break;
			}
			else{
				System.out.println("Not a valid answer?");
			}
		}while(Response2 != "yes" && Response2 != "no");
		
		//System.out.println(abs);//
		if (Response == 1) {
			result= addition(x,y);
		}
		else if (Response == 2) {
			result= subtraction(x,y);
		}
		else if (Response == 3) {
			result= multiplication(x,y);
		}
		else if (Response == 4) {
			result= division(x,y);
		}
		else if (Response == 5) {
			result= powerfunc(x,y);
		}
		else if (Response ==6 ) {
			result = squareroot(x);
		}
		else {
			result = factorial(x);
		}
		
		if(abs ==1 && result >= 0) {
			result = result * 1;
		}
		else if (abs==1 && result <= 0) {
			result = result * -1;
		}
		
		System.out.println("The result is: "+result+"\nEnd of Program");
		UI.close();
	}
}	

	
