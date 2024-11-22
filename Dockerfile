FROM eclipse-temurin:17
COPY target/aws.jar aws.jar
CMD ["java","-jar","aws.jar"]