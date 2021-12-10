package com.ujianMinggu3.sqa;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ujianMinggu3.sqa.function.FunctionSuhu;

public class testSkenarioFunctionSuhu {
	
	FunctionSuhu function;

	@Before
	public void setUp() throws Exception {
		function = new FunctionSuhu();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testHitungKonversi() {
		assertEquals(-5, function.hitungKonversi(23), 0.001);
	}
	
	@Test
	public void testHitungKonversi1() {
		assertEquals(-5, function.hitungKonversi(jamal), 0.001);
	}
	
	@Test
	public void testHitungKonversi2() {
		assertEquals(-5, function.hitungKonversi(-23), 0.001);
	}

	@Test
	public void testHitungKonversi3() {
		assertEquals(-5, function.hitungKonversi(), 0.001);
	}
}
