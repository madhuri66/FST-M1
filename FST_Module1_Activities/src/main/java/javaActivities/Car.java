package javaActivities;

public class Car {
	String color, transmission;
	int make, tyres, doors;

	Car(String color, String transmission, int make, int tyres, int doors) {
		this.color = color;
		this.transmission = transmission;
		this.make = make;
		this.tyres = tyres;
		this.doors = doors;
	}

	public void displayCharacteristics() {
		System.out.println("Color :" + color);
		System.out.println("Transmission type :" + transmission);
		System.out.println("Year of making :" + make);
		System.out.println("No. of tyres :" + tyres);
		System.out.println("No. of doors :" + doors);
	}

	public void accelarate() {
		System.out.println("Car is moving forward");
	}

	public void brake() {
		System.out.println("Car has stopped");
	}
}