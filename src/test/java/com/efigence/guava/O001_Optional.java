package com.efigence.guava;

import static com.efigence.guava.model.PersonBuilder.*;
import static org.fest.assertions.Assertions.*;

import org.junit.Test;

import com.google.common.base.Optional;

public class O001_Optional {

	@Test
	public void optional_shouldReturnInstanceWithoutReference() {
		// when
		Optional<Integer> age = Optional.fromNullable(person().build().getAge());
		// then
		assertThat(age).isSameAs(Optional.absent());
	}

	@Test
	public void optional_shouldReturnDefaultValueForNull() {
		// when
		Integer defaultAge = Optional.fromNullable(person().build().getAge()).or(16);
		// then
		assertThat(defaultAge).isEqualTo(16);
	}
}
