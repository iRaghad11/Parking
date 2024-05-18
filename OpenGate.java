
public class OpenGate implements ClineState {

	public void doAction(Client context) {
		System.out.println("the Gate is Open");
		context.setclientState(this);
	}

	public String toString(){
		return "Open State";
	}
}
