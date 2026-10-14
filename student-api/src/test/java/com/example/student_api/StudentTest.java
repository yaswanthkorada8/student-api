package com.example.student_api;

import org.junit.jupiter.api.*;

public class StudentTest {
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("runs once before all tests");
	}
	
	@BeforeEach
	void setUp() {
		System.out.println("runs before each test");
	}
	
	@Test
	void testOne() {
		System.out.println("Test one");
	}
	
	@Test
	void testTwo() {
		System.out.println("Test two");
	}
	
	@AfterEach
	void tearDown() {
		System.out.println("runs after each test");
	}
	
	@AfterAll
	static void afterAll () {
		System.out.println("runs once after all test");
	}

}