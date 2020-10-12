package com.bl.datastructure;

import org.junit.Assert;
import org.junit.Test;

public class HashMapTest {

	// UC1 HashMap find frequency
	@Test
	public void givenSentence_whenWordsAdded_shouldReturnWordFrequency() {
		String sentence = "To be or not to be";
		MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = myHashMap.get(word);
			if (value == null)
				value = 1;
			else
				value = value + 1;
			myHashMap.add(word, value);
		}
		int frequency = myHashMap.get("be");
		System.out.println(myHashMap);
		Assert.assertEquals(2, frequency);
	}

	// UC2
	@Test
	public void givenPara_whenWordsAdded_shouldReturnWordFrequency() {
		String sentence = "Paranoids are not paranoid because they are paranoid but "
				+ "because they keep putting themselves deliberately into paranoid avoidable situations";
		MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = myHashMap.get(word);
			if (value == null)
				value = 1;
			else
				value = value + 1;
			myHashMap.add(word, value);
		}
		int frequency = myHashMap.get("paranoid");
		System.out.println(myHashMap);
		Assert.assertEquals(3, frequency);
	}
}
