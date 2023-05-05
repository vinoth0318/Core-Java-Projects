package org.bike;

public class Ktm implements Bike {

	@Override
	public void cost() {
		System.out.println("Bike Cost : 1lac");
	}

	@Override
	public void speed() {
		System.out.println("Bike Speed : 120");
		
	}
	public static void main(String[] args) {
		Ktm b = new Ktm();
		b.cost();
		b.speed();
	}

}
