package spring.promotion.engine.runpromotionengine;

import spring.promotion.engine.calculateordervalue.CalculateOderValueCost;

public class RunPromotionEngine {

	private CalculateOderValueCost calculate;

	private int total;

	private int option;

	public RunPromotionEngine(CalculateOderValueCost calculate) {
		this.total = 0;
		this.calculate = calculate;
		this.option = 1;
	}

	public int execute(int skuIdA, int skuIdB, int skuIdC, int skuIdD) {

		switch (option) {
		case 1:

			total = calculate.calculateTotalCost(skuIdA, skuIdB, skuIdC, skuIdD);

			break;

		default:
			break;
		}

		return total;
	}

}
