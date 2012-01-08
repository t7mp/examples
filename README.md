T7MP - EXAMPLES
===============

The examples show different usage scenarios for the t7mp maven plugin.


## Simple ##

This example shows how to use the plugin for rapid development. Primary the scanner feature is used to track changes
in the webapplication. Any change to the webpage will be directly published to the server. This is really useful
for web development. Is it not necessary to rebuild the project an restart the server to check the changes.

* run with t7:run
* stop with ctrl + c

The example shows also how to set different JVM args for tomcat than for maven. This feature works with the

* t7:run-forked

goal and used the setenv.sh (mac/unix) or setenv.bat (win) to set the JVM args.


## external-libs ##

Simple example for using 'libs'-configuration with 'maven-t7-plugin'.

Run 'mvn clean install t7:run' and point your Browser to http://localhost:8080/external-libs/.

It should show you the version of DerbyDB used in this project.


## tomee ##

Simple example how to run 'apache-tomee' with 'maven-t7-plugin'.

In the 'tomee'-directory run 'mvn clean install t7:run-forked-tomee' and point your browser to http://localhost:8080/openejb/.

It should show you the entry-site of 'openejb' where you can test the installation.
