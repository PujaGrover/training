<?xml version="1.0"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:template match="/" >
<html>
<head>
<title>Veritis Groups Inc</title>
</head>
<body bgcolor="yellow">
<font color="red" size="5">
<h1> Veritis Employees Are </h1>
        <table border="1">
        	<tr style="background-color: white;">

        		<th><b>Employee Name</b></th>
        		<th><b>Employee Number</b></th>
        	</tr>
	<xsl:for-each select="empdetails/emp">
        <tr>
           <td> <xsl:value-of select="ename"/></td>
	   <td> <xsl:value-of select="empno"/></td>
         </tr>
	</xsl:for-each>
	<tr style="background-color: red;">
		<th><b>Department No</b></th>
		<th><b>Department Name</b></th>
	</tr>
	<xsl:for-each select="empdetails/dept">
            <tr>
          
             <td><xsl:value-of select="deptno"/></td>
            <td><xsl:value-of select="dname"/></td>
            </tr>
	</xsl:for-each>
        </table>
</font>
</body>
</html>
</xsl:template>
</xsl:stylesheet>