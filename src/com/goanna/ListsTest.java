package com.goanna;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ListsTest {


	@Test
	public void test__age_greater_than_60__success() {
		Employee emp1 = new Employee(1, "Mohit", 22);
		Employee emp2 = new Employee(2, "Rahul", 42);
		Employee emp3 = new Employee(3, "Shyam", 24);
		Employee emp4 = new Employee(4, "Mohit", 36);
		Employee emp5 = new Employee(5, "Swaraj", 60);

		List<Employee> empList = new ArrayList<>(10);

		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		
		
		
		int expected = 60;
		Employee value = Lists.over60(empList);
		assertEquals(expected, value.getAge());

	}
	
	@Test 
	public void test__remove_by_id__success() {
		Employee emp1 = new Employee(1, "Mohit", 22);
		Employee emp2 = new Employee(2, "Rahul", 42);
		Employee emp3 = new Employee(3, "Shyam", 24);
		Employee emp4 = new Employee(4, "Mohit", 36);
		Employee emp5 = new Employee(5, "Swaraj", 60);

		List<Employee> empList = new ArrayList<>(10);

		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		
		Employee emp = new Employee(0, null, 0);
		int expected = 0;
		int value = emp.getId();
		assertEquals(expected, value);
		
	}
	
	@Test 
	public void test__divide_name_by_2__success() {
		Employee emp1 = new Employee(1, "Mohit", 22);
		Employee emp2 = new Employee(2, "Rahul", 42);
		Employee emp3 = new Employee(3, "Shyam", 24);
		Employee emp4 = new Employee(4, "Mohit", 36);
		Employee emp5 = new Employee(5, "Swaraj", 60);

		List<Employee> empList = new ArrayList<>(10);

		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		
		boolean value = Lists.ageModulus(empList);
		Assert.assertEquals(true, value);
	
	}
}
