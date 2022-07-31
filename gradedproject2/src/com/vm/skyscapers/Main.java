package com.vm.skyscapers;
 

	
	public class Main {

	    public static int totalFloors;
	    public static int[] totalFloorSize;

	    
	    public static void main(String[] args) {
	    	
	    	Skyscapers mySsObj = new Skyscapers();
	        mySsObj.getInputs();
	        mySsObj.cAndPOrderOfConstruction(mySsObj.totalFloorSize);
	    }
	}

