FROM openjdk:8-alpine

COPY target/uberjar/codeview.jar /codeview/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/codeview/app.jar"]
