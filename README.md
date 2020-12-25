# **API Gateway**
>  API Gateway is a server and single entry point into a system. It provides an API that is tailored to each client.

#### Responsibilities:
    * authentication
    * monitoring
    * load balancing
    * caching
    * request routing
    * composition
All the requests made by the client go through the API Gateway. After that, the API Gateway routes requests to the appropriate microservice.

It handles the req in one of the two ways:
1. It routed or proxied the requests to the appropriate service.
2. Fanning out (spread) a request to multiple service

#### Disadvantages:
1. It requires routing rules.
2. There is a possibility of a single point of failure.
3. Risk of complexity due to all the API rules are in one place.

#### **Zuul API Gateway**
> Zuul Server is an API Gateway application. It handles all the requests and performs the dynamic routing of microservice applications. It works as a front door for all the requests. It is also known as Edge Server.

###### Zuul filter functionalities:
* Authentication and Security: It provides authentication requirements for each resource.
* Insights and Monitoring: It tracks meaningful data and statistics that give us an accurate view of production.
* Dynamic Routing: It dynamically routes the requests to different backed clusters as needed.
* Stress Testing: It increases the traffic to a cluster in order to test performance.
* Load Shedding: It allocates capacity for each type of request and drops a request that goes over the limit.
* Static Response Handling: It builds some responses directly at the edge instead of forwarding them to an internal cluster.
* Multi-region Resiliency: It routes requests across AWS regions in order to diversify our ELB usa


* _discovery-server_ - Eureka Discovery Server to regiter the microservices
* _shopping-service_ -Restfull services which provides the shopping items
* _zuul-gateway_ gateway server using zuul to route the  traffic
* _shopping-client_ - Restful Service to invoke the shopping service using feign client through the gateway
