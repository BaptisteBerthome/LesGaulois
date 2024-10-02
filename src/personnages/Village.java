package personnages;



public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	

	public Village(String nom) {
		this.nom = nom;
	}
	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.villageois = new Gaulois[nbVillageoisMaximum];
		
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
        if (nbVillageois < villageois.length) {
            villageois[nbVillageois] = gaulois;
            nbVillageois++;
        }else{
            System.out.println("Le village est déjà au maximum de capacité !");
        }
	}
        
    public Gaulois trouverHabitant(int numero_habitant) {
    	return villageois[numero_habitant];
    }
    public void afficherVillageois() {
		System.out.println("dans le village de " + this.chef + "il y a les gaulois :");
		for (int i = 0; i < villageois.length; i++) {
			System.out.println("- " + villageois[i] + "\n");
		}
	}
    public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles", 30);
		//Gaulois gaulois = village.trouverHabitant(30);
		//exeption car tableau vide
		village.setChef(new Chef("Abraracourcix", 6, village));
		Gaulois asterix = new Gaulois("Asterix", 6);
		village.ajouterHabitant(asterix);
		
		//Gaulois gaulois = village.trouverHabitant(1);
		//System.out.println(gaulois);
		
		Gaulois obelix = new Gaulois("Obelix", 25);
		village.ajouterHabitant(obelix);
		
		village.afficherVillageois();
		
		
	}
}
