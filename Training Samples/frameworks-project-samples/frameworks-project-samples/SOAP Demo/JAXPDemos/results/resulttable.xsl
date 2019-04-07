<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:fn="http://www.w3.org/2005/xpath-functions">
	<xsl:template match="/">
		<html>
		<head>
				<title>Results Tree</title>
				<script src="http://www.freeformatter.com/js/1.12/freeformatter.js"></script>
				<link href="http://netdna.bootstrapcdn.com/bootstrap/3.0.2/css/bootstrap.min.css" rel="stylesheet" />
		</head>
		<body>
		<center>
			<font color="#dd4814" size="6px">
			<b>
			Results Table For the Tests  : 
			<script>
				document.write(document.lastModified);
			</script>
			</b>
			</font>
			</center>
			<center>
			<div class="table-responsive">
            <table cellpadding="0" cellspacing="0" border="0" class="table table-striped table-bordered dataTable DTTT_selectable" id="example" width="50%" style="width: 70%;">
			
				<tr bgcolor="crimson">
					<th width="5%">Sample #</th>
					<th width="15%">Label</th>
					<th width="5%">Sample Time(ms)</th>
					<th width="5%">Code</th>
					<th width="10%">Status</th>
				</tr>
				<xsl:for-each select="testResults/sample">
					<tr>
					<td><xsl:value-of select="position()"/></td>
					<td>
						<xsl:value-of select="@lb"/>
					</td>
					<td>
						<xsl:value-of select="@t"/>
					</td>
					<td>
						<xsl:value-of select="@rc"/>
					</td>
					<td>
						<xsl:choose>
							<xsl:when test="@rc = 200">
								<b><font color="green">Success</font></b>
							</xsl:when>
							<xsl:otherwise>
								<b><font color="red">Fail</font></b>
							</xsl:otherwise>
						</xsl:choose>
					</td>
					</tr>
				</xsl:for-each>
			</table>
			</div>
			</center>
			<center>
			<xsl:variable name="totalcount" select="testResults/sample"/>
			<xsl:variable name="successcount" select="testResults/sample[@rc = 200]"/>
			<xsl:variable name="failcount" select="testResults/sample[@rc != 200]"/>
			<font color="#313200" size="3"><b>Total No Tests : <xsl:value-of select="count($totalcount)"/><xsl:text>&#xA0;&#xA0;&#xA0;&#xA0;&#xA0;&#xA0;&#xA0;&#xA0;&#xA0;</xsl:text></b></font>
			<font color="green" size="3"><b>Successful Tests : <xsl:value-of select="count($successcount)"/><xsl:text>&#xA0;&#xA0;&#xA0;&#xA0;&#xA0;&#xA0;&#xA0;&#xA0;&#xA0;</xsl:text></b></font>
			<font color="red" size="3"><b>Failed Tests : <xsl:value-of select="count($failcount)"/></b></font>
			</center>
		</body>
		</html>
	</xsl:template>
</xsl:stylesheet>