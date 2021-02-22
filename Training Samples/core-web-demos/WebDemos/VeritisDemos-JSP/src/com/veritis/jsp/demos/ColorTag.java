package com.veritis.jsp.demos;

import java.io.IOException;

import javax.servlet.jsp.tagext.BodyTag;
import javax.servlet.jsp.tagext.BodyTagSupport;


public class ColorTag extends BodyTagSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2910096393833312493L;
	String myColor = "red";

	public void setValue(String col) {
		myColor = col;
	}

	public String getValue() {
		return myColor;
	}

	public int doStartTag() throws javax.servlet.jsp.JspException {
		return BodyTag.EVAL_BODY_BUFFERED;
	}

	public int doAfterBody() throws javax.servlet.jsp.JspException {
		String body = getBodyContent().getString();
		try {
			String str = "<font color='" + myColor + "'>" + body + "</font>";
			getPreviousOut().print(str);
		} catch (IOException e) {
		}
		return SKIP_BODY;
	}
}
