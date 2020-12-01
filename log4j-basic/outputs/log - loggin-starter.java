2020-11-13 15:22:47,985 [main] INFO  org.hotwater.main.Application - Starting Application on A317LBJX with PID 19600 (C:\_repos\3_spring\log4j-basic\target\classes started by 152029 in C:\_repos\3_spring\log4j-basic)
2020-11-13 15:22:47,994 [main] INFO  org.hotwater.main.Application - No active profile set, falling back to default profiles: default
2020-11-13 15:22:49,292 [main] INFO  org.springframework.boot.web.embedded.tomcat.TomcatWebServer - Tomcat initialized with port(s): 8002 (http)
2020-11-13 15:22:49,315 [main] INFO  org.apache.coyote.http11.Http11NioProtocol - Initializing ProtocolHandler ["http-nio-8002"]
2020-11-13 15:22:49,316 [main] INFO  org.apache.catalina.core.StandardService - Starting service [Tomcat]
2020-11-13 15:22:49,316 [main] INFO  org.apache.catalina.core.StandardEngine - Starting Servlet engine: [Apache Tomcat/9.0.37]
2020-11-13 15:22:49,401 [main] INFO  org.apache.catalina.core.ContainerBase.[Tomcat].[localhost].[/] - Initializing Spring embedded WebApplicationContext
2020-11-13 15:22:49,401 [main] INFO  org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext - Root WebApplicationContext: initialization completed in 1378 ms
2020-11-13 15:22:49,633 [main] INFO  org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor - Initializing ExecutorService 'applicationTaskExecutor'
2020-11-13 15:22:49,754 [main] INFO  org.apache.coyote.http11.Http11NioProtocol - Starting ProtocolHandler ["http-nio-8002"]
2020-11-13 15:22:49,800 [main] INFO  org.springframework.boot.web.embedded.tomcat.TomcatWebServer - Tomcat started on port(s): 8002 (http) with context path ''
2020-11-13 15:22:49,809 [main] INFO  org.hotwater.main.Application - Started Application in 2.084 seconds (JVM running for 2.672)
2020-11-13 15:22:49,812 [main] INFO  NO_LOGGER_NAME - This is a simple message at INFO level.
2020-11-13 15:22:49,812 [main] ERROR NO_LOGGER_NAME - This is a simple message at ERROR level. This is the minimum visible level.
java.lang.RuntimeException: This is only a test!
        at org.hotwater.main.Application.main(Application.java:44)

        
        
estaba configurado spring-boot-starter-log4j2
SIN EL spring-boot-starter-logging
        