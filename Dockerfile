#maven镜像FROM于java镜像所以不用引入jdk
FROM maven:3.3.3

ADD pom.xml /tmp/build/
RUN cd /tmp/build/src
#构建应用
RUN cd /tmp/build && mvn -q -DskipTests=true package \
       #拷贝编译结果到指定目录
       && mv target/*.jar /app.jar \
       #清理编译痕迹
       && cd / && rm -rf /tmp/build

VOLUME /tmp
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]