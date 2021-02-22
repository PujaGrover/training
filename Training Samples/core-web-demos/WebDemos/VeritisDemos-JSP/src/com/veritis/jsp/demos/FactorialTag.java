package com.veritis.jsp.demos;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

public class FactorialTag extends TagSupport {
	String value="5";
	
	@Override
	public int doStartTag() throws JspException {
		
		return Tag.SKIP_BODY;
	}
	
	private int factorial(int n){
		int fact=1;
		for(int i=1;i<=n;i++)
			fact=fact*i;
		return fact;
	}
	@Override
	public int doEndTag() throws JspException {
		int n=Integer.parseInt(getValue().trim());
		int result=factorial(n);
		JspWriter out=pageContext.getOut();
		try{
		out.println("<font color=\"green\"> <h1> The Factorial of "+getValue()+" is "+result+"</h1></font>");
		}catch(Exception e){
			System.out.println(e);
		}
		return Tag.EVAL_PAGE;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	
}
