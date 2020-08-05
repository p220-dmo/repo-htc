package fr.htc.heritage.avecETsans.sans.entity;

public class Lion {
	private String race;
	private String name;
	private int age;
	

	
	public Lion(String race, String name, int age) {
		this.race = race;
		this.name = name;
		this.age = age;
	}

	
	public void describe(){
		System.out.println("Je suis un Lion de la race " 
	+ race + ", je m'appel " + name + " : J'ai " + age + "ans");
	}


	public String getRace() {
		return race;
	}


	public void setRace(String race) {
		this.race = race;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
