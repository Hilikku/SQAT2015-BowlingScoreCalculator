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
	
	@Test
	public void testPlayerThrowsFirstTenAndTriesToThrowSecondTime() {
		Frame frame = new Frame(10,6);
		assertEquals(10, frame.getFirstThrow());
		assertEquals(0, frame.getSecondThrow());
	}
	
	@Test
	public void testThrowsAreIncorrectScores() {
		Frame frame = new Frame(-1,12);
		assertEquals(0, frame.getFirstThrow());
		assertEquals(0, frame.getSecondThrow());
	}
	
	
	@Test
	public void testFrameScoreIsSumofThrows(){
		Frame frame = new Frame(3, 5);
		assertEquals(8, frame.score());
	}

	@Test
	public void testFrameScoreIsOverTen(){
		Frame frame = new Frame(6, 5);
		assertEquals(0, frame.score());
	}
	
	@Test
	public void testFrameScoreIsLessThanZero(){
		Frame frame = new Frame(-1, 0);
		assertEquals(0, frame.score());
	}
	
	@Test
	public void testGameConsistsOfTenFrames(){
		BowlingGame bG = new BowlingGame();
		Frame frame = new Frame(1,5);
		BowlingGame.frames.addFrame(frame);
		assertEquals(10, bG.getFrames());
	}
	
}
