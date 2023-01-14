package game;

public class SelectedNumber {
	private int selectedNumber;

	public SelectedNumber(int selectedNumber) {
		this.selectedNumber = selectedNumber;
	}

	public int getSelectedNumber() {
		return selectedNumber;
	}

	public void setSelectedNumber(int selectedNumber) {
		this.selectedNumber = selectedNumber;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return selectedNumber + "";
	}
}
