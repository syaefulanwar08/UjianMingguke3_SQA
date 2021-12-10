package com.ujianMinggu3.sqa;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ujianMinggu3.sqa.function.FunctionKolam;


public class testSkenarioFunctionKolam {

	FunctionKolam function;
	
	@Before
	public void setUp() throws Exception {
		function = new FunctionKolam();
	}

	@After
	public void tearDown() throws Exception {
	}

	/// KELILING
	
	@Test
	public void testHitungKelilingKolam() {
		assertEquals(82.0, function.hitungKelilingKolam(5.5, 12, 3), 0.0);
	}
	
	@Test
	public void testHitungKelilingKolam1() {
		assertEquals(82.0, function.hitungKelilingKolam(waw, wew, wow), 0.0);
	}
	
	@Test
	public void testHitungKelilingKolam2() {
		assertEquals(82.0, function.hitungKelilingKolam(-5.5, -12, -3), 0.00);
	}
	
	@Test
	public void testHitungKelilingKolam3() {
		assertEquals(82.0, function.hitungKelilingKolam(), 0.0);
	}
	
	
	/// VOLUME
	
	@Test
	public void testHitungVolumeKolam() {
		assertEquals(198.0, function.hitungVolumeKolam(5.5, 12, 3), 0.0);
	}

	@Test
	public void testHitungVolumeKolam1() {
		assertEquals(198.0, function.hitungVolumeKolam(jpg, png, bng), 0.0);
	}

	@Test
	public void testHitungVolumeKolam2() {
		assertEquals(198.0, function.hitungVolumeKolam(-5.5, -12, -3), 0.0);
	}
	
	@Test
	public void testHitungVolumeKolam3() {
		assertEquals(198.0, function.hitungVolumeKolam(, , ), 0.0);
	}
}
