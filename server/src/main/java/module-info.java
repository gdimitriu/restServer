/*
 Copyright (c) 2021 Gabriel Dimitriu All rights reserved.
 DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.

 This file is part of restServer project.

 restServer is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 restServer is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with poc_aws.  If not, see <http://www.gnu.org/licenses/>.
 */
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
    requires com.fasterxml.jackson.annotation;
    requires com.fasterxml.jackson.dataformat.xml;
    requires com.fasterxml.jackson.databind;
    requires com.fasterxml.jackson.core;
}