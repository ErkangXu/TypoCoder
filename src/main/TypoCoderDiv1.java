package main;

import java.util.ArrayList;
import java.util.Arrays;

public class TypoCoderDiv1 {
	static ArrayList<ArrayList<Integer>> list;
	static int length;
	static int currentHighestTimesOfColorChanges=0;
	static int location=1;
	static int[] array;
	static boolean flag=true;
	public int getmax(int[] D,int X) {
		array=D;
		length = D.length;
		list=new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<length; i++){
			ArrayList<Integer> tempList = new ArrayList<Integer>();
			list.add(tempList);
		}
		ArrayList<Integer> tempList = new ArrayList<Integer>(); 
		tempList.add(0);
		tempList.add(X);
		tempList.add(0);
		list.add(tempList);
		while (location>0) {
			int result = tryer();
			if (result>currentHighestTimesOfColorChanges){
				currentHighestTimesOfColorChanges=result;
			}
		}
		return currentHighestTimesOfColorChanges;
	}
	private int tryer() {
		while (true) {
			if (flag){
				int previousScore = list.get(location-1).get(1);
				int previousColor = previousScore<2200 ? 0:1;
				int newScore = previousScore+array[location-1];
				int newColor = newScore<2200 ? 0:1;
				if (newColor==1 && previousColor==1){
					flag=false;
					return 0;
				}
				int previousChanges=list.get(location-1).get(2);
				int newChanges=previousChanges;
				if (newColor!=previousColor) newChanges++;
				list.add((ArrayList<Integer>)Arrays.asList(0,newScore,newChanges));
				if (location==length) {
					flag=false;
					return newChanges;				
				}
				location++;
			} else {
				
			}
		}
		
		
		
		int choice = list.get(location).get(0);
		int lostScore = list.get(location).get(1);
		int temp;
		if ( choice ==0 ) temp = lostScore+array[location];
		if ( choice ==1 ) {
			temp = lostScore-array[location];
			if (temp < 0) temp=0;
		}
		location++;
		list.get(location).add()
		while(location<=50 && list.get(location).get(1)>=2200)
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
