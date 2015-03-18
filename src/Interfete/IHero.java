package Interfete;

import Exceptii.HeroException;

public interface IHero {
	void attack() throws HeroException;
	String toString();
}
