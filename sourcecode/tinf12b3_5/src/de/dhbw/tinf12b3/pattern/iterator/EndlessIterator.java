package de.dhbw.tinf12b3.pattern.iterator;

import java.util.Iterator;

public class EndlessIterator implements Iterator<Object> {

	@Override
	public boolean hasNext() {
		return true;
	}

	@Override
	public Object next() {
		return new Object();
	}

	public void remove() {
		throw new UnsupportedOperationException("fuck off");
	}

}
