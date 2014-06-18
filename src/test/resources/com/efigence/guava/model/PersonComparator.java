package com.efigence.guava.model;

import java.util.Comparator;

import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Ordering;

public class PersonComparator implements Comparator<Person> {

	@Override
	public int compare(Person thiz, Person that) {
		return ComparisonChain
				.start()
				.compare(thiz.getActive(), that.getActive(),
						Ordering.natural().reverse().nullsFirst())
				.compare(thiz.getAge(), that.getAge()).result();
	}

}
