package fcu.iecs.oop.pokemon;

public class Charmander extends Pokemon{

	Charmander(String name, PokemonType type, int cp) {
		super(name,type,cp);
	}
	
	public void attack()
	{
		System.out.println("Ember¡K");
	}
	
}
