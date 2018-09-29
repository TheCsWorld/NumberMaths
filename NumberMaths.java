
import java.util.Scanner;

/*Write an application that asks the user to enter two integers, obtains them from the user and prints their sum,
product, difference and quotient (division).  */
public class NumberMaths {

	public static void main(String[] args) {
		int firstNumber =0;
		int secondNumber=0;
		int addedNumber=0;
		int subtractedNumber=0;
		int multipliedNumber=0;
		int dividedNumber=0;
		int remainder =0;
		System.out.print("Enter a number: ");
		Scanner inputScanner = new Scanner(System.in);
		firstNumber = inputScanner.nextInt();
		System.out.print("Enter another number: ");
		secondNumber = inputScanner.nextInt();
		inputScanner.close();
		addedNumber = firstNumber + secondNumber;
		subtractedNumber = firstNumber - secondNumber;
		multipliedNumber = firstNumber * secondNumber;
		dividedNumber = firstNumber / secondNumber;
		remainder = firstNumber % secondNumber;
		System.out.print("The numbers " + firstNumber + " and " + secondNumber + "\n"  + " Added: " + addedNumber + "\n" + " Subtracted: " + subtractedNumber + "\n" + " Multiplied: " + multipliedNumber + "\n" + " Divided: " + dividedNumber +"." + remainder);
		//Can't figure out how to put the things in output on new line
	}

}
