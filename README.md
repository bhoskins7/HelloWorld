# HelloWorld Elastic APM Java App

### Pre-Requirements
1. Elastic APM Server in [Elastic Cloud](cloud.elastic.co) 
2. Running Docker Daemon

### Instructions
1. Run MySQL Docker Container
```
docker run --network test --name mysql -e MYSQL_ROOT_PASSWORD=my-secret-pw -d mysql
```

2. Identify Docker Container IP Address
```
docker inspect mysql | grep IPAddress
```

3. Configure MySQL Database
```
docker exec -it mysql mysql -h{IPAddress} -uroot -p 
create database demoprj; 
use demoprj; 
create table demo(id int(10), string varchar(20)); 
exit
exit
```

4. Run Tomcat Server (change environment variables for your environment | APM_SERVER | APM_TOKEN | MYSQL_URL)
```
docker run \
  -e APM_SERVER="https://a1e91b2c78284ab4a97bad1de3fdfd39.apm.us-central1.gcp.cloud.es.io" \
  -e APM_TOKEN="YrixiWxca1iSYHjkOb" \
  -e MYSQL_URL="jdbc:mysql://172.18.0.2:3306/" \
  -v /Users/username/workspace/HelloWorld/target/HelloWorld-0.0.1-SNAPSHOT.war:/usr/local/tomcat/webapps/ROOT.war \
  -v /Users/username/workspace/HelloWorld/elastic-apm-agent-1.12.0.jar:/usr/local/tomcat/elastic-apm-agent-1.12.0.jar \
  -v /Users/username/workspace/HelloWorld/setenv.sh:/usr/local/tomcat/bin/setenv.sh -p 8080:8080 tomcat:latest
```

5. Try [HelloWorld App](http://localhost:8080)

6. Try [Inserting Data to MySQL](http://localhost:8080/test)

7. Verify Data Collection in Kibana APM App
