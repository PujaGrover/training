package com.veritis.j2se.demos.oops.io;

import java.io.File;

public class FileDemo {

	static void s(String str) {
		System.out.println(str);
	}

	public static void main(String args[]) {
		String fileName;
		File f = new File("/Users/Mokshagna/Desktop/filedemo");

		fileName = new String(f.getName());
		s("\n file name                :-> " + fileName);
		s("(" + fileName + ")" + " path             :-> " + f.getPath());
		s("(" + fileName + ")" + " parent           :-> " + f.getParent());
		s("(" + fileName + ")" + " exists           :-> " + f.exists());
		s("(" + fileName + ")" + " isdirectory      :-> " + f.isDirectory());
		s("(" + fileName + ")" + " isfile           :-> " + f.isFile());
		s("(" + fileName + ")" + " canwrite         :-> " + f.canWrite());
		s("(" + fileName + ")" + " canread          :-> " + f.canRead());
		s("(" + fileName + ")" + " ishidden         :-> " + f.isHidden());
		s("(" + fileName + ")" + " isabsolute       :-> " + f.isAbsolute());
		s("(" + fileName + ")" + " file size        :-> " + f.length() + "  bytes");
		s("(" + fileName + ")" + " set read only    :-> " + f.setReadOnly());
		s("(" + fileName + ")" + " canread          :-> " + f.canRead());
		s("(" + fileName + ")" + " canwrite         :-> " + f.canWrite());

		if (f.isDirectory()) {
			System.out.println("List of Files ");

			String str[] = f.list();
			for (int i = 0; i < str.length; i++) {
				System.out.println(str[i] + "\n");

			}

			System.out.println(" List of Files and its sizes ");
			File fl[] = f.listFiles();

			for (int i = 0; i < fl.length; i++) {
				if (fl[i].isDirectory()) {
					System.out.println(fl[i].getName() + "has file as below -------------");
					String fname[] = fl[i].list();
					for (String str1 : fname) {
						System.out.println(str1);
					}

				} else {
					String name = fl[i].getName();
					System.out.println(name + " and  size " + fl[i].length()+" and path is "+fl[i].getPath());
				}

			}
		}
	}
}
