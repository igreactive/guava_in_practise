package com.efigence.guava;

import static org.fest.assertions.Assertions.*;

import org.junit.Test;

import com.efigence.guava.model.Person;
import com.google.common.base.Preconditions;
import com.google.common.collect.Range;

public class O003_Preconditions {

	private static final Integer AGE = 20;
	private static final Integer RETIREMENT_AGE = 65;

	@Test
	public void preconditionsDemo() {
		// given
		Worker worker = null;
		// when
		worker = new Worker(AGE);
		// then
		assertThat(worker).isNotNull();
		assertThat(worker.getAge()).isEqualTo(AGE);
		assertThat(worker.isRetired()).isFalse();
	}

	class Worker extends Person {
		private boolean retired;

		public Worker(Integer age) {
			setAge(Preconditions.checkNotNull(age));
			Preconditions.checkArgument(age > 18);
			retired = Range.atLeast(RETIREMENT_AGE).contains(age);
		}

		public boolean isRetired() {
			return retired;
		}

	}

}
