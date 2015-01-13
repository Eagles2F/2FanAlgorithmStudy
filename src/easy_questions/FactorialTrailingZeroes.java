package easy_questions;

public class FactorialTrailingZeroes {
	public int trailingZeores(int n){
		/*
		 * the number of trailing zeores of n! is the number of factor 5 in n!.
		 */
		int power = 1;
		int sumofZeores = 0;
		while(Math.pow(5, power) <= n){
			sumofZeores += n/Math.pow(5, power);
			power++;
		}
		return sumofZeores;
	}
}
