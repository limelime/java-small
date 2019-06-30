package net.openwritings.java.io;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class PrintChinese {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String chineseString = "\u4e00\u4e01\u4e02\u4e03\u4304";
		System.out.println(chineseString);
		PrintStream ps = new PrintStream(System.out, true, "UTF-8");
		ps.println(chineseString);
	}
}
