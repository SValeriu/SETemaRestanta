package Composite;

import java.util.ArrayList;
import java.util.List;

import Exceptii.PlayerException;
import Interfete.IHero;

public class Player {
	private String name;
	private String email;
	private List<Player> friends;
	private List<IHero> characters;

	//constructor
	public Player(String name, String email){
		this.name = name;
		this.email = email;
		this.friends = new ArrayList<Player>();
		this.characters = new ArrayList<IHero>();
	}
	
	//getName
	public String getName(){
		return this.name;
	}
	
	// add friend
	public void addFriend(Player p) throws PlayerException{
		friends.add(p);
	}
	
	//remove friend
	public void removeFriend(Player p) throws PlayerException{
		friends.remove(p);
	}
	
	//get list of friends
	public List<Player> getFriendList(){
		return friends;
	}
	
	//add character
	public void addCharacter(IHero h) throws PlayerException{
		characters.add(h);
	}
	
	//remove character
	public void removeCharacter(IHero h) throws PlayerException{
		characters.remove(h);
	}
	
	//get list of characters
	public List<IHero> getCharacterList(){
		return characters;
	}
	
	public String toString(){
		return (name + "  " + email);
	}
}
