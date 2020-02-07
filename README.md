# HelloWorld Elastic APM Java App

### Pre-Requirements
1. Elastic APM Server
2. Local Docker Daemon


### Instructions
1. Run MySQL Docker Container
`
docker run --network test --name mysql -e MYSQL_ROOT_PASSWORD=my-secret-pw -d mysql
`

2. Identify Docker Container IP Address
`
docker inspect mysql | grep IPAddress
`

3. Configure MySQL Database
`
docker exec -it mysql mysql -h{IPAddress} -uroot -p 
create database demoprj; 
use demoprj; 
create table demo(id int(10), string varchar(20)); 
exit
exit
`
