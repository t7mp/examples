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

## provide-from-external ##

Shows how to serve static client content, maybe an angular-js-app and a spring-mvc-backend in one project.

## integration-testing ##

Shows how to configure and use the plugin for integration-testing.