package com.ujianMinggu3.sqa;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.ujianMinggu3.sqa.function.FunctionSuhu;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)

public class testKonversiSuhu {
	
	FunctionSuhu function;

	@Before
	public void setUp() throws Exception {
		function = new FunctionSuhu();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
    @FileParameters("src/test/resources/SkenarioKonversiSuhu.csv")
    public void testHitungKonvers(double suhuAwal, double hasil) { 
    	assertEquals(hasil, function.hitungKonversi(suhuAwal), 0.001);
    }

}
