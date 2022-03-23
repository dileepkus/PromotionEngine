package spring.promotion.engine.runfinalruleengine;

import java.util.Scanner;

import spring.promotion.engine.calculateordervalue.CalculateOderValueCost;
import spring.promotion.engine.runpromotionengine.RunPromotionEngine;

public class RunFinalRuleEngine {

	public static void main(String[] args) {
		CalculateOderValueCost calculate = new CalculateOderValueCost();
		RunPromotionEngine engine = new RunPromotionEngine(calculate);
		
		System.out.println("===== Promotion Engine =====");

		Scanner sc = new Scanner(System.in);


		System.out.println("Enter quantity of SKUID A");
		int skuIdA = sc.nextInt();

		System.out.println("Enter quantity of SKUID B");

		int skuIdB = sc.nextInt();

		System.out.println("Enter quantity of SKUID C");

		int skuIdC = sc.nextInt();

		System.out.println("Enter quantity of SKUID D");

		int skuIdD = sc.nextInt();
		
		int total = engine.execute(skuIdA, skuIdB, skuIdC, skuIdD);
		
		System.out.println(" Total Calculated Cost " + total);
		
	}
	
}
