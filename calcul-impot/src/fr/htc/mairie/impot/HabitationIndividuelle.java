package fr.htc.mairie.impot;

import static fr.htc.mairie.common.Constants.TARIF_IMPOT_PER_ROOM;
import static fr.htc.mairie.common.Constants.TARIF_IMPOT_SWIMING_POOL;

public class HabitationIndividuelle extends Habitation {
	private int roomCount;
	private boolean haveSwimingPool;

	public HabitationIndividuelle(String owner, String address, double area) {
		super(owner, address, area);

	}

	public HabitationIndividuelle(String owner, String address, double area, int roomCount, boolean haveSwimingPool) {
		super(owner, address, area);
		this.roomCount = roomCount;
		this.haveSwimingPool = haveSwimingPool;
	}

	@Override
	public double impot() {
		return super.impot() + this.roomCount * TARIF_IMPOT_PER_ROOM
				+ (this.getHaveSwimingPool() == true ? TARIF_IMPOT_SWIMING_POOL : 0.0);
	}

	public int getRoomCount() {
		return roomCount;
	}

	public void setRoomCount(int roomCount) {
		this.roomCount = roomCount;
	}

	public boolean getHaveSwimingPool() {
		return haveSwimingPool;
	}

	public void setHaveSwimingPool(boolean haveSwimingPool) {
		this.haveSwimingPool = haveSwimingPool;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Romm Count 		  : " + this.roomCount);
		System.out.println("Have Swiming Pool : " + this.haveSwimingPool);
		System.out.println("Taxe	: " + this.impot() + " €");
	}

	@Override
	public String toString() {
		return super.toString() +  "\n\tHabitationIndividuelle [roomCount=" + roomCount + ", haveSwimingPool=" + haveSwimingPool + "]";
	}
	
	


}
