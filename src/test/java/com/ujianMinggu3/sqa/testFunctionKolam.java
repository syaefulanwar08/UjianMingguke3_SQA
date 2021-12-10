package com.ujianMinggu3.sqa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.ujianMinggu3.sqa.function.FunctionKolam;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)

public class testFunctionKolam {
	
	FunctionKolam function;

	@Before
	public void setUp() throws Exception {
		function = new FunctionKolam();
	}

	@After
	public void tearDown() throws Exception {
	}
	
    @Test
    @FileParameters("src/test/resources/SkenarioKelilingKolam.csv")
    public void testHitungKelilingKolam(double panjang, double lebar, double tinggi, double hasil) { 
    	assertEquals(hasil, function.hitungKelilingKolam(panjang, lebar, tinggi), 0.0);
    }
	
	@Test
	@FileParameters("src/test/resources/SkenarioVolumeKolam.csv")
	public void testHitungVolumeKolam(double panjang, double lebar, double tinggi, double hasil) {
		assertEquals(hasil, function.hitungVolumeKolam(panjang, lebar, tinggi), 0.0);
	}

	


}
