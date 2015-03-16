package Clase;

import Interfete.IHero;

public class HeroFactory {

	//create an object of SingleFactory
		private static HeroFactory instance = new HeroFactory();
		
		//make the constructor private so that this class cannot be
		//instantiated
		private HeroFactory(){}
		
		//get the only object available
		public static HeroFactory getInstance(){
			return instance;
		}
		
	//use getHero to get hero type
	public IHero getHero(String heroType){
		if(heroType == null){
			return null;
		}
		if(heroType.equalsIgnoreCase("Warrior")){
			return new Warrior();
		
		}else if(heroType.equalsIgnoreCase("Hunter")){
			return new Hunter();
			
		}else if(heroType.equalsIgnoreCase("Warlock")){
			return new Warlock();
		
		}	
		return null;
	}
}
