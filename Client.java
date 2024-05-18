/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ghoda
 */
public class Client {
	
	private ClineState state;
	
	public Client(){
		state = null;}
	
	public void setclientState(ClineState state){
		this.state = state;}
	
	public ClineState getclientState(){
		return state;}
}
