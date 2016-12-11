package insa.projet.leboncours;

public class Reservation {

	private int jour;
	private int heure;
	private Eleve eleve;
	
	public int getJour() {
		return jour;
	}
	public void setJour(int jour) {
		this.jour = jour;
	}
	public int getHeure() {
		return heure;
	}
	public void setHeure(int heure) {
		this.heure = heure;
	}
	public Eleve getEleve() {
		return eleve;
	}
	public void setEleve(Eleve eleve) {
		this.eleve = eleve;
	}
	
	public Reservation(int jour, int heure, Eleve eleve) {
		this.jour = jour;
		this.heure = heure;
		this.eleve = eleve;
	}
	
	
	
}
