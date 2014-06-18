package com.efigence.guava.model;

import com.google.common.base.Objects;

public class Person {

	private Long id;
	private String name;
	private String surname;
	private String phone;
	private Boolean active;
	private Integer age;

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public String getPhone() {
		return phone;
	}

	public Boolean getActive() {
		return active;
	}

	public Integer getAge() {
		return age;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(id, name, surname, phone, active, age);
	}

	@Override
	public boolean equals(Object object) {
		if (object instanceof Person) {
			Person that = (Person) object;
			return Objects.equal(this.id, that.id)
					&& Objects.equal(this.name, that.name)
					&& Objects.equal(this.surname, that.surname)
					&& Objects.equal(this.phone, that.phone)
					&& Objects.equal(this.active, that.active)
					&& Objects.equal(this.age, that.age);
		}
		return false;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this).add("id", id).add("name", name)
				.add("surname", surname).add("phone", phone)
				.add("active", active).add("age", age).omitNullValues()
				.toString();
	}

}
