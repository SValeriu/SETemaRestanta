package Main;

import Clase.HeroFactory;
import Clase.SingleFactory;
import Interfete.IHero;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HeroFactory object = HeroFactory.getInstance();
		
		IHero warrior = object.getHero("Warrior");
		warrior.attack();
		
		IHero hunter = object.getHero("Hunter");
		hunter.attack();
		
		IHero warlock = object.getHero("WarloCK");
		warlock.attack();
	}

}
