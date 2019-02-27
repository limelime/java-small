package net.openwritings.java.math;

public class RandomNumber {

	public static void main(String[] args) {
		
		int a=4, b=8;
		int rndInt = getRandomInt(a, b);
		System.out.println(rndInt);
	}
	public static int getRandomInt(int a, int b){
		
		int range = b-a;
		double rndDouble = Math.random()*range;
		
		return Double.valueOf(rndDouble).intValue()+a;
	}
}
