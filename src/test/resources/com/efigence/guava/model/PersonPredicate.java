package com.efigence.guava.model;

import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;

public class PersonPredicate implements Predicate<Person> {

	private Long id;

	public PersonPredicate(Long id) {
		this.id = Preconditions.checkNotNull(id);
	}

	@Override
	public boolean apply(Person person) {
		return person.getId().equals(id);
	}

}
