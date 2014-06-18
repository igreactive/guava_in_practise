package com.efigence.guava;

import static org.fest.assertions.Assertions.*;

import org.junit.Test;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

public class O012_Bimap {

	@Test
	public void bimapDemo() {
		// given
		BiMap<Integer, String> numberMatching = HashBiMap.create(2);
		numberMatching.put(1, "one");
		numberMatching.put(2, "two");

		// then
		assertThat(numberMatching.get(1)).isEqualTo("one");
		assertThat(numberMatching.inverse().get("one")).isEqualTo(1);
	}
}
