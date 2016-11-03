# Spring Boot External Config War

> It wasn't my war ! (Rambo, First Blood, 1982)

## Build it
```mvn clean install```

## Configure it
Create a file `/path/to/file/application.properties` with the following content :
```
app.value = It works !
```

## Deploy it on Tomcat
Add VM args to Tomcat :
```-Dspring.config.location=/path/to/file/application.properties```

## Check it out
http://localhost:8080/

```value = [It works !]```
