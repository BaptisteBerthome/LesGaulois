package personnages;

public class Romain {

	private String nom;
	private int force;
	private Equipement[] equipements;
	private int nbEquipements = 0;

	public Romain(String nom, int force) {
		forcePositif();
		this.nom = nom;
		this.force = force;
		this.equipements = new Equipement[2];
	}

	private void forcePositif() {
		assert force > 0;
	}
	
	public String getNom() {
		// TODO Auto-generated method stub
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + texte);

	}

	public String prendreParole() {
		// TODO Auto-generated method stub
		return "Le romain "+nom+" : ";
	}

	public void recevoirCoup(int forceCoup) {
		forcePositif();
		int forceAvantCoup = force;
		force -= forceCoup;
		if (force > 0) {
			parler("Aie!!");
		} else {
			parler("J'abandonne");
		}
		assert forceAvantCoup > force;
	}
	public enum Equipement{
		CASQUE("Casque"),
		BOUCLIER("Bouclier");
		
		private String nom;
		
		private Equipement(String nom) {
			this.nom = nom;
		}
		public String toString(){
			return nom;
		}
	}

	
	 private void afficherDejaEquipe(Equipement equipementSoldat) {
	        System.out.println("Le soldat " + nom + " possède déjà un " + equipementSoldat + " !");
	    }
	
	 private void ajouterEquipement(Equipement equipementSoldat) {
	        System.out.println("Le soldat " + nom + " s'équipe avec un " + equipementSoldat + ".");
	        equipements[nbEquipements] = equipementSoldat;
	        nbEquipements++;
	    }
	 
	
	 public void sEquiper(Equipement equipementSoldat) {
	        switch (nbEquipements) {
	            case 2:
	                System.out.println("Le soldat " + nom + " est déjà bien protégé !");
	                break;

	            case 1:
	                if (equipements[0] == equipementSoldat) {
	                    afficherDejaEquipe(equipementSoldat);
	                } else {
	                    ajouterEquipement(equipementSoldat);
	                }
	                break;

	            case 0:
	                ajouterEquipement(equipementSoldat);
	                break;
	        }
	    }
	
	public static void main(String[] args) {
		Romain unRomain = new Romain("Romain", 8);
		System.out.println(unRomain);
		unRomain.prendreParole();
		unRomain.parler("je suis un Romain");
		unRomain.recevoirCoup(3);
		
		System.out.println(Equipement.CASQUE);
		System.out.println(Equipement.BOUCLIER);
	}
}
