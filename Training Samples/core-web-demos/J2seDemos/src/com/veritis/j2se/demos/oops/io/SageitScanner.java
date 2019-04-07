package com.veritis.j2se.demos.oops.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SageitScanner {
	private BufferedReader br;

	public SageitScanner(InputStream in) {
		br = new BufferedReader(new InputStreamReader(in));
	}

	public int nextInt() throws NumberFormatException {
		String line = getLine();
		return Integer.parseInt(line);
	}

	public float nextFloat() throws NumberFormatException {
		String line = getLine();
		return Float.parseFloat(line);
	}

	public boolean nextBoolean() throws NumberFormatException {
		String line = getLine();
		return Boolean.parseBoolean(line);
	}

	private String getLine() {
		String line = null;
		try {
			line = br.readLine();
			line = line.trim();
		} catch (IOException e) {
		}
		return line;
	}

}
