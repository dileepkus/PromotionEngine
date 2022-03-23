package spring.promotion.engine.RunPromotionEngine;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Matchers.anyInt;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import spring.promotion.engine.calculateordervalue.CalculateOderValueCost;
import spring.promotion.engine.runpromotionengine.RunPromotionEngine;

@RunWith(MockitoJUnitRunner.class)
public class TestRunPromotionEngine {

	@Mock
	private CalculateOderValueCost calculate;

	private RunPromotionEngine runtest;

	@Before
	public void setup() {
		calculate = Mockito.mock(CalculateOderValueCost.class);

		runtest = new RunPromotionEngine(calculate);

	}
	
	@Test
	public void testExecution1() {

		Mockito.when(calculate.calculateTotalCost(anyInt(), anyInt(), anyInt(), anyInt())).thenReturn(100);

		int total = runtest.execute(1,1,1,0);

		assertThat(total).isEqualTo(100);

	}
	
	@Test
	public void testExecution2() {

		Mockito.when(calculate.calculateTotalCost(anyInt(), anyInt(), anyInt(), anyInt())).thenReturn(370);

		int total = runtest.execute(5,5,1,0);

		assertThat(total).isEqualTo(370);

	}
	
	@Test
	public void testExecution3() {

		Mockito.when(calculate.calculateTotalCost(anyInt(), anyInt(), anyInt(), anyInt())).thenReturn(280);

		int total = runtest.execute(3,5,1,1);

		assertThat(total).isEqualTo(280);

	}

}
