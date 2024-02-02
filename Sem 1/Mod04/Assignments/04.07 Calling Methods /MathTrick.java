// Gavin Perry, 12/1/23, This program displays an interesting math trick using a random number.
public class MathTrick {
	
	/**
	 * 
	 ******  DO NOT USE ARRAYS OR CONVERT NUMBERS TO STRING UNTIL STEP 7 ******
	 *
	 */
	
	// Step 1) Creates a random 3 digit (100-999) number where the first and last digit differ by more than one
	// Hint: Use Math.random() to create number in the correct range
	// 		 use modulus to find the last digit and divide by 100 for the first digit.
	//		 calculate the difference, which method can you use so it doesn't matter how the numbers are subtract?
	// 		 while the difference of the digits is less than 2, create a new random number and try again

	public static int getRandomNum() 
	{	int num = 0;
		int firstDigit = 0;
		int lastDigit = 0;

		// complete the method		
        while(Math.abs(firstDigit-lastDigit) <= 1) {
            num = 100 + (int)(Math.random() * ((999 - 100) + 1));
            firstDigit = (int)(num / 100);
            lastDigit = (int)(num % 10);
        }
		return num;
	}

	// Step 2 & 4) reverse the digits of a number
	// Hint: to reverse a number without converting it to a String:
	//		create a new variable to store the reversed number
	//		while the original number > 0
	//		for each digit, multiply the new variable by 10 (to make room for the new digit) 
	//		then add the last digit (remember modulus?) to the new variable
	//		divide the original number by 10 to get rid of the last digit
	//	Ex: 584--> (0 x 10) + 4 = 4 ; 58--> (4 x 10) + 8 = 48; 5-->(48 x 10) + 5 = 485

	public static int reverseDigits (int num) {
        // complete the method
        int reversedNum = 0;
        int lastDigit;
        while (num > 0) {
            reversedNum *= 10;
            lastDigit = (int)(num % 10);
            reversedNum += lastDigit;
            num /= 10;
        }
        return reversedNum;
	}
	
	// Step 7) replace characters in a String according to the chart
	// Hint: Loop through the String and "replace" the numbers with the corresponding letter

	public static String replaceLtr(String str)
	{
		// complete the method
        String newstr = str;
        String[] letterMap = {"Y", "M", "P", "L", "R", "O", "F", "A", "I", "B"};  // letter index = number to replace
        for (int i=0; i < letterMap.length; i++) {
            newstr = newstr.replaceAll(Integer.toString(i), letterMap[i]);
        }
        return newstr;
	}
	
	// Step 8) reverse the letters in a String
	// Hint: start with an empty String variable 
	//		 loop through the original word   
	//		 add one letter at time to the new variable using concatenation and .substring()
	public static String reverseString(String str) {
		// complete the method
        String newstr = "";
        for (int i = 0; i<str.length(); i++) {
            newstr += str.substring(str.length() - 1 - i, str.length() - i);
        }
        return newstr;
	}
		
	public static void main(String[] args) 
	{
//		1.	Generate a random 3-digit number so that the first and third digits differ by more than one.
        int startingNumber = getRandomNum();
        System.out.println("1. The starting number is: " + startingNumber);
//		2.	Now reverse the digits to form a second number.
        int reversedNumber = reverseDigits(startingNumber);
        System.out.println("2. The reversed number is: " + reversedNumber);
//		3.	Subtract the smaller number from the larger one.
        int difference = Math.abs(startingNumber - reversedNumber);
        System.out.println("3. The difference is: " + difference);
//		4.	Now reverse the digits in the answer you got in step 3 and add it to that number.
        int differenceAndReversed = reverseDigits(difference) + difference;
        System.out.println("4. The reversed number added to the reversed difference is: " + differenceAndReversed);
//		5.	Multiply by one million.
        int numxMillion = differenceAndReversed * 1000000;
        System.out.println("5. That number * 1 million is: " + numxMillion);
//		6.	Subtract 733,361,573.
        int subtractedNum = numxMillion - 733361573;
//		7.	Convert the number to a string in order to replace the numbers with letters.
// 				Ex: String str = String.valueOf(myNumber);
//			Then, replace each of the digits in your answer, with the letter it corresponds to using the table in the instructions.
        String numStr = String.valueOf(subtractedNum);
        System.out.println("6. That number - 733,361,573 and converted to a string is: " + numStr);
        String replacedStr = replaceLtr(numStr);
        System.out.println("7. Replaced String: " + replacedStr);
//		8.	Now reverse the letters in the string to read your message backward.
        String reversedString = reverseString(replacedStr);
        System.out.println("8. Reversed String: " + reversedString);
	} // end main
} // end class
