package org.unioulu.tol.sqat.bsc;

import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	public static List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	public BowlingGame(){
		
		this.frames = new ArrayList<Frame>();
		//for(int i=0; i< frames.size(); i++){
		
		//}
	
	}
	
	public List<Frame> getFrames() {
		return frames;
	}

	public void setFrames(List<Frame> frames) {
		this.frames = frames;
	}

	public void addFrame(Frame frame){
		
		this.frames.add(frame);
		
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
