package com.efigence.guava;

import static org.fest.assertions.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

public class O009_Multiset {

	@Test
	public void shouldShowMiltisetExample() {
		// given
		List<String> letters = Arrays.asList("a", "a", "a", "c", "c", "b");
		// when
		Multiset<String> lettersMultiset = HashMultiset.create();
		lettersMultiset.addAll(letters);
		// then
		assertThat(lettersMultiset.size()).isEqualTo(6);
		assertThat(lettersMultiset.count("a")).isEqualTo(3);
		System.out.println(lettersMultiset);
	}
}
