package com.capg.datastructures_hashmap;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MyHashMapTest {

	/**
	 * UC1 testing for word "to"
	 */
	@Test
	public void whenSentenceAddedToList_ShouldGiveFrequencyOfWords() {
		String sentence = "“Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations”";
		MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
		String words[] = sentence.toLowerCase().split(" ");

		for (String word : words) {
			Integer value = myHashMap.get(word);
			if (value == null) {
				value = 1;
			} 
			else {
				value++;
			}
			myHashMap.add(word, value);
		}
		int frequencyTo = myHashMap.get("paranoid");
		System.out.println(myHashMap);
		System.out.println("Freq: " + frequencyTo);
		Assert.assertEquals(3, frequencyTo);
	}
}
