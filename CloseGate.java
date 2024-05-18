
public class CloseGate implements ClineState {

	public void doAction(Client context) {
		System.out.println("the Gate is closed");
		context.setclientState(this);
	}

	public String toString(){
		return "Close State";
	}
}
