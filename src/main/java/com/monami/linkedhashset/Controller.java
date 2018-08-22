package com.monami.linkedhashset;

import java.util.LinkedHashSet;
import java.util.Set;

public class Controller {
	private Set set = null;

	public Controller() {
		set = new LinkedHashSet();
	}

	public void addItems() {
		Employee emp1 = new Employee(1, "seema");
		Employee emp2 = new Employee(2, "pallavi");
		Employee emp3 = new Employee(3, "stiti");
		Employee emp4 = new Employee(4, "minu");
		set.add(emp1);
		set.add(emp2);
		set.add(emp3);
		set.add(emp4);
	}

	public void getItems() {
		Employee emp = new Employee(2, "pallavi");
		System.out.println(emp + " is present = " + set.contains(emp));

	}

	public static void main(String[] args) {
		Controller main = new Controller();
		 main.addItems();
		main.getItems();
	}
}
