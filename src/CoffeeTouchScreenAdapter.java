
public class CoffeeTouchScreenAdapter implements CoffeMachineInterface {

	OldCoffeeMachine cMachine;

	public CoffeeTouchScreenAdapter(OldCoffeeMachine newMachine) {
		cMachine = newMachine;
	}
	
	@Override
	
	public void chooseFirstSelection() {
		cMachine.selectA();
	}
	
	@Override
	
	public void chooseSecondSelection() {
		cMachine.selectB();
}
	
}
