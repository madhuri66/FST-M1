package activities;

abstract class Book {
	String title;
	
	public abstract void setTitle(String title);
	public String getTitle() {
		return this.title;
	}
}

class MyBook extends Book {

	public void setTitle(String title) {
		this.title = title;	
	}
}

public class Activity5 {
	public static void main(String[] args) {
		MyBook MB = new MyBook();
		MB.setTitle("Arebian Nights");
		System.out.println(MB.getTitle());
	}
}
