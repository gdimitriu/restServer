module restServer.server {
    requires spring.web;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires org.apache.tomcat.embed.core;
    requires spring.jcl;
    requires spring.beans;
    requires spring.context;
    requires spring.webmvc;
    requires java.management;
    requires org.slf4j;
    requires spring.security.core;
    requires spring.security.web;
    requires spring.security.config;
}