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
		
		
		int size1 = card1.getSize();  
		int size2 = card2.getSize();
		
		int[] numbers = new int[89];  //this is an array that keeps numbers selected
		Random rand = new Random();
		
		for (int i = 0; i < numbers.length; i++) { //this loop is for inserting node to the linked list
			do {
				numbers[i] = rand.nextInt(90 - 1 + 1) + 1;
				SelectedNumber selectedNumber = new SelectedNumber(numbers[i]);
				list.insertAtBack(selectedNumber);
				for (int j = 0; j < 12; j++) { //this loop is for determine the card numbers are equal to the random numbers or not
					if (numbers[i] == number1[j]) { //if the random number is equal to the number that is in the card numbers array; decrease the size 
						size1 = size1 - 1;
						if (size1 == 0)  //if the size is equal 0; Bingo
							System.out.println("card1 Bingo!");
					}
					if (numbers[i] == number2[j]) { 
						size2 = size2 - 1;
						if (size2 == 0) 
							System.out.println("card2 Bingo!");
					}
					
				}
			} while (numbers.equals(numbers[i]));  //this avoids from the adding duplicate numbers to array
			list.outputListBackward();
		}
	}
}
