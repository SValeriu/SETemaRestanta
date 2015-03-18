package Main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Clase.HeroFactory;
import Composite.Player;
import Interfete.IHero;

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		HeroFactory object = HeroFactory.getInstance();
		
		IHero warrior = object.getHero("Warrior");
		warrior.attack();
		
		IHero hunter = object.getHero("Hunter");
		hunter.attack();
		
		IHero warlock = object.getHero("WarloCK");
		warlock.attack();
		
		
		Player player1 = new Player("Nighthunter", "nighthunter@mail.com");
		Player player2 = new Player("Friend1", "friend1@mail.com");
		Player player3 = new Player("Friend2", "friend2@mail.com");
		
		
		player1.addFriend(player2);
		player1.addFriend(player3);

		player1.addCharacter(hunter);
		player1.addCharacter(warlock);
		
		System.out.println("\nFriend list:");
		for(Player p : player1.getFriendList()){
			System.out.println(p);
		}
		
		System.out.println("\nCharacter list:");
		for(IHero h : player1.getCharacterList()){
			System.out.println(h);
		}
		
		
	}

}
