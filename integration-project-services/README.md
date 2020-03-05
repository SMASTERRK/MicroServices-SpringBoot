# SpringBootPOC
SpringBoot demo for rest application


GET Service
http://localhost:8080/employees/list

Will return the list of employees data which hardcoded.

POST Service
http://localhost:8080/employees/addEmployee

Will accept the json data and added to existing employee list.


The Application embedded with tomcat servier
To start an application -> Run it as Java Application

=======================================================================================================

2019-09-07 19:26:58.502  INFO 3620 --- [           main] c.s.rest.SpringBootDemoApplication       : Starting SpringBootDemoApplication on Compaq with PID 3620 (started by Ram Kumar in E:\Projects - 2019\SpringBootPOC)
...
2019-09-07 19:27:02.130  INFO 3620 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''

2019-09-07 19:27:02.138  INFO 3620 --- [           main] c.s.rest.SpringBootDemoApplication       : Started SpringBootDemoApplication in 4.136 seconds (JVM running for 4.675)

2019-09-07 19:27:20.588  INFO 3620 --- [nio-8080-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring FrameworkServlet 'dispatcherServlet'

2019-09-07 19:27:20.589  INFO 3620 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : FrameworkServlet 'dispatcherServlet': initialization started

2019-09-07 19:27:20.625  INFO 3620 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : FrameworkServlet 'dispatcherServlet': initialization completed in 36 ms
