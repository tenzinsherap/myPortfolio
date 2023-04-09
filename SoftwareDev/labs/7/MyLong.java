package labs;

public class MyLong {
	// Class Named MyLong
	int value;

public MyLong(int value) {
	// Assign value
	       this.value = value;
 }

public int getValue() {
	// Getter method to return long value
	       return value;
	   }

public boolean isEven() {
	// Checks for even number
	       return (value % 2 == 0) ? true : false;
	   }

public boolean isOdd() {
	// Checks for odd number
	       return (value % 2 != 0) ? true : false;
	   }

public boolean isPrime() {
	// Checks if num is prime 
	       for (int i = 2; i < value; i++) {
	           if (value % i == 0)
	               return false;
	       }
	       return true;
	   }

public static boolean isEven(int value) {
	// Return values if even
	       return (value % 2 == 0) ? true : false;
	   }

public static boolean isOdd(int value) {
	// Return values if odd
	       return (value % 2 != 0) ? true : false;
	   }

public static boolean isPrime(int value) {
	// Return values if even
	       for (int i = 2; i < value; i++) {
	           if (value % i == 0)
	               return false;
	       }
	       return true;
	   }

public static boolean isEven(MyLong myInt) {
	       return (myInt.value % 2 == 0) ? true : false;
	   }

public static boolean isOdd(MyLong myInt) {
	       return (myInt.value % 2 != 0) ? true : false;
	   }

public static boolean isPrime(MyLong myInt) {
	       for (int i = 2; i < myInt.value; i++) {
	           if (myInt.value % i == 0)
	               return false;
	       }
	       return true;
	   }

public boolean equals(int value) {
	       return (this.value == value) ? true : false;
	   }

public boolean equals(MyLong myInt) {
	       return (this.value == myInt.value) ? true : false;
	   }

public static int parseInt(String value) {
	int i = 0, number = 0;
	boolean isNegative = false;
	int len = value.length();
	if (value.charAt(0) == '-') {
		isNegative = true;
		i = 1;
		}
	while (i < len) {
		number *= 10;
		number += (value.charAt(i++) - '0');
		}
	if (isNegative)
		number = -number;
	return number;
	   }

public static int []parseInt(char[]charValues){ 
	int [] intValues = new int [charValues.length]; 
	for(int i= 0; i<charValues.length; i++) { 
		intValues[i] = Character.getNumericValue(charValues[i]); 
		
	}
	return intValues; 
}
public static int parseInt1(String value) { 
	return Integer.parseInt(value); 
	}
}
