package fr.htc.exception;

public class TestException {

	public static void main(String[] args) {
		System.out.println("Avant");
		try{ 
			int x= 5/0;
					}catch (Exception e) {
						System.out.println("Passer � la deuxi�me �tape");
					}
		
		System.out.println("Apr�s");

	}

}
