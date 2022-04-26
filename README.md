
# Higherlife Foundation

## Requirements
- JDK ~> 1.8 / 11 
- Spring Boot ~> 2.5.2
- Maven \>= 3.6.3
- IDE of your choice (e.g Intellij/Eclipse/STS etc)

## Database
- mysql
- db name: hlf_portal_db
- username: root
- password: Abc1234$
---

### Project structure

This project consists of 1 deploy-able artefacts:
```
+-- HLF
+-- .idea
|   +-- src/
+-- target
+-- pom.xml
+-- README.md
```

### Local development

Run the below commands from the project root:
1. Build the project
```
mvn -B  clean install --file pom.xml
```

2. Run the application using the below command
```
- mvn spring-boot:run
- or run the application from the the IDE run menu.(i used intelliJ)
```
3. Go to this url to launch the application
```
http://localhost:8080/login
```

**Notes:**
- This project is not completed, just the login and registration processes. 
- The developer could not have much time to complete the work.
- Despite the time factor, the login and registration of students can be tested and its working
- The developer needed additional 4 to 5 hours to complete the work
---
