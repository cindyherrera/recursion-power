import java.util.*;
import java.util.Scanner;


public class RecursionClient {

	public static void main(String[] args) {
		Scanner lines = new Scanner(System.in);
		//reverseline(new Scanner"poem.txt");
		writeStarsNow(4);

		
		System.out.println("caling the power method(3,4) : " + power(3,4));
	
		System.out.println(mystery(348));
		
		printBinary(7);
		System.out.println();
		printBinary(8);
		System.out.println();
		System.out.println("tests to see if the word 'monster' isPalindrome" +  " : "
				+ "" +isPalindrome("monster"));
	}
	
	public static void writeStarsNow(int n) {
		if (n==0) {
			System.out.println();
		
	} else {
		System.out.println("*");
		writeStarsNow(n-1);
	
	}
	
	
}
	public static int power(int x, int y) {
		if (y ==0) {
			return 1;
		}else {
			return x * power(x, y-1);
			
		}
		
	}
	public static int mystery(int n) {
		if (n < 10) {
			return (10 * n) + n;
		
		} else {
			int a = mystery(n/10);
			int b = mystery(n % 10);
			return (100 * a) + b;
		}
	}
	
	public static void printBinary(int n) {
		if(n < 2) {
			System.out.print(n);
		
			
		} else {
			printBinary(n/2);
			printBinary(n%2);
			
		}
		
	}
	
	public static boolean isPalindrome(String word) {
		if (word.length() < 2) {
			return true;
			
		} else {
			char firstIndex = word.charAt(0);
			char lastIndex = word.charAt(word.length() -1);
			
			if(firstIndex != lastIndex) {
				return false;
				
			}
			String middle = word.substring(1, word.length()-1);
			return isPalindrome(middle);
	}

}

}
