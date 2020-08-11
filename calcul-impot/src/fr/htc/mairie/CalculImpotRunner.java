package fr.htc.mairie;

import fr.htc.mairie.impot.Habitation;
import fr.htc.mairie.impot.HabitationIndividuelle;

public class CalculImpotRunner {

	public static void main(String[] args) {
		
		Habitation h1 = new Habitation("Djamel MOUCHENE", "40 rue de la joie 95200 Cergy", 150);
		Habitation h2 = new Habitation("Djamel MOUCHENE", "40 rue de la joie 95200 Cergy", 150);
		Habitation h3 = new Habitation("Djamel MOUCHENE", "40 rue de la joie 95200 Cergy", 150);
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);

		HabitationIndividuelle hi1 = new HabitationIndividuelle("Djamel MOUCHENE", "40 rue de la joie 95200 Cergy", 150, 4, true);
		HabitationIndividuelle hi2 = new HabitationIndividuelle("Djamel MOUCHENE", "40 rue de la joie 95200 Cergy", 150, 4, false);
		System.out.println(hi1.impot());
		System.out.println(hi2.impot());
	}

}
