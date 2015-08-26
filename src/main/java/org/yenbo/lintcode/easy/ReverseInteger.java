package org.yenbo.lintcode.easy;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;
import org.yenbo.lintcode.util.SafeMath;

public class ReverseInteger {

	@Test
	public void test1() {
		Assert.assertEquals(321, reverseInteger(123));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(-321, reverseInteger(-123));
	}
	
	public int reverseInteger(int n) {
        
		boolean isNegative = (n < 0);
		
		if (isNegative) {
			n *= -1;
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while (n > 0) {
			list.add(n % 10);
			n /= 10;
		}
		
		int answer = 0;
		
		try {
			for (int i : list) {
				answer = SafeMath.safeAdd(SafeMath.safeMultiply(answer, 10), i);
			}
		} catch (ArithmeticException ex) {
			return 0;
		}
		
		if (isNegative) {
			return -answer;
		} else {
			return answer;
		}
	}
}
