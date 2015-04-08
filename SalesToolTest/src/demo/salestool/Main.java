package demo.salestool;

public class Main {

	private static void displayGreeting() {
		System.out.println("HELLO HAPPY SALES PEOPLE");
		System.out.println("THIS APP SHOWS SALES DATA");
		
		System.out.println("Test 1");
		System.out.println("Test 2");
	}

	public static void main(String[] args) {

		SaleData data = new SaleData();
		displayGreeting();
		data.display();

	}

}
