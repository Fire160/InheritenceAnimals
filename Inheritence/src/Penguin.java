public class Penguin extends Bird
	{
	public Penguin()
		{
		name = "Penguin";
		food = "fish";
		}
	FlightBehavior myFly = (FlightBehavior) new CannotFly();
	public void makeNoise()
		{
		System.out.println("The penguin says Squwak!");
		}
	public void flies()
		{
		// TODO Auto-generated method stub
		}
	}
