
public class ShowInterface {
	public static void main(String[] args) {
		TestInterface();
		
		
	}
	private static void TestInterface() {
		System.out.println("Welcome to the new Interface!");
		OldCoffeeMachine oldCoffeeMachine = new OldCoffeeMachine();
		CoffeeTouchScreenAdapter adapter = new CoffeeTouchScreenAdapter(oldCoffeeMachine);
		adapter.chooseFirstSelection();
		adapter.chooseSecondSelection();
		
	}

}
