package org.workholic.war.algo.contracts;

/**
 * This interface provides methods which provides functionality related to Queue
 * 
 * @author Anish Singh(anish2u2@gmail.com)
 *
 */
public interface Queue<T> {

	/**
	 * This method will offer element to Queue.
	 * 
	 * @param data
	 * @return
	 */
	public boolean offer(T data);

	/**
	 * This method will return head element of the Queue and remove the element.
	 * 
	 * @return
	 */
	public T poll();

	/**
	 * This method will return head element of the Queue but not remove the element
	 * from the Queue.
	 * 
	 * @return
	 */
	public T peek();

	/**
	 * This method will return size of the Queue.
	 * 
	 * @return
	 */
	public int size();

	/**
	 * This method will return that Queue is empty or not.
	 * 
	 * @return
	 */
	public boolean isEmpty();

}
