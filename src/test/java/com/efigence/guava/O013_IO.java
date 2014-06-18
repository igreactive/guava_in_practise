package com.efigence.guava;

import static org.fest.assertions.Assertions.*;

import java.io.IOException;
import java.net.URL;

import org.junit.Test;

import com.google.common.base.Charsets;
import com.google.common.io.Resources;

public class O013_IO {

	private static final String CONTENT = "Guava is cool";

	@Test
	public void shouldDealWithResoursec() throws IOException {
		// given
		URL url = Resources.getResource("text.txt");
		// then
		assertThat(Resources.toString(url, Charsets.UTF_8)).isEqualTo(CONTENT);
	}
}
