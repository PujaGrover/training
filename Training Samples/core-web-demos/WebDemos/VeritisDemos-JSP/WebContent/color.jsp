<%@taglib uri="/WEB-INF/tlds/color.tld" prefix="veritis"%>
<html>
<body>
 <h1>
  <veritis:color value="blue">
     This is Blue Color.<br>
     <veritis:color value="red">
       This should be red.<br>
       <veritis:color value="green">
           This should be in green.<br>
           <veritis:color value="yellow">
               This should be in Yellow.<br>
               <veritis:color value="pink">
                   This should be in pink.<br>
                   <veritis:color value="grey">
                   This should be in grey.<br>
                   </veritis:color>
               </veritis:color>
           </veritis:color>
       </veritis:color>
     </veritis:color><br>
     This is<%="blue"%>again.
  </veritis:color>
 </h1>
</body>
</html>