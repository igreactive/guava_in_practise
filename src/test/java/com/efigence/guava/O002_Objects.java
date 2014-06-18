package com.efigence.guava;

import static com.efigence.guava.model.PersonBuilder.*;
import static org.fest.assertions.Assertions.*;
import static org.fest.assertions.Fail.*;

import org.junit.Test;

import com.efigence.guava.model.Person;
import com.google.common.base.Objects;

/*
 * 
 * java.util.Objects -> jdk7
 */
public class O002_Objects {

	@Test
	public void shouldThrowNPEWhenNameAndSurenameAreNull() {
		// given
		Person person = person().build();
		try {
			// when
			Objects.firstNonNull(person.getName(), person.getSurname());
			fail();
		} catch (NullPointerException e) {
			// then
			// it's ok
		}
	}

	@Test
	public void shouldReturnTrueWhenTwoPeopleHasTheSameAge() {
		// given
		Person firstPerson = person().withAge(18).build();
		Person secondsPerson = person().withAge(18).build();
		// when
		boolean theSameAge = Objects.equal(firstPerson.getAge(), secondsPerson.getAge());
		// then
		assertThat(theSameAge).isTrue();
	}

}
