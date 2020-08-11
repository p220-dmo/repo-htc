package fr.htc.mairie.impot;

import static fr.htc.mairie.common.Constants.TARIF_IMPOT_METRE_CARRE;

public class Habitation {
	private String owner;
	private String address;
	private double area;

	public Habitation(String owner, String address, double area) {
		this.owner = owner;
		this.address = address;
		this.area = area;
	}

	public double impot() {
		return this.area * TARIF_IMPOT_METRE_CARRE;
	}

	@Override
	public String toString() {
		return "Habitation [owner=" + owner + ", address=" + address + ", area=" + area + "]";
	}

	public void print() {
		System.out.println(" ********* Owner : " + this.owner + "  ********* ");
		System.out.println("Address : " + this.address);
		System.out.println("Area	: " + this.area + " m2");
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

}
