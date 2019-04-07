package com.veritis.singleton.client;

import com.venkata.saranu.singleton.Person;

public class Client {

	public static void main(String[] args) {
		Person p=Person.getPerson();
		System.out.println(p);
		
		 p=Person.getPerson();
			System.out.println(p);
			
			
			 p=Person.getPerson();
				System.out.println(p);
				
				
				 p=Person.getPerson();
					System.out.println(p);
					
					 p=Person.getPerson();
						System.out.println(p);
	}

}
