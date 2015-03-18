package Composite;

import static org.junit.Assert.*;

import org.junit.Test;

import Clase.HeroFactory;
import Interfete.IHero;

public class PlayerTest {

	@Test
	public void testAddFriend() {
		Player player1 = new Player("test1", "test@mail.com");
		Player player2 = new Player("test2", "test@mail.com");
		try{
			player1.addFriend((player2));
			assertEquals(player1.getFriendList().size(), 1);
		}
		catch(Exception e){
			System.out.println(e);
		}		
	}

	@Test
	public void testAddCharacter() {
		HeroFactory object = HeroFactory.getInstance();
		IHero warrior = object.getHero("Warrior");
		IHero hunter = object.getHero("Hunter");
		
		Player player1 = new Player("test1", "test@mail.com");
		try{
			player1.addCharacter(hunter);
			player1.addCharacter(warrior);
			assertEquals(player1.getCharacterList().size(), 2);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
