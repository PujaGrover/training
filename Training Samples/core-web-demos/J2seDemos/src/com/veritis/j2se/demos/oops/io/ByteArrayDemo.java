package com.veritis.j2se.demos.oops.io;

import java.io.*;

public class ByteArrayDemo {
	public static void main(String args[]) throws Exception {
		String str = "Venkata* Saranu *Krishna *Mohan *AA *Veritis";
		byte b[] = str.getBytes();

		ByteArrayInputStream in = new ByteArrayInputStream(b);
		BufferedInputStream f = new BufferedInputStream(in);
		System.out.println("no of bytes that we have " + str.length());
		int sourceSize = f.available();
		for (int i = 0; i < sourceSize; i++) {
			char s = (char) f.read();
			if (s == '*') {
				f.mark(i);
				System.out.println("--" + i);
			}
			System.out.print(s);

			// System.out.println(f.read());

		}
		System.out.println();
		System.out.println("after reset");
		
		f.reset();

		int k;
		while ((k = f.read()) != -1) {
			System.out.print((char) k + "");
		}
		System.out.println("\n");

	}
}
