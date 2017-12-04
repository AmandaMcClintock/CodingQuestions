/* 
Write a function that takes an array of positive and negative integers and a number. 
This function should return true if the array contains a contiguous sub array that 
sums up to the number (2nd input). 
He wanted an O(n) algorithm.
*/
import java.util.*;
import java.lang.*;
public class contSub{
	
	//int sum;

	public static boolean function(int[] intArray, int num){
		int sum = 0;
		int length = intArray.length;
		int start = 0;
		if(length == 0) return false;
		for(int i = 0; i < length; i++){

			sum += intArray[i];
			System.out.println("i = " + i);
			System.out.println("Sum = " + sum);
			if(sum == num){
				return true;
			}
			if(i == length-1 && start < length){
				start++;
				sum = 0;
				System.out.println("Start = " + start);
				i = start-1;

			}
		}		
		return false;
	}
	/*

		if (intArray == null)
			return false;
		else {
			HashSet<Integer> hs = new HashSet<>();
			int sum = 0;
			
			for (int i = 0; i < intArray.length; i++) {
				sum += intArray[i];
				if (sum == num)
					return true;
				if (hs.contains(sum - num)) {
					return true;
				} else {
					hs.add(sum);
				}
			}
			return false;
		}
	*/
	
		
	
	public static void main(String[] args){
		int[] intArray = {-12, 2, -5, 8, 12};
		int num = 15;
		boolean solution = function(intArray, num);
		System.out.println(solution);
	}
}