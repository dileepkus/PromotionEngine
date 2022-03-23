package spring.promotion.engine.calculateordervalue;

public class CalculateOderValueCost {

	public static final int PRICE_SKUA = 50;
	public static final int PRICE_COMBO_SKUA = 130;
	public static final int PRICE_SKUB = 30;
	public static final int PRICE_COMBO_SKUB = 45;
	public static final int PRICE_SKUC = 20;
	public static final int PRICE_SKUD = 15;
	public static final int PRICE_COMBO_SKUCD = 30;
	public int total =0;
	
	
	public int calculateTotalCost(int quantityA, int quantityB, int quantityC, int quantityD ) {
		
		
		  total = calculateSkuIdA(quantityA, total);
		  total = calculateSkuIdB(quantityB, total);
		  total = calculateSkuIdCAndD(quantityC, quantityD, total);
		
		
		return total ;
	}


	private int calculateSkuIdA(int quantityA, int total) {
		if (quantityA >= 3) {
			int quotient = quantityA / 3;
			int remainder = quantityA % 3;

			total = (quotient >= 0) ? total + quotient * PRICE_COMBO_SKUA : total;

			total = (remainder >= 0) ? total + remainder * PRICE_SKUA : total;
		} else {

			total = total + quantityA * PRICE_SKUA;
		}
		
		return total;
	}

	private int calculateSkuIdB(int quantityB, int total) {
		if (quantityB >= 2) {
			int quotient = quantityB / 2;
			int remainder = quantityB % 2;

			total = (quotient >= 0) ? total + quotient * PRICE_COMBO_SKUB : total;

			total = (remainder >= 0) ? total + remainder * PRICE_SKUB : total;
		} else {

			total = total + quantityB * PRICE_SKUB;
		}
		
		return total;
	}
	
	private int calculateSkuIdCAndD(int quantityC, int quantityD, int total) {
		
		if(quantityC >=1 && quantityD >=1 ) {
			
			total = (quantityC == quantityD ) ? total + quantityC*PRICE_COMBO_SKUCD : total;
			
			total = (quantityC > quantityD ) ?  total + (quantityD*PRICE_COMBO_SKUCD  + (quantityC - quantityD )*PRICE_SKUC) : total ;
			
			total = (quantityD > quantityC ) ?  total + (quantityC*PRICE_COMBO_SKUCD  + (quantityD - quantityC )*PRICE_SKUD) : total;
			
		}else {
			total =total + quantityC * PRICE_SKUC;
			
			total =total + quantityD * PRICE_SKUD;
		}
		return total;
	}
	
	
}
