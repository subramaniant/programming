package com.techgig.problem;

import java.util.Scanner;

/**
 * Robin ,the son of Batman(Bruce Wayne) needs training to defeat Joker.
 * Everyday he gains a power of A[i] but that s not enough in order to defeat
 * Joker.Batman suggests him to gain at least K power in every two consecutive
 * days i.e sum of power gain on day i and day i+1 is at least K. This condition
 * needs to be satisfied for every consecutive day(i.e. day 1 and day 2 , day 2
 * and day 3, day 3 and day 4 ... and so on). Robin is lazy so he needs your
 * help to fulfill his father's requirement. So you need to tell him the minimum
 * additional power required to accomplish the task.
 * 
 * 
 * 5
3
2
0
1

There are 3 days and K=5 means at least 5 unit of power required for any two consecutive days. So if at day 2 Robin gains power 3 and at day 3 robin gain power 1 then power gain by Robin everyday is: 2 3 2 (New Power Gain) 2 0 1 (Old Power Gain). 
So for day 1 and day 2: 2+3 = 5 = K and for day 2 and day 3: 3+2 = 5 = K 
Additional Power Gain = (3 0) + ( 2 1) = 4.

 * @author subramanian Constraints 1 <=K<= 500 1 <=N<= 500 0 <=Ai<= 500
 */
public class TwoConsecutive {

	public static void main(String arg[]) {
		Scanner in = new Scanner(System.in);
		int K = in.nextInt();
		int N = in.nextInt();
		int[] Ai = new int[N];
		for (int i = 0; i < N; i++) {
			int A = in.nextInt();
			Ai[i] = A;
		}
		in.close();
		int min =  minimumConsective(K,N,Ai);
		System.out.println(min);
	}

	private static int minimumConsective(int k, int n, int[] ai) {
		
		int diff = 0;
		int min = 0;
		for(int i=0;i<ai.length-1;i++) {
			int first = ai[i];
			int second = ai[i+1];
			int sum = first + second + diff;
			if(k > sum) {
				diff = k-sum;
				min +=diff;
			} else {
				diff = 0;
			}
			
		}
		return min;
	}

}
