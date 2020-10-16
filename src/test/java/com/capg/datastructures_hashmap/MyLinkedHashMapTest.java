package com.capg.datastructures_hashmap;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MyLinkedHashMapTest {

	/**
	 * UC2 testing
	 */
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
		Assert.assertEquals(3, frequencyParanoid);
	}
	
	/**
	 * UC3 testing
	 */
	@Test
	void whenEnteredAKey_shouldRemove_keyValuePair() {
		String sentence = "Paranoids are not paranoid because they are paranoid "
				+ "but because they keep putting themselves deliberately into paranoid avoidable situations";
		MyLinkedHashMap<String, Integer> linkedHashMap = new MyLinkedHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = linkedHashMap.get(word);
			if (value == null) {
				value = 1;
			} else {
				value += 1;
			}
			linkedHashMap.add(word, value);
		}
		assertTrue(linkedHashMap.remove("avoidable"));
		System.out.println("Removed Avoidable");
	}
}
