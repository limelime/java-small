package net.openwritings.xngo.tutorial.lang;

public class SwitchFeature {

	public static void main(String[] args) {
	
		System.out.println("I'm currently at version 2, run up the latest changes:");
		runIncrementalChanges(3);
		
		
		System.out.println("\n==============================\n");
		
		System.out.println("Since I'm already at step '2: Put the pan on the stove', the remaining steps are:");
		stepsRemainingToCookAnEgg(3);
	}
	private static void stepsRemainingToCookAnEgg(int step)
	{
		switch(step) {
			case 1: System.out.println("1: Turn on the stove.");
			case 2: System.out.println("2: Put the pan on the stove.");
			case 3: System.out.println("3: Put in the oil.");
			case 4: System.out.println("4: Throw in an egg.");
			case 5: System.out.println("5: Wait for 3 mintues and serve.");
				break;
			default:
				System.out.println("not found");
				break;
		}
	}
	private static void runIncrementalChanges(int version)
	{
		switch(version) {
			case 1: System.out.println("Run changes for version 1");
			case 2: System.out.println("Run changes for version 2");
			case 3: System.out.println("Run changes for version 3");
			case 4: System.out.println("Run changes for version 4");
				break;
			default:
				System.out.println("not found");
				break;
		}
	}
}
