package org.unioulu.tol.sqat.bsc;

import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	public BowlingGame(){
		
	//if(frames.size() < 10){
	//	this.frames = new ArrayList<Frame>();
	//}
	}
	
	public void addFrame(Frame frame){
		this.stocks.add(frame);
	}
	
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
	}
	
	public int score(){
		//to be implemented
		return 0;
	}
	
	public boolean isNextFrameBonus(){
		//to be implemented
		return false;
	}
}
