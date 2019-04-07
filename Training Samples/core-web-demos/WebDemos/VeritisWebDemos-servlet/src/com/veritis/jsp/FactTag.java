/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.veritis.jsp;

import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author vsaranu
 */
public class FactTag extends TagSupport{

    String value="5";

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    public int doStartTag(){
        return Tag.SKIP_BODY;
    }
    public int doEndTag() throws JspTagException{

        int n=Integer.parseInt(getValue().trim());
       int facto=findFactorial(n);
       
       try{
           //The following line is to get the JSP Writer Object
           //similar to PrintWriter in Servlet
           JspWriter out=pageContext.getOut();
       out.println("Factorial of "+getValue()+" is "+facto);
       }catch(Exception e){}
       return Tag.EVAL_PAGE;
    }
    private int findFactorial(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }

}
