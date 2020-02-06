#!/bin/bash
export CATALINA_OPTS="$CATALINA_OPTS -javaagent:/usr/local/tomcat/elastic-apm-agent-1.12.0.jar"
export CATALINA_OPTS="$CATALINA_OPTS -Delastic.apm.service_name=my-cool-service"
export CATALINA_OPTS="$CATALINA_OPTS -Delastic.apm.application_packages=elastic.apm"
export CATALINA_OPTS="$CATALINA_OPTS -Delastic.apm.server_urls=https://a1e91b2c78284ab4a97bad1de3fdfd39.apm.us-central1.gcp.cloud.es.io"
export CATALINA_OPTS="$CATALINA_OPTS -Delastic.apm.secret_token=YrixiWxca1iSYHjkOb"
