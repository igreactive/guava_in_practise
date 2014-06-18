package com.efigence.guava.model;

import com.google.common.base.Predicate;
import com.google.common.base.Strings;

public class PersonWithNamePredicate implements Predicate<Person> {

	@Override
	public boolean apply(Person person) {
		return !Strings.isNullOrEmpty(person.getName());
	}

}
