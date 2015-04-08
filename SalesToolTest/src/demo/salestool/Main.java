package demo.salestool;

public class Main {

	private static void displayGreeting() {
		System.out.println("Hello Happy Sales People");
		System.out.println("This app shows sales data");
		System.out.println("-------------------------");
		
		System.out.println("Test 1");
		System.out.println("Test 2");
	}

	public static void main(String[] args) {

		SaleData data = new SaleData();
		displayGreeting();
		data.display();

	}

}
