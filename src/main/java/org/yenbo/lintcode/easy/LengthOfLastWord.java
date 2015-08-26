package org.yenbo.lintcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class LengthOfLastWord {

	@Test
	public void test() {
		Assert.assertEquals(5, lengthOfLastWord("Hello World"));
	}
	
	public int lengthOfLastWord(String s) {
        
		int length = 0;
		
		if (s.trim().length() > 0) {
			String[] tokens = s.trim().split(" ");
			length = tokens[tokens.length - 1].length();
		}
		
		return length;
    }
}
