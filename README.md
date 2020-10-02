# metric

## How to re-generate the build and git details with Actuator /info endpoint

* Run maven goal ==> spring-boot:build-info 
    * generates the file target/classes/META-INF/build-info.properties file.
* Run maven goal ==> spring-boot:build-image
    * generates the file target/classes/git.properties file.

