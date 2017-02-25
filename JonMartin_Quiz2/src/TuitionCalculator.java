import java.util.Scanner;
public class TuitionCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		final double NUM_YEARS = 4;
		System.out.println("What is the initial tuition cost?");
		double initialCost = scn.nextDouble();
		System.out.println("What is the percent increase per year?");
		double percentIncrease = scn.nextDouble();
		scn.close();
		System.out.printf("Your estimated tuition cost for 4 years will be $%.2f.",
			getCost(initialCost, percentIncrease, NUM_YEARS));
	}
	
	private static double getCost(double p, double r, double t){
		double finalCost = p;
		for(int i = 0; i < t; i++){
			finalCost *= (1+(r/100));
		}
		return finalCost;
	}

}
