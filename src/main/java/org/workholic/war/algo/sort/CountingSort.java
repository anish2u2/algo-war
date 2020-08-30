package org.workholic.war.algo.sort;

import org.workholic.war.algo.contracts.Sort;

/**
 * This class provides implementation of Counting Sort Algorithm.
 * 
 * @author Anish Singh(anish2u2@gmail.com)
 *
 */
public class CountingSort<T extends Number> implements Sort<T> {

	public T[] sort(T[] array) {

		T maxElement = array[0];
		for (int counter = 0; counter < array.length; counter++) {
			if (maxElement.intValue() < array[counter].intValue()) {
				maxElement = array[counter];
			}
		}
		int[] countingArray = new int[maxElement.intValue() + 1];
		for (int counter = 0; counter < array.length; counter++) {
			countingArray[array[counter].intValue()] = countingArray[array[counter].intValue()] + 1;
		}
		for (int counter = 1; counter < countingArray.length; counter++) {
			countingArray[counter] = countingArray[counter - 1] + countingArray[counter];
		}
		@SuppressWarnings("unchecked")
		T[] copy = (T[]) new Number[array.length];
		for (int counter = array.length - 1; counter >= 0; counter--) {
			copy[countingArray[array[counter].intValue()] - 1] = array[counter];
			countingArray[array[counter].intValue()] = countingArray[array[counter].intValue()] - 1;
		}

		return copy;
	}

}
