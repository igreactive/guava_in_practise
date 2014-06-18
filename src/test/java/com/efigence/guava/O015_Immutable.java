package com.efigence.guava;

import static com.efigence.guava.model.PersonBuilder.*;
import static org.fest.assertions.Assertions.*;

import org.fest.assertions.Fail;
import org.junit.Test;

import com.efigence.guava.model.Person;
import com.google.common.collect.ImmutableSet;

public class O015_Immutable {

	@Test
	public void immutableDemo() {
		// given
		ImmutableSet<Integer> immutableSet = ImmutableSet.of(1, 2, 3);
		try {
			// when
			immutableSet.remove(2);
			Fail.fail();
		} catch (UnsupportedOperationException e) {
			// nothing
		}
	}

	@Test
	public void immutableFromBuilder() {
		// when
		ImmutableSet<Person> immutable = ImmutableSet.<Person> builder()
			.add(person().withId(1l).build(), person().withId(2l).build()).build();
		// then
		assertThat(immutable).hasSize(2);
	}
}
