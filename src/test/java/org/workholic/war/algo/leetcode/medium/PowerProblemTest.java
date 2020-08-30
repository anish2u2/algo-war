package org.workholic.war.algo.leetcode.medium;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.workholic.war.problems.leetcode.medium.PowerProblem;

/**
 * This class will test solution provided against Power problem.
 * 
 * @author Anish Singh(anish2u2@gmail.com)
 *
 */

@RunWith(JUnit4.class)
public class PowerProblemTest {
	
	private PowerProblem powerProblem=null;
	
	@Before
	public void inti() {
		powerProblem=new PowerProblem();
	}
	
	@Test
	public void test() {
		Assert.assertEquals( 1024.00000d, powerProblem.myPow(2.00000, 10),0.0005d);
	}
	
	@Test
	public void testNegative() {
		Assert.assertEquals( 0.25000d, powerProblem.myPow(2.00000, -2),0.0005d);
	}
	
	/*@Test
	public void testSample1() {
		Assert.assertEquals( 9.26100d, powerProblem.myPow(2.10000, 3),0.0005d);
	}*/
	
	@Test
	public void testSample195() {
		Assert.assertEquals( 9.26100d, powerProblem.myPow(1.84364, -14),0.0005d);
	}
	
	@After
	public void clear() {
		powerProblem=null;
	}
}
