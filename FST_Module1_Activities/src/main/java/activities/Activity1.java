package activities;

public class Activity1 {

	public static void main(String[] args) {
		Car carObj= new Car("White","Manual",2022,4,4);
		carObj.displayCharacteristics();
		carObj.accelarate();
		carObj.brake();
	}

}
