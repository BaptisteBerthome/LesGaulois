package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + texte);
	}

	public String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup a la machoire de " + romain.getNom());
		romain.recevoirCoup(force / 3 * effetPotion);
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	public void boirePotion(int potion) {
		effetPotion = potion;
		parler("Merci Druide, je sens que ma force est "+ potion + " fois décuplée. ");
	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		Romain unRomain = new Romain("Romain", 8);
		System.out.println(asterix);
		asterix.prendreParole();
		asterix.parler("je suis asterix");
		asterix.frapper(unRomain);
		asterix.boirePotion(8);
	}
}
