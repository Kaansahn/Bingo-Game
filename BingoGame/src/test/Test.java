package test;

import java.util.Random;

import doublyLinkedList.DoublyLinkedList;
import game.Card;
import game.SelectedNumber;

public class Test {
	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		
		int number1[] = {2, 5, 13, 19, 25, 36, 38, 45, 65, 66, 78, 81};
		int number2[] = {1, 9, 12, 18, 25, 36, 49, 52, 62, 69, 72, 90};
		
		Card card1 = new Card(number1);
		Card card2 = new Card(number2);
		
		
		int size1 = card1.getSize(); //'number' size of cards
		int size2 = card2.getSize();
		
		int[] numbers = new int[89];
		Random rand = new Random();
		
		for (int i = 0; i < numbers.length; i++) {
			do {
				numbers[i] = rand.nextInt(90 - 1 + 1) + 1;
				SelectedNumber selectedNumber = new SelectedNumber(numbers[i]);
				list.insertAtBack(selectedNumber);
				for (int j = 0; j < 12; j++) {
					if (numbers[i] == number1[j]) {
						size1 = size1 - 1;
						if (size1 == 0) 
							System.out.println("card1 Bingo!");
					}
					if (numbers[i] == number2[j]) {
						size2 = size2 - 1;
						if (size2 == 0) 
							System.out.println("card2 Bingo!");
					}
					
				}
			} while (numbers.equals(numbers[i]));
			list.outputListBackward();
		}
	}
}
