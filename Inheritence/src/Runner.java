import java.util.ArrayList;
import java.util.Scanner;

public class Runner
	{
	public static void main(String[] args)
		{
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Cow());
		animals.add(new Penguin());
		animals.add(new Bat());
		animals.add(new Robin());
		//animals.add(new Teacher());
		Scanner things = new Scanner(System.in);
		boolean yes = true;
		while(yes == true)
			{
			printAnimals(animals);
			System.out.println("Please select an animal to see it's info or anything else to leave!");
			int choice = things.nextInt() - 1;
			if(choice > -1 && choice < animals.size())
				{
				animals.get(choice).eat();
				animals.get(choice).makeNoise();
				animals.get(choice).bearYoung();
				animals.get(choice).myFly.flies();;
				}
			else
				{
				yes = false;
				}
			}
		things.close();
		}
	public static void printAnimals(ArrayList<Animal> animals)
		{
		for(int i = 0; i < animals.size(); i++)
			{
			System.out.println("[" + (i + 1) + "] " + animals.get(i).getName());
			}
		}
	}
