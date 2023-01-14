package doublyLinkedList;

import game.SelectedNumber;

public class Node {
	Node next;
	Node prev;
	SelectedNumber number;
	
	public Node() {
		number = null;
		prev = null;
		next = null;
	}
	
	public Node(SelectedNumber number) {
		setNumber(number);
		next = null;
		prev = null;
	}
	
	public Node(SelectedNumber number, Node next) {
		setNumber(number);
		this.next = next;
		prev = null;
	}
	
	public Node(SelectedNumber number, Node next, Node prev) {
		setNumber(number);
		this.prev = prev;
		this.next = next;
	}

	public Node getNext() {
		return next;
	}

	public Node getPrev() {
		return prev;
	}

	public SelectedNumber getNumber() {
		return number;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public void setNumber(SelectedNumber number) {
		this.number = number;
	}
	
	

}
