package fcu.iecs.oop.pokemon;

public abstract class Pokemon
{
    	private final String      name;
    	private       int           cp;
    	private final PokemonType type;
		
    	
    	
    	Pokemon(String name, PokemonType type, int cp) {
			this.name = name;
			this.cp = cp;
			this.type = type;
		}
    	
		

		public int getCp() {
			return cp;
		}
		public void setCp(int cp) {
			this.cp = cp;
		}
		public String getName() {
			return name;
		}
		public PokemonType getType() {
			return type;
		}

		public abstract void attack();

}
