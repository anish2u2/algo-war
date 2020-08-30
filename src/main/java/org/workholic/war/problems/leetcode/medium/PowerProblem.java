package org.workholic.war.problems.leetcode.medium;

import java.math.BigDecimal;
import java.util.Stack;

/**
 * Implement pow(x, n), which calculates x raised to the power n (i.e. xn).
 * 
 * @author Anish Singh(anish2u2@gmail.com)
 *
 */
public class PowerProblem {

	public double myPow(double x, int n) {
		if (n == 0) {
			return 1.0;
		}
		if (n == 1) {
			return x;
		} else if (n == -1) {
			return 1 / x;
		}
		boolean flag = n < 0;
		n = Math.abs(n);
		int remainder = n % 2;
		double[] stack = new double[n / 2];
		int length = n / 2;
		int counter = 2;
		stack[0] = x;
		
		while (counter <= length) {
			if (counter % 2 == 0) {
				stack[counter - 1] = stack[(counter / 2) - 1] * stack[(counter / 2) - 1];
			} else {
				stack[counter - 1] = stack[counter - 2] * stack[0];
			}
			if (counter * 2 <= length) {
				stack[(counter * 2) - 1] = stack[counter - 1] * stack[counter - 1];
				counter = counter * 2;
			} else {
				counter++;
			}
		}
		double powerResultent = (remainder == 0 ? 1 : stack[0]) * (stack[(n / 2) - 1] * stack[(n / 2) - 1]);
		return flag ? 1 / powerResultent : powerResultent;
	}

}
