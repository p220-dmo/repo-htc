package fr.htc.heritage.main;

import fr.htc.heritage.ellipse.Circle;
import fr.htc.heritage.ellipse.Ellipse;
import fr.htc.heritage.person.Etudiant;
import fr.htc.heritage.person.Personne;

public class RunItLiza {

	public static void main(String[] args) {
		// ** Person
		Personne p = new Personne();
		Etudiant etudiant = new Etudiant();
		
		
		// ** Circle
		Ellipse e = new Ellipse(2.0, 2.0);
		Circle c = new Circle(2.0);
		System.out.println(" Aire de e : " + e.area());
		System.out.println(" Aire de c : " + c.area());
		
		System.out.println("============");
		System.out.println(e instanceof Circle);
		System.out.println(e instanceof Ellipse);
		System.out.println(c instanceof Circle);
		System.out.println(c instanceof Ellipse);
		System.out.println("============");
		System.out.println(e instanceof Object);
		System.out.println(c instanceof Object);
		System.out.println("============");
		c.getRadius();
		
		e = c;
		System.out.println(e instanceof Circle);
		System.out.println(e instanceof Ellipse);
		
		c = (Circle) e; 
		
		
		
		
		
		
	}

}
