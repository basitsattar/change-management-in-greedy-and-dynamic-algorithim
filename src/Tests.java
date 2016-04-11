import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import junit.framework.Assert;

public class Tests {

	@SuppressWarnings("deprecation")
	@Test
	public void testGreedy() {
		ChangeClass.resultSet =new ArrayList<Integer>();
		int[] coins = {1,5,10,25};
		int expectedResult = 6;
		int actualOutcome = ChangeClass.greedyAlgorithim(39, coins);
		Assert.assertEquals(expectedResult,actualOutcome);
		

	}

	@Test
	public void testDynamic(){
		
		ChangeClass.resultSet =new ArrayList<Integer>();
		int[] coins = {1,5,10,25};
		int expectedResult = 6;
		int actualOutcome = ChangeClass.dynamicPogrammingAlgorithim(39, coins);
		Assert.assertEquals(expectedResult,actualOutcome);
	}
}
