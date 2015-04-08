package demo.salestool;

public class SaleData {

	int[] data = { 1, 2, 3 };

	public void display() {
		System.out.println("Data: ");
		for (int i = 0; i < data.length; i++) {
			System.out.println("Next value: " + data[i]);
		}
	}

}
