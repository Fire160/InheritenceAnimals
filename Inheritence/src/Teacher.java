public class Teacher extends Mammal
	{
	public Teacher()
		{
		name = "Teacher";
		food = "Souls";
		}
	FlightBehavior myFly = (FlightBehavior) new CannotFly();
	public void makeNoise()
		{
		System.out.println("The teacher says do your homework!");
		}
	public void bearYoung() 
		{
		System.out.println("Ohh a cute little baby student!");
		}
	}
