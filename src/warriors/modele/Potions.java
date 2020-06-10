package warriors.modele;

abstract public class Potions {
	
	private String name;
	private int heal;
	
	public Potions(String name, int heal) {
		this.name = name;
		this.heal = heal;
	}


	public int getHeal() {
		return heal;
	}
	
	public String getName() {
		return this.name;
	}
	@Override
	public String toString() {
		return "Potions Nom:" + name + ", Reg�n�ration:" + heal;
	}
	
	abstract public void draw();
	
}
