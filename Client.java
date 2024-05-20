package Parking;
public class Client {
	
	private GateState state;
	
	public Client(){
		state = null;}
	
	public void setgateState(GateState state){
		this.state = state;}
	
	public GateState getgateState(){
		return state;}
}