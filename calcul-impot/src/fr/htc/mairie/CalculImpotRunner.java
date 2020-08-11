package fr.htc.mairie;

import java.util.ArrayList;
import java.util.List;

import fr.htc.mairie.impot.Habitation;
import fr.htc.mairie.impot.HabitationIndividuelle;
import fr.htc.mairie.impot.HabitationProfessionnelle;

public class CalculImpotRunner {

	public static void main(String[] args) {
		
		List<Habitation> habitations = new ArrayList<Habitation>();
		
		Habitation h1 = new Habitation("Djamel MOUCHENE", "40 rue de la joie 95200 Cergy", 150);
		habitations.add(h1);
		Habitation h2 = new HabitationIndividuelle("Pizza SEGHOUANE", "40 rue de la joie 95200 Cergy", 150, 4, true);
		habitations.add(h2);
		
		HabitationProfessionnelle h3 = new HabitationProfessionnelle("Raouf RETIMATOU", "40 rue de la joie 95200 Cergy", 150, 20);
		habitations.add(h3);
		Habitation h4 = new HabitationIndividuelle("Pizza SEGHOUANE", "40 rue de la joie 95200 Cergy", 150, 4, true);
		habitations.add(h4);
		Habitation h5 = new HabitationIndividuelle("Pizza SEGHOUANE", "40 rue de la joie 95200 Cergy", 150, 4, true);
		habitations.add(h5);
		
		HabitationProfessionnelle h6 = new HabitationProfessionnelle("Raouf RETIMATOU", "40 rue de la joie 95200 Cergy", 150, 20);
		habitations.add(h6);
		Habitation h8 = new HabitationIndividuelle("Pizza SEGHOUANE", "40 rue de la joie 95200 Cergy", 150, 4, true);
		habitations.add(h8);
		HabitationProfessionnelle h9 = new HabitationProfessionnelle("Raouf RETIMATOU", "40 rue de la joie 95200 Cergy", 150, 20);
		habitations.add(h9);
		
		for (Habitation habitation : habitations) {
			System.out.println(habitation);
			System.out.println("\t ==> TAXE = " + habitation.impot() + " €");
			System.out.println("\t ==> ===================");
		}
		
	}
}
