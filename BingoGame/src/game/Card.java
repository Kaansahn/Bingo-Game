package game;

public class Card {
	private int size;
	private int[] numbers;
	
	public Card() {
		size = 12;
		numbers = null;
	}
	
	public Card(int[] numbers) {
		size = 12;
		this.numbers = numbers;
	}

	public int getSize() {
		return size;
	}

	public int[] getNumbers() {
		return numbers;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}
}
