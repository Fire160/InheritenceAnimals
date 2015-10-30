public class Bat extends Mammal
	{
	public Bat()
		{
		name = "Bat";
		food = "insects";
		myFly = (FlightBehavior) new CannotFly();
		}
	public void makeNoise()
		{
		System.out.println("The bat says Mommy?... Daddy?");
		}
	}
