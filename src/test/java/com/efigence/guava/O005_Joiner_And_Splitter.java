package com.efigence.guava;

import static org.fest.assertions.Assertions.*;

import org.junit.Test;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;

public class O005_Joiner_And_Splitter {

	@Test
	public void shouldConcatStringsUsingDelimiter() {
		// when
		String joined = Joiner.on(",").skipNulls().join("a", "b", null, "c");
		// then
		assertThat(joined).isEqualTo("a,b,c");
	}

	@Test
	public void shouldSplitDirtyString() {
		// when
		Iterable<String> splitted = Splitter.on(',').split(" a,,,  b ,c");
		// then
		// assertThat(FluentIterable.from(splitted)).hasSize(3);
	}
}
