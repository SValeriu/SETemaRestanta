package Clase;

//this is a singletone class
public class SingleFactory {

	//create an object of SingleFactory
	private static SingleFactory instance = new SingleFactory();
	
	//make the constructor private so that this class cannot be
	//instantiated
	private SingleFactory(){}
	
	//get the only object available
	public static SingleFactory getInstance(){
		return instance;
	}
	
	//display message
	public void displayMessage(){
		System.out.println("Hello world");
	}
}
