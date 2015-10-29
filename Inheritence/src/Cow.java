public class Cow extends Mammal
	{
	public Cow()
		{
		name = "Cow";
		food = "grass";
		}
	FlightBehavior myFly = (FlightBehavior) new CannotFly();
	public void makeNoise()
		{
		System.out.println("The cow says MOOOOOOO!!!!");
		}
	}
