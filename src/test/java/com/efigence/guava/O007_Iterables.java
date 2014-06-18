package com.efigence.guava;

import static com.efigence.guava.model.PersonBuilder.*;
import static org.fest.assertions.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.efigence.guava.model.Person;
import com.efigence.guava.model.PersonPredicate;
import com.efigence.guava.model.PersonWithNamePredicate;
import com.google.common.collect.Iterables;

public class O007_Iterables {

	private List<Person> people;

	@Before
	public void setup() {
		people = Arrays.asList(person().withId(1l).build(), person().withId(2l)
				.withName("bug").build(),
				person().withId(3l).withName("feature").build(), person()
						.withId(5l).build());
	}

	@Test
	public void iterables_shouldFindPersonByProperty() {
		// given
		Long expectedPersonId = 2l;
		// when
		Person person = Iterables.find(people, new PersonPredicate(
				expectedPersonId));
		// then
		assertThat(person).isNotNull();
		assertThat(person.getId()).isEqualTo(expectedPersonId);
	}

	@Test
	public void iterables_shouldTryFindPersonByProperty() {
		// given
		Long notExistingPersonId = 10l;
		// when
		Person person = Iterables.tryFind(people,
				new PersonPredicate(notExistingPersonId)).orNull();
		// then
		assertThat(person).isNull();
	}

	@Test
	public void iterables_shouldFilterPeopleWithName() {
		// when
		Iterable<Person> filtered = Iterables.filter(people,
				new PersonWithNamePredicate());
		// then
		assertThat(filtered).hasSize(2);
	}

	@Test
	public void iterables_shouldReturnTrueIfPredicateIsSatisfied() {
		// when
		boolean satisfied = Iterables
				.any(people, new PersonWithNamePredicate());
		// then
		assertThat(satisfied).isTrue();
	}

}
