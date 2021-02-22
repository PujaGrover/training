package com.veritis.j2se.demos.newfeatures;

public class GenericClass<A, B> {
	A firstObject;
	B secondObject;
	public A getFirstObject() {
		return firstObject;
	}
	public void setFirstObject(A firstObject) {
		this.firstObject = firstObject;
	}
	public B getSecondObject() {
		return secondObject;
	}
	public void setSecondObject(B secondObject) {
		this.secondObject = secondObject;
	}

	
}
