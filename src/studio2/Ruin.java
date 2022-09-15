package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is your start amount?");
		double startAmount = in.nextDouble();
		//
		System.out.println("What is your chance of winning between 0.0 and 1.0?");
		double winChance = in.nextDouble();
		//
		System.out.println("What is your win limit between 0.0 and 1.0?");
		double winLimit = in.nextDouble();
		//
		System.out.println("What are the number of times you played?");
		int totalSimulations = in.nextInt();
		
		String a = "";
		for(int i=0; i<totalSimulations; i++)
		{
			double chance = Math.random();
		
			if (startAmount==winLimit) {
				break;
			}
			if(chance > winLimit) {
				startAmount--;
				a = "LOSE";
							}
			else {
				startAmount++;
				a = "WIN";
			}
			System.out.println("Simulation" + i + ":" + chance + " " + a);
		}
			
	}

}
