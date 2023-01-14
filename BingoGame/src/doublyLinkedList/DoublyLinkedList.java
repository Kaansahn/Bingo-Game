package doublyLinkedList;

import game.SelectedNumber;

public class DoublyLinkedList {
	private Node first;
	private Node last;
	
	public DoublyLinkedList() {
		first = null;
		last = null;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void insertAtBack(SelectedNumber number) {
		Node newNode = new Node(number);
		if(isEmpty())
			first = last = newNode;
		else {
			newNode.setPrev(last);
			//newNode.setNext(null);
			last.setNext(newNode);
			last = last.getNext(); //last = newNode
		}
	}
	
	public void outputListBackward() {
		Node temp = last;
		int count = 0;
		
		while (count < 5) { //shows the last 5 numbers selected
			if (temp == null) {
				break;
			}
			System.out.println(temp.getNumber());
			temp = temp.getPrev();
			count++;
		}
		
		System.out.println("**************");
	}

	public Node getFirst() {
		return first;
	}

	public Node getLast() {
		return last;
	}

}
