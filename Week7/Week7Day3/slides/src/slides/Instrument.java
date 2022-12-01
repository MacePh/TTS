package slides;

abstract class Instrument {
	public abstract void createSound();
	

public static void main(String args[]){
	Instrument guitar = new Guitar();
	guitar.createSound();
	
 }
}

