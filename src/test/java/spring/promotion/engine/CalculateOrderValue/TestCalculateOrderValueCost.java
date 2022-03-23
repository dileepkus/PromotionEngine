package spring.promotion.engine.CalculateOrderValue;


import spring.promotion.engine.calculateordervalue.CalculateOderValueCost;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TestCalculateOrderValueCost {

private CalculateOderValueCost caltest = new CalculateOderValueCost();
	
	

	@Test
	public void testCalculation1() {
		int result = caltest.calculateTotalCost(1,1,1,0);
	
		assertThat(result).isEqualTo(100);
	}

	@Test
	public void testCalculation2() {
		int result = caltest.calculateTotalCost(5,5,1,0);
		
		assertThat(result).isEqualTo(370);
	}
	
	
	@Test
	public void testCalculation3() {
		int result = caltest.calculateTotalCost(3,5,1,1);
		
		assertThat(result).isEqualTo(280);
	}
	
}
