package org.workholic.war.algo.sort;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.workholic.war.algo.sort.CountingSort;

/**
 * This class will test the sorting implementations.
 * 
 * @author Anish Singh(anish2u2@gmail.com)
 *
 */

@RunWith(JUnit4.class)
public class SortingTest {

	private CountingSort<Integer> countingSort;

	@Before
	public void inti() {
		countingSort = new CountingSort<Integer>();
	}

	@Test
	public void testCountingSort() {
		Integer[] array = new Integer[] { 0, 3, 1, 2, 5, 6, 3, 4, 9, 7 };
		Integer[] expected = new Integer[] { 0, 1, 2, 3, 3, 4, 5, 6, 7, 9 };
		Assert.assertArrayEquals(expected, countingSort.sort(array));
	}

	@After
	public void clear() {
		countingSort = null;
	}
}
