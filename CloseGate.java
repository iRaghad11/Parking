package Parking;
public class CloseGate implements GateState {

	public void doAction(Client context) {
		System.out.println("The gate is closed");
		context.setgateState(this);
	}

	public String toString(){
		return "Close State";
	}
}