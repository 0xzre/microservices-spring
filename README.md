# Spring Boot Microservices Miniproject

## Services Overview

### 1. Product Service
The Product Service is responsible for managing product information. It handles CRUD operations related to products, such as retrieving product details, adding new products, updating existing ones, and more.

### 2. Order Service
The Order Service manages order creation and processing. It allows users to place orders, calculate order totals, and keep track of order statuses. The Order Service interacts with the Product Service to retrieve product details.

### 3. Inventory Service
The Inventory Service maintains inventory levels and availability of products. It's responsible for managing stock quantities and providing information about product availability. The Inventory Service communicates with both the Product and Order Services.

## Communication Strategy

- **Synchronous Communication:** The Product and Order Services communicate synchronously via RESTful API endpoints. The Order Service fetches product details from the Product Service before completing an order.

- **Asynchronous Communication:** The Inventory Service communicates asynchronously using messaging with Kafka. When an order is placed, the Order Service publishes an event to Kafka, and the Inventory Service subscribes to these events to adjust inventory levels.

## Technologies Used

- **Spring Boot:** For creating microservices with ease and efficiency.
- **Spring Data:** For efficient data management and access.
- **Eureka Server:** For service discovery and registration.
- **Kafka:** For event streaming and asynchronous communication.
- **Resilience4j:** For implementing resilience patterns.
- **Docker:** For containerization and deployment.
- **Prometheus and Grafana:** For monitoring and performance analysis.

## Project Status: Finished
