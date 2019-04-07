<%@taglib uri="/WEB-INF/tlds/color.tld" prefix="my"%>
<html>
<body>
 <h1>
  <my:color value="blue">
     This is Blue Color.<br>
     <my:color value="red">
       This should be red.<br>
       <my:color value="green">
           This should be in green.<br>
           <my:color value="yellow">
               This should be in Yellow.<br>
               <my:color value="pink">
                   This should be in pink.<br>
                   <my:color value="grey">
                   This should be in grey.<br>
	                   <my:color value="orange">
	                   This should be in orange.<br>
	                   </my:color>
                   </my:color>
               </my:color>
           </my:color>
       </my:color>
     </my:color><br>
     This is<%="blue"%>again.
  </my:color>
 </h1>
</body>
</html>