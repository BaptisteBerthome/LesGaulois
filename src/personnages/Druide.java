package personnages;

import java.util.*;

public class Druide {
	private String nom;
	private int effetPotionMax;
	private int effetPotionMin;
	private int forcePotion = 1;
	private Random randomObject = new Random();

	public Druide(String nom, int effetPotionMax, int effetPotionMin) {
		this.nom = nom;
		this.effetPotionMax = effetPotionMax;
		this.effetPotionMin = effetPotionMin;
		parler("Bonjour je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " a "
				+ effetPotionMax);
	}

	public void parler(String texte) {
		// TODO Auto-generated method stub
		System.out.println(prendreParole() + texte);

	}

	public String prendreParole() {

		return "Le druide " + nom + " : ";
	}

	public void preparerPotion() {

		int effetPotion = randomObject.nextInt(effetPotionMin, effetPotionMax);
		if (effetPotion > 7) {
			System.out.println("J'ai préparé une super potion de force " + effetPotion);
		} else {
			System.out.println(
					"Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force " + effetPotion);
		}
		forcePotion = effetPotion;

	}

	public void booster(Gaulois gaulois) {

		if (gaulois.getNom() == "Obelix") {
			parler("Non, Obélix !... Tu n’auras pas de potion magique !");
		} else {
			gaulois.boirePotion(forcePotion);
		}

	}

	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix", 5, 10);
		panoramix.preparerPotion();

	}

}
