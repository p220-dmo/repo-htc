package fr.htc.heritage.avecETsans.sans;

import java.util.ArrayList;

import fr.htc.heritage.avecETsans.avec.entity.Chat;
import fr.htc.heritage.avecETsans.avec.entity.Chien;
import fr.htc.heritage.avecETsans.avec.entity.Lion;



public class RuntIt {

	public static void main(String[] args) {
		ArrayList<Object> animals = new ArrayList<Object>();
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
		
		
		
		
		
		
		
		
		for (int i = 0; i < animals.size(); i++) {
			Object obj = animals.get(i);
			if(obj instanceof Chien) {
				Chien chien = (Chien)obj;
				chien.describe();
			}
			if(obj instanceof Chat) {
				Chat chat = (Chat)obj;
				chat.describe();
			}
			if(obj instanceof Lion) {
				Lion lion = (Lion)obj;
				lion.describe();
			}
			
			
		}
		
		

	}

}
