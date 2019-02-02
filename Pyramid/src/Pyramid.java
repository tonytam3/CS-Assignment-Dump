import java.util.Scanner;

//Functions are below main body
public class Pyramid {
	public static void main (String[] args) {
		System.out.println("How many steps do you want your pyramid to have?");
		Scanner ui = new Scanner (System.in);
		int response = ui.nextInt();
		int myLevel = response;
		long myinitiallevel = 1;
		String mySpace;
		int maxBaseWidth = maxPyramidWidth(response); //Call function to find pyramid base width base on response

		while(myinitiallevel <= myLevel) {
			long myPyramidAtLevel = myPyramidConstructor(myinitiallevel);
			mySpace = mySpaceFunc(maxBaseWidth, myPyramidAtLevel);
			System.out.println(mySpace+myPyramidAtLevel+mySpace);
			myinitiallevel++;
			
		}
		ui.close();

		
	}
// Functions below this line ------------------------------
	static int maxPyramidWidth(int x) {  // Function for finding max base width of pyramid
		int myPyramidWidth = x + (x-1);
		return myPyramidWidth;
	}
	
	static long myPyramidConstructor(long myinitiallevel) { // Function for constructing pyramid at level
		long n = 1;
		long myPyramidResult = 0;
		long myIntermediate = 10;
		
		while (n <= myinitiallevel) { // Solving for base 10 @ exponent
			long myExponentComponent = myinitiallevel - n;
			
			if (myExponentComponent == 0) { 
				myIntermediate = 1;            
			}
			else if (myExponentComponent == 1) {
				myIntermediate = 10;
			}
			else {
				myIntermediate = myIntermediate * 10;
			}
			
			myPyramidResult = myPyramidResult + myIntermediate; // forming the 1 , 11 , 111 ....
			n++;
		}
		
		myPyramidResult = myPyramidResult * myPyramidResult;
		return myPyramidResult;
		
	}
	
	
	static String mySpaceFunc (int maxBaseWidth ,long myPyramidAtLevel) { // Function for putting out space difference between left and right side of pyramid
		int myPyramidCharacterLength=1;
		long myRuler = 10;
		String myActualSpace = "";
		while (myPyramidAtLevel > myRuler) { // finding the character length of non space section of the pyramid
				myRuler = myRuler *10; 
				myPyramidCharacterLength++;
		}
		int mySpace = (maxBaseWidth - myPyramidCharacterLength) / 2; // finding the space left and right of pyramid
		for (int i=1; i<=mySpace; i++) {
			myActualSpace = myActualSpace + " "; // translating number or spaces to actual spaces
		}
		return myActualSpace;
		

	}
	
	
}
