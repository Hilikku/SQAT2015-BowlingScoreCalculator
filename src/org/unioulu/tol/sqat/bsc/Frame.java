package org.unioulu.tol.sqat.bsc;

public class Frame {
	private static int firstThrow;
	private static int secondThrow;
	
	public Frame(int firstThrow, int secondThrow){
		this.setFirstThrow(firstThrow);
		this.setSecondThrow(secondThrow);
		if(firstThrow == 10){
			this.setSecondThrow(0);
		}
		if(firstThrow < 0 || firstThrow >10 || secondThrow < 0 || secondThrow > 10) {
			this.setFirstThrow(0);
			this.setSecondThrow(0);
		}
		
	}
	
	//the score of a single frame
	public int score(){
		int score = Frame.firstThrow + Frame.secondThrow;
		if(score > 10 || score < 0){
			return 0;
		}else return score;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(){
		//to be implemented
		return false;
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(){
		//to be implemented
		return false;
	}

	//return whether this is the last frame of the match
	public boolean isLastFrame(){
		//to be implemented
		return false;
	}

	//bonus throws
	public int bonus(){
		//to be implemented
		return 0;
	}

	public int getFirstThrow() {
		return firstThrow;
	}

	public void setFirstThrow(int firstThrow) {
		this.firstThrow = firstThrow;
	}

	public int getSecondThrow() {
		return secondThrow;
	}

	public void setSecondThrow(int secondThrow) {
		this.secondThrow = secondThrow;
	}
}
