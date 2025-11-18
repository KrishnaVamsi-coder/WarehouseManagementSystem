Warehouse Management System
Overview
This project is a Warehouse Management System (WMS) developed using Spring Boot, Spring Data JPA, Hibernate, and H2 Database. It aims to provide core functionalities such as inventory management, shipment processing, billing, returns handling, warehouse operations optimization, and reporting & analytics.

Features
Real-time inventory tracking and dashboard

Automated stock updates for received and shipped items

Automated alerts for low stock items via email/SMS

Digital order picking lists and shipping label generation

Automated billing and invoicing for shipments

Product returns and inspection workflow

Warehouse operations optimization including receiving workflow and labor monitoring

Custom reporting and KPI dashboards for decision making

Technologies Used
Spring Boot (REST APIs and backend services)

Spring Data JPA & Hibernate (ORM and database interaction)

H2 Database (in-memory DB for development and testing)

Maven/Gradle (build and dependency management)

Git & GitHub (version control and repository)

VS Code (development IDE/editor)

Setup Instructions
Clone the repository:

text
git clone https://github.com/yourusername/warehouse-management-system.git
Import the project into your IDE (e.g., VS Code, IntelliJ IDEA).

Run the application:

Run main class annotated with @SpringBootApplication.

Application will start on http://localhost:8080 by default.

Access H2 Console for database inspection:

URL: http://localhost:8080/h2-console

JDBC URL: jdbc:h2:mem:testdb

User: sa

Password: (leave empty)

Development Workflow
Update the codebase according to Jira sprint user stories and subtasks.

Implement backend services using Spring Boot with JPA for database interactions.

Use H2 database during development for quick iterations.

Commit and push code changes frequently to GitHub.

Pull latest updates before starting work.

