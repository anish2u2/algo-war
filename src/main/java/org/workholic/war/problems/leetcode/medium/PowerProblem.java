package org.workholic.war.problems.leetcode.medium;

/**
 * Implement pow(x, n), which calculates x raised to the power n (i.e. xn).
 * 
 * @author Anish Singh(anish2u2@gmail.com)
 *
 */
public class PowerProblem {
	
	public double myPow(double x, int n) {
		if (n == 1) {
			return x;
		}
		int remainder = 0;
		int cost = 0;
		while (n > 1 && remainder != 1) {
			remainder = n / 2;
			cost += 1;
			n = n / 2;
		}
		double value = x;
		while (cost > 0) {
			value += value * 2;
			cost--;
		}
		if (remainder == 1) {
			value += x;
		}
		return value;
	}

}
