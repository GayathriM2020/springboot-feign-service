# springboot-feign-service

# Read Me First
The following was discovered as part of building this project:

http://localhost:8082/user/data
hit this endpoint, internally it will hit http://localhost:8081/hello and get the response.
Both discovery-client-feign-service and discover-client-eureka registered in eureka server discovery-server-eureka.

enabled micrometer tracing and zipkin for data visualization.
http://localhost:9411


* The original package name 'com.example.discovery-client-feign-service' is invalid and this project uses 'com.example.discovery_client_feign_service' instead.
