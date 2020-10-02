# metric

## Using the Actuator end points

http://localhost:8080/actuator
* enabled all actuator endpoints.  See application.properties files.

### Info

http://localhost:8080/actuator/info
* added build info, git info and custom attributes.

### health

http://localhost:8080/actuator/health
* enabled more details

### Metric

http://localhost:8080/actuator/metrics
* standand options

### prometheus

http://localhost:8080/actuator/prometheus
* enabled prometheus metric endpoint

## Open API 3.0 documentation

* JSON Output:

http://localhost:8080/v3/api-docs/ 
or
http://localhost:8080/api-docs/ 

See how the urls are customizable with application.properties like...
springdoc.api-docs.path=/api-docs

* Swagger UI:

http://localhost:8080/swagger-ui.html 
or 
http://localhost:8080/swagger-ui-custom.html

* More reference: https://springdoc.org/

## How to re-generate the build and git details with Actuator /info endpoint

* Run maven goal ==> spring-boot:build-info 
    * generates the file target/classes/META-INF/build-info.properties file.
* Run maven goal ==> spring-boot:build-image
    * generates the file target/classes/git.properties file.

