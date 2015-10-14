package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat.bsc.BowlingGame;
import org.unioulu.tol.sqat.bsc.Frame;

public class TestBowlingScoreCalculator {

	@Test
	public void testPlayerThrowsFirstTwoSecondFour() {
		Frame frame = new Frame(2,4);
		assertEquals(2, frame.getFirstThrow());
		assertEquals(4,frame.getSecondThrow());
		
	}

	
	
}
