
public class CloseGate implements GateState {

	public void doAction(Client context) {
		System.out.println("the Gate is closed");
		context.setgateState(this);
	}

	public String toString(){
		return "Close State";
	}
}