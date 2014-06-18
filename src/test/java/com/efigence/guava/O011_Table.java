package com.efigence.guava;

import org.junit.Test;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class O011_Table {

	@Test
	public void tableDemo() {
		Table<Country, Factor, Integer> graph = HashBasedTable.create();
		graph.put(Country.POLLAND, Factor.POPULATION, 512);
		graph.put(Country.POLLAND, Factor.AREA, 130);
		graph.put(Country.HOLLAND, Factor.POPULATION, 38);
		graph.put(Country.HOLLAND, Factor.AREA, 20);
		System.out.println(graph);
	}

	public enum Country {
		POLLAND,
		HOLLAND
	}

	public enum Factor {
		AREA,
		POPULATION
	}

}
