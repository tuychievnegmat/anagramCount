package com.coderbyte.anagramCount;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
//The tests are written in the AnagramCountApplicationTests class
@SpringBootTest
class AnagramCountApplicationTests {

	@Test
	void contextFirst() {
		String text = "aa aa odg dog gdo";
		Assert.assertEquals(2, AnagramCount.countingAnagrams(text));
	}@Test
	void contextSecond() {
		String text = "a c b c run urn urn";
		Assert.assertEquals(1, AnagramCount.countingAnagrams(text));
	}

}
