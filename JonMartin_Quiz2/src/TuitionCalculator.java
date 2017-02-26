import java.util.Scanner;
public class TuitionCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		final int NUM_YEARS = 4;
		final int TIMES_COMPNDED = 1;
		System.out.println("What is the initial tuition cost?");
		double initialCost = scn.nextDouble();
		System.out.println("What is the percent increase per year?");
		double percentIncrease = scn.nextDouble();
		scn.close();
		System.out.printf("Your estimated tuition cost for 4 years will be $%.2f.",
			getCost(initialCost, percentIncrease, TIMES_COMPNDED, NUM_YEARS));
	}
	
	public static double getCost(double p, double r, int n, int t){
		double finalCost = p;
		double compound = 1;
		for(int i = 1; i <= t; i++)
			compound *= Math.pow((1 + (r/100)/(double)n), n);
		finalCost *= compound;
		return finalCost;
	}
}
