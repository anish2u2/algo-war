package org.workholic.war.algo.queue.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

/**
 * This class provides implementation of Queue using array.
 * 
 * @author Anish Singh (anish2u2@gmail.com)
 *
 * @param <T>
 */
public class QueueImpl<T> implements Queue<T> {

	private T[] array;

	private int initialCapacity = 10;

	private int front = -1;

	private int rare = -1;
	

	@Override
	public int size() {

		return 0;
	}

	@Override
	public boolean isEmpty() {

		return false;
	}

	@Override
	public boolean contains(Object o) {

		return false;
	}

	@Override
	public Iterator<T> iterator() {

		return null;
	}

	@Override
	public Object[] toArray() {

		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {

		return null;
	}

	@Override
	public boolean remove(Object o) {

		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {

		return false;
	}

	@Override
	public boolean addAll(Collection<? extends T> c) {

		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {

		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {

		return false;
	}

	@Override
	public void clear() {

	}

	@Override
	public boolean add(T e) {

		return false;
	}

	@Override
	public boolean offer(T e) {

		return false;
	}

	@Override
	public T remove() {

		return null;
	}

	@Override
	public T poll() {

		return null;
	}

	@Override
	public T element() {

		return null;
	}

	@Override
	public T peek() {

		return null;
	}

}
