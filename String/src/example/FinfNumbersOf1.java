package example;

import java.util.Arrays;

public class FinfNumbersOf1 {
	public static void main(String[] args) {
		int [] input = {1,0,1,1,0,1};
		
		/*
		 * int count=0;
		 * 
		 * for(int i = 0;i<input.length;i++) { if(input[i] == 1) { count++; } }
		 * 
		 * System.out.println(count);
		 */
		int sum = Arrays.stream(input).sum();
		System.out.println(sum);
		
	}

}
