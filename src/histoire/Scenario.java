package histoire;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		Romain minus = new Romain("Minus", 6);
		Gaulois obelix = new Gaulois("Obelix", 25);
		Druide panoramix = new Druide("Panoramix", 5, 10);
		
		
		
		panoramix.prendreParole();
		panoramix.parler("Je vais aller préparer une petite potion...");
		panoramix.preparerPotion();
		panoramix.booster(obelix);
		obelix.prendreParole();
		obelix.parler(" Par Bélénos, ce n'est pas juste !");
		panoramix.booster(obelix);
		asterix.prendreParole();
		asterix.parler("Merci Druide, je sens que ma force est 6 fois décuplée.");
		asterix.prendreParole();
		asterix.parler("Bonjours a tous");
		minus.prendreParole();
		minus.parler(" UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
	}

}
