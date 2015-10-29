public class Robin extends Bird
	{
	public Robin()
		{
		name = "Robin";
		food = "worms";
		}
	FlightBehavior myFly = (FlightBehavior) new CannotFly();
	public void makeNoise()
		{
		System.out.println("The robin says Wowwie Zowwie Batman!");
		}
	}
