# For Java 11, try this
FROM adoptopenjdk/openjdk11:alpine-jre
# Refer to Maven build -> finalName
ARG JAR_FILE=target/*.jar
# cd /opt/app
WORKDIR /opt/app
# cp target/spring-boot-web.jar /opt/app/app.jar
COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","app.jar"]

#Docker işlemleri
#docker build -t product-service:0.0.1 . //product-service image oluşturdu
#docker-compose -p stock-management -f product-service.yml up -d // yml dosyaları çalıştırılarak container oluşturup projey ayağa kaldırıyoruz