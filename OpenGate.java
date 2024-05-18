
public class OpenGate implements GateState {

	public void doAction(Client context) {
		System.out.println("the Gate is Open");
		context.setgateState(this);
	}

	public String toString(){
		return "Open State";
	}
}