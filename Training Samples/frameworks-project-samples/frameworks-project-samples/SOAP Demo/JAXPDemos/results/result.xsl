<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:fn="http://www.w3.org/2005/xpath-functions">
	<xsl:template match="/">
		<html>
			<head>
				<title>Results Tree</title>
				<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
				<script src="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
				<link href="http://netdna.bootstrapcdn.com/bootstrap/3.0.2/css/bootstrap.min.css" rel="stylesheet" />
				<script>
					$(document).ready(function(){
					$('.collapse').collapse();
					});
					
										
				</script>
			</head>
			<body bgcolor="white">
			<center>
			<font color="#216d94">
			<h3>
			Results For the Tests  : 
			<script>
				document.write(document.lastModified);
			</script>
			</h3>
			</font>
			</center>
			<center>
			<div class="panel-group" id="accordion">
			<xsl:for-each select="testResults/sample">
				<xsl:variable name="test" select="position()"/>
				  <div class="panel panel-default">
				    <div class="panel-heading">
				      <h4 class="panel-title">
				     
				        <a data-toggle="collapse" data-parent="#accordion" href="#{$test}" >
				     
				          <xsl:choose>
								<xsl:when test="@rc = 200 ">
								<tr bgcolor="green" >
								<td colspan="2">
								<font color="green">
								<b><xsl:value-of select="@lb"/>
								-Success
								</b>
								</font>
								</td>
								</tr>
								</xsl:when>
								<xsl:otherwise>
								<tr bgcolor="red">
								<td colspan="2">
								<font color="red">
								<b><xsl:value-of select="@lb"/>
								-Failed
								</b>
								</font>
								</td>
								</tr>
								</xsl:otherwise>
							</xsl:choose>
				        </a>
				      </h4>
				    </div>
				    <div id="{$test}" class="panel-collapse collapse in">
				      <div class="panel-body">
				      <table border="1">
					  <tr bgcolor="#d4d4d4">
								<td><pre><b>Sampler Result</b></pre></td>
								<td nowrap="wrap">
									Thread Name  	 : <xsl:value-of select="@tn"/><br/>
									Sample Start 	 : <script>
													var date=new Date(<xsl:value-of select="@ts"/>);
													document.write(date);
												   </script><br/>
									Load Time    	 : <xsl:value-of select="@lt"/><br/>
									Latency      	 : <xsl:value-of select="@t"/><br/>
									Size in bytes    : <xsl:value-of select="@by"/><br/>
									Headers Size in bytes    : <xsl:value-of select="@lt"/><br/>
									Body Size in bytes     : <xsl:value-of select="@by"/><br/>
									Sampler Count    : <xsl:value-of select="@sc"/><br/>
									Error Count      : <xsl:value-of select="@ec"/><br/> 
									Response Code    : <xsl:value-of select="@rc"/><br/>
									Response Message : <xsl:value-of select="@rm"/><br/><br/>
									
									<b>Response headers:</b><br/>
									<pre><xsl:value-of select="responseHeader"/></pre><br/><br/>
								
								</td>
							</tr>
							<tr>
							<td bgcolor="white"><b>Request</b></td>
							<td>
								<xsl:choose>	
								<xsl:when test="string-length(substring-after(samplerData,'{')) != 0">
								<b>URL :</b><br/>
									<pre><xsl:value-of select="substring-before(samplerData,'{')"/></pre>
								<br></br><b>Json :</b><br/>
								<pre>{<xsl:value-of select="substring-after(samplerData,'{')"/></pre>
								</xsl:when>
								<xsl:otherwise>
								<xsl:value-of select="samplerData"/>
								</xsl:otherwise>
								</xsl:choose>
							</td>
							</tr>
							
							<tr bgcolor="#d4d4d4">
							<td><b>Response</b></td>
							<td style="width:100px">
								<xsl:value-of select="responseData"/>
							</td>
							</tr>
							</table>
				      </div>
				    </div>
				  </div>
				  
			</xsl:for-each>
			</div>
			</center>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>