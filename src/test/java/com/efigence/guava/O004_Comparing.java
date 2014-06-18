package com.efigence.guava;

import static com.efigence.guava.model.PersonBuilder.*;
import static org.fest.assertions.Assertions.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import com.efigence.guava.model.Person;
import com.efigence.guava.model.PersonComparator;

public class O004_Comparing {

	@Test
	public void shouldSortCollectionWithComparator() {
		// given
		List<Person> people = Arrays.asList(person().withActive(true).withAge(18).build(), person()
			.withActive(false).withAge(19).build(), person().withAge(20).build());
		// when
		Collections.sort(people, new PersonComparator());
		// then
		Person person = people.get(0);
		assertThat(person.getActive()).isNull();
		assertThat(person.getAge()).isEqualTo(20);
		person = people.get(1);
		assertThat(person.getActive()).isTrue();
		assertThat(person.getAge()).isEqualTo(18);
		person = people.get(2);
		assertThat(person.getActive()).isFalse();
		assertThat(person.getAge()).isEqualTo(19);
	}

}
