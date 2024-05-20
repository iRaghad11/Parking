package Parking;
public abstract class CleanDecorator implements Clean { 
	
	protected Clean decoratedClean;
 
	public CleanDecorator(Clean decoratedClean){ 
		this.decoratedClean = decoratedClean; 
	} 

	public void cleans(){ 
		decoratedClean.cleans(); 
	} 
} 