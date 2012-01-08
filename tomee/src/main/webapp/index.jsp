<html>
<body>
	<h2>Simple Example for T7MP Maven Plugin</h2>

	<div class="fact">
		<h3>Rapid Development</h3>
		<p>Shows how to use the t7mp plugin for rapid development. Every
			change in this file or any other webpage will be directly available.
		</p>
		<p>
			This is reached with the
			<code>scanners</code>
			configuration
		</p>
		<p>
			<code>
				&lt;scanners&gt; <br>
				  &nbsp; &lt;scannerConfiguration/&gt; <br/>
				&lt;/scanners&gt;
			</code>
		</p>
	</div>

   <div class="fact">
      <h3>Different JVM Agrs for Tomcat and Maven</h3>
      <p>The Example show how to set JVM args for the tomcat process. This only works for the 
         goal <code>t7:run-forked</code>. The arguments can be set with the setenv.sh (mac/unix) and 
         setenv.bat (win) under <code>{basedir}/src/main/tomcat/bin</code> (this depends on the 
         tomcatConfigDirectory configuration parameter).
   </div>

</body>
</html>
