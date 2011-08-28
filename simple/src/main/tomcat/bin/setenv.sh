#!/bin/sh

CATALINA_OPTS="-server -Djava.awt.headless=true \
			-Dfile.encoding=UTF-8 \
			-Xms1024m -Xmx1536m \
			-XX:NewSize=256m -XX:MaxNewSize=256m \
			-XX:PermSize=256m -XX:MaxPermSize=512m \
			-XX:+DisableExplicitGC \
			-Dcom.sun.management.jmxremote.port=7979 \
    		-Dcom.sun.management.jmxremote.ssl=false \
    		-Dcom.sun.management.jmxremote.authenticate=false"