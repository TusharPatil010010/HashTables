package com.capg.datastructures_hashmap;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MyLinkedHashMapTest {

	@Test
	public void givenAParagraph_WhenAddedtoList_shouldGiveFrequencyOfParanoid() {
		
		String sentence = "Paranoids are not paranoid because they are paranoid "
				+ "but because they keep putting themselves " + "deliberately into paranoid avoidable situations";
		MyLinkedHashMap<String, Integer> myLinkedHashMap = new MyLinkedHashMap<>();
		String words[] = sentence.toLowerCase().split(" ");

		for (String word : words) {
			Integer value = myLinkedHashMap.get(word);
			if (value == null) {
				value = 1;
			} else {
				value++;
			}
			myLinkedHashMap.add(word, value);
		}

		int frequencyParanoid = myLinkedHashMap.get("paranoid");
		System.out.println("Frequency " + frequencyParanoid);
		Assert.assertEquals(3, "Frequency " + frequencyParanoid);
	}
}
