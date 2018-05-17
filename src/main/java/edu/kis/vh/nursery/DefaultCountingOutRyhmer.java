package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRyhmer {

	private IntLinkedList intLinkedList;

	public DefaultCountingOutRyhmer() {
		intLinkedList = new IntLinkedList();
	}

	public DefaultCountingOutRyhmer(IntLinkedList intLinkedList) {
		this.intLinkedList = intLinkedList;
	}

	public void countIn(int in) {
		intLinkedList.push(in);
	}

	public boolean callCheck() {
		return intLinkedList.isEmpty();
	}

	public boolean isFull() {
		return intLinkedList.isFull();
	}

	public int peekaboo() {
		return intLinkedList.top();
	}

	public int countOut() {
		return intLinkedList.pop();
	}

	public int getTotal() {
		return 1;
	}

}
