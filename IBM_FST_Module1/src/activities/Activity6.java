package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane{
	private List<String> passangers;
	private int maxPassangers;
	private Date lastTakeOffTime;
	private Date lastLandingTime;
	
	Plane(int maxPassangers)
	{
		this.maxPassangers = maxPassangers;
		this.passangers = new ArrayList<String>();
	}
	public void onboard(String passangerNames) 
	{
		this.passangers.add(passangerNames);
	}
	public void setTakeOff()
	{
		this.lastTakeOffTime = new Date();
	}
	public Date getTakeOffTime() 
	{
		return lastTakeOffTime;
	}
	public void setLand()
	{
		this.lastLandingTime = new Date();
		this.passangers.clear();
	}
	public Date getLastTimeLanded() 
	{
		return lastLandingTime;
	}
	public List<String> getPassangers()
	{
		return this.passangers;
	}
}

public class Activity6 {

	public static void main(String[] args) throws InterruptedException {
		Plane plane = new Plane(10);
		
		plane.onboard("Madhuri");
		plane.onboard("Sujit");
		plane.onboard("Lokesh");
		
		plane.setTakeOff();
		System.out.println("Plane took off at: " + plane.getTakeOffTime());
		System.out.println("The passangers in the plane are: " +plane.getPassangers());
		
		System.out.println("Plane is Flying ... ");
		Thread.sleep(5000);
		
		plane.setLand();
		System.out.println("Plane landed at: " + plane.getLastTimeLanded());
		System.out.println("The passangers in the plane after landing: " +plane.getPassangers());
	}
}
