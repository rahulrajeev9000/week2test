package com.qa.tests;

import java.awt.List;
import java.util.ArrayList;

public class OfflineExercises {

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") → "TTThhheee"
	// multChar("AAbb") → "AAAAAAbbbbbb"
	// multChar("Hi-There") → "HHHiii---TTThhheeerrreee"

	public String multChar(String input) {
		
		for (int i=0; i<input.length();i++) {
			input=input+i+i;
			
		}
		return input;
	}
	
	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") → "evilc"
	// getBert("xxbertfridgebertyy") → "egdirf"
	// getBert("xxBertfridgebERtyy") → "egdirf"
	// getBert("xxbertyy") → ""
	// getBert("xxbeRTyy") → ""

	public String getBert(String input) {
		//List c = new ArrayList<String>();
		for (int i=input.length(); i<0; --i) {
			input=i;
		}
			
		return "";
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) → true
	// evenlySpaced(4, 6, 2) → true
	// evenlySpaced(4, 6, 3) → false
	// evenlySpaced(4, 60, 9) → false

	public boolean evenlySpaced(int a, int b, int c) {
		//boolean es = true;
		boolean evenlySpaced = false;
		if (a<b && b<c && (b-a) == (c-b)) {
				return true;
		
		}
		else if (b<a && c<b && ((a-b) == (b-c))) {
				return true;
		
		}
		else if (c<a && c>b && ((a-c) == (c-b))) {
				return true;
			
		}
		return false;
	}

	// Given a string and an int n, return a string that removes n letters from the 'middle' of the string.
	// The string length will be at least n, and be odd when the length of the input is odd.

	// nMid("Hello", 3) → "Ho"
	// nMid("Chocolate", 3) → "Choate"
	// nMid("Chocolate", 1) → "Choclate"

	public String nMid(String input, int a) {
		return "";
	}

	// Given a string, return true if it ends in "dev". Ignore Case

	// endsDev("ihatedev") → true
	// endsDev("wehateDev") → true
	// endsDev("everoyonehatesdevforreal") → false
	// endsDev("devisnotcool") → false

	public boolean endsDev(String input) {
		boolean dev = true;
		//for (int i= 0; i<input.length(); i++)
			if (input.indexOf('e')-input.indexOf('d')==1 && input.indexOf('v')-input.indexOf('e')==1) {
				return dev;
			}
			else if (input.indexOf('e')-input.indexOf('D')==1 && input.indexOf('v')-input.indexOf('e')==1) {
				return dev;
			}
			return false;
	}



	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") → 2
	// superBlock("abbCCCddDDDeeEEE") → 3
	// superBlock("") → 0

	public int superBlock(String input) {
		int count= 0;
		for(int i=0;i<input.length();i++) {
			while (input(i).equals(input(i+1))) {
				
			}
		}
		return -1;

				
	}
	
	//given a string - return the number of times "am" appears in the String ignoring case -
	// BUT ONLY WHEN the word "am" appears without being followed or proceeded by other letters
	//
	//amISearch("Am I in Amsterdam") → 1
	//amISearch("I am in Amsterdam am I?") → 2
	//amISearch("I have been in Amsterdam") → 0

	public int amISearch(String arg1) {
		int count = 0;
		for(char i = 0; i<arg1.length();i++) {
			if (arg1.length(i).equals("a") && arg1.length(i+1).equals("m") && arg1.length(i+2).equals(" ")) {
				count= count+1;
			}else;
			return count;
		}
			
		return 0;
		
	}
	
	//given a number 
	// if this number is divisible by 3 return "fizz"
	// if this number is divisible by 5 return "buzz"
	// if this number is divisible by both 3  and 5return "fizzbuzz"
	//
	//fizzBuzz(3) → "fizz"
	//fizzBuzz(10) → "buzz"
	//fizzBuzz(15) → "fizzbuzz"
	
	public String fizzBuzz(int arg1) {
		if (arg1 % 3 == 0 && arg1 % 5 != 0 ) {
			return "fizz";
		}
		if (arg1 % 5 == 0 && arg1 % 3 != 0) {
			return "buzz";
		}
		if (arg1 % 3 == 0 && arg1 % 5 == 0) {
			return "fizzbuzz";
		}
		else return null;
		
	}
	
	//Given a string split the string into the individual numbers present
	//then add each digit of each number to get a final value for each number
	// String example = "55 72 86"
	//
	// "55" will = the integer 10
	// "72" will = the integer 9
	// "86" will = the integer 14
	//
	// You then need to return the highest vale
	//
	//largest("55 72 86") → 14
	//largest("15 72 80 164") → 11
	//largest("555 72 86 45 10") → 15
	
	public int largest(String arg1) {
		return 0;
		
	}
	
	
}
