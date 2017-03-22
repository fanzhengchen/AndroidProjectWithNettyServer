#!/bin/sh
java -Xbootclasspath/a:okhttp-3.6.0.jar:okio-1.11.0.jar \
    -Xbootclasspath/p:/Users/fanzhengchen/.M2/repository/org/mortbay/jetty/alpn/alpn-boot/8.1.9.v20160720/alpn-boot-8.1.9.v20160720.jar \
    -jar http2.jar \

