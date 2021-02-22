package com.veritis.jsp;

import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;



public class HelloTag extends TagSupport
{
  private String name=" JSP";
  public void setName(String name)
  {
    this.name=name;
  }
  public String getName()
  {
    return this.name;
  }
    @Override
  public int doStartTag()
  {
    return Tag.SKIP_BODY;
  }

    @Override
  public int doEndTag()throws JspTagException
  {
	try
	{
		JspWriter out=pageContext.getOut();
		String str="<h1>Hello"+getName()+"<h1>";
		out.println(str);
	}
	
	catch(Exception e)
	{
	
		throw new JspTagException("Error In HelloTag:"+e.getMessage());
	}
	
	return Tag.EVAL_PAGE;
   }
}