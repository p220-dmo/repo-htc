package fr.htc.heritage.avecETsans.avec;

import java.util.ArrayList;

import fr.htc.heritage.avecETsans.avec.entity.Animal;
import fr.htc.heritage.avecETsans.avec.entity.Chat;
import fr.htc.heritage.avecETsans.avec.entity.Chien;
import fr.htc.heritage.avecETsans.avec.entity.Lion;

public class RuntIt {

	public static void main(String[] args) {
		ArrayList<Animal> animals = new ArrayList<Animal>();
		Chat ch1 = new Chat("Ciamois", "minou", 5);
		Chat ch2 = new Chat("Persan", "Grisou", 3);

		animals.add(ch1);
		animals.add(ch2);

		Chien chien1 = new Chien("BitBull", "Rex", 7);
		Chien chien2 = new Chien("Chiwawa", "Trico", 5);

		animals.add(chien1);
		animals.add(chien2);

		Lion lion1 = new Lion("Atlas", "Gabi", 12);
		Lion lion2 = new Lion("Afrique", "Mamadou", 8);
		animals.add(lion1);
		animals.add(lion2);

		
		
		
		
		for (Animal animal : animals) {
			animal.describe();
		}
		
		System.out.println("================");
		
		
		
		for (int i = 0; i < animals.size(); i++) {
			animals.get(i).describe();
		}

	}

}
