

# ENDPOINTS  #
<a href>localhost:8080/api/threads/add?producerCount=22&consumerCount=1 </a>

<a href>localhost:8080/api/counter/change?counter=20 </a>

# DOCKERIZE #
1. run cmd `cd devops/docker`
2. to build java image run `build.sh`
3. to docker-compose up run `start.sh`
4. to docker-compose down run `stop.sh`

## Flow ##

1. Open project from .POM file
2. Config new Configuration(edit configuration in IDEA) use Spring boot
- set Main class: **com.test.producerconsumer.ProducerConsumerApplication**    
3. Create database
- run commands: 

           mysql -u root -p

           create database counter;
           
4. Run main method !
  
