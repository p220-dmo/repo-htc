package fr.htc.mairie.impot;

import static fr.htc.mairie.common.Constants.TARIF_IMPOT_PER_10_EMPLOYEES;

public class HabitationProfessionnelle extends Habitation {
	private int nbEmployees;
	

	public HabitationProfessionnelle(String owner, String address, double area) {
		super(owner, address, area);

	}

	public HabitationProfessionnelle(String owner, String address, double area, int nbEmployees) {
		super(owner, address, area);
		this.nbEmployees = nbEmployees;
		
	}
	@Override 
	public double impot() {
		return super.impot() 
				+ (this.nbEmployees/10 * TARIF_IMPOT_PER_10_EMPLOYEES);
	
	}

	public int getNbEmployees() {
		return nbEmployees;
	}

	public void setNbEmployees(int nbEmployees) {
		this.nbEmployees = nbEmployees;
	}
	
	public void print (){
		super.print();
		System.out.println("Salary count : " + this.nbEmployees) ;
		System.out.println("Taxe         : " + this.impot()) ;
	}

	@Override
	public String toString() {
		return super.toString() +  "\n\tHabitationProfessionnelle [nbEmployees=" + nbEmployees + "]";
	}
	
	
	
}

