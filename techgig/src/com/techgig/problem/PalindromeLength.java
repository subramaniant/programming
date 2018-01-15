package com.techgig.problem;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class PalindromeLength {

	
	public static int lengthofPalindrome(String input1)
    {
		int result = 0;
		String temp="";
		HashMap<Character, Integer> keyValue = new HashMap<Character, Integer> ();
		
		HashMap<Character, Integer> keyValueRes = new HashMap<Character, Integer> ();
		
		for(int i=0;i<input1.length();i++) {
			if(keyValue.containsKey(input1.charAt(i))) {
				int incr = keyValue.get(input1.charAt(i));
				keyValue.put(input1.charAt(i), ++incr);
			} else {
				keyValue.put(input1.charAt(i), 1);
			}
		}
		System.out.println(keyValue);
		for(int i=0;i<input1.length();i++) {
			int val = keyValue.get(input1.charAt(i));
			if(val > 1) {
				if(keyValueRes.containsKey(input1.charAt(i))) {
					int incr = keyValueRes.get(input1.charAt(i));
					keyValueRes.put(input1.charAt(i), ++incr);
				} else {
					keyValueRes.put(input1.charAt(i), 1);
				}
				temp+=input1.charAt(i);
			} else {
				if(temp.length() > 0) {
					System.out.println(temp);
				}
				temp ="";
				continue;
			}
			
		}
		System.out.println(temp);
		return result;
    }
	
	public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        int output = 0;
        String ip1 = in.nextLine().trim();
        output = lengthofPalindrome(ip1);
        System.out.println(String.valueOf(output));
    }

}
