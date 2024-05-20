package Parking;
public class OpenGate implements GateState {

	public void doAction(Client context) {
		System.out.println("The gate is open");
		context.setgateState(this);
	}

	public String toString(){
		return "Open state";
	}
}