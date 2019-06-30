package net.openwritings.java.io;

import java.io.IOException;

public class CmdExecution {

	public static void main(String[] args) {
		// Get the appropriate command depending on the operating system.
		String os_name = System.getProperty("os.name");
		String cmdLine[];
		if (os_name.indexOf("Windows") != -1)
			cmdLine = new String[] { "cmd", "/c", "dir > .\\test_out.txt" }; // dir > test_out.txt
		else
			cmdLine = new String[] { "/bin/sh", "-c", "ls > ./test_out.txt" }; // ls > test_out.txt

		try {

			// Print what will be run.
			System.out.println("Running on "+os_name+": ");
			System.out.print("\t");
			for (String str : cmdLine)
				System.out.print(str + " ");
			System.out.println();

			// Execute the command.
			Process process = Runtime.getRuntime().exec(cmdLine);

			try {
				process.waitFor();
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			} // Wait for the process to terminate.
			if (process.exitValue() == 0)
				System.out.println("\texitValue: true");
			else
				System.out.println("\texitValue: false");

		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}

}
