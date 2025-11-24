# Warehouse Management System

A Spring Boot-based Warehouse Management System designed for agile project management and modular feature releases. This project demonstrates best practices in Jira-driven Agile processes, including workflow configuration, sprint planning, and reporting.

## Features

- **Inventory Module:** Track stock levels, add/update items, and monitor quantities.
- **Shipment Module:** Manage warehouses shipments, monitor shipment status, and associate items with shipments.
- **Billing Module:** Automatically link bills to shipments for transparent invoicing and easy status checks.
- **User Management:** Add, delete, and manage warehouse users with secure role assignments.

## Technologies

- **Backend:** Java, Spring Boot
- **Database:** H2 (in-memory)
- **Agile Management:** Jira (Epics, Stories, Subtasks, Sprints, Board Visualizations, Reports)

## Project Structure

- `model/` – Entity definitions (User, Item, Shipment, Bill_Shipment, etc.)
- `repository/` – Spring Data JPA repositories for CRUD operations
- `service/` – Business logic and integration services
- `controller/` – REST endpoints for API access
- `resources/schema.sql` and `resources/data.sql` – Database tables and sample data for H2

## Agile Configuration

Sprint planning, workflow transitions, backlog prioritization, and velocity tracking are modeled and documented in Jira. The code base aligns with Jira artifacts for end-to-end agile project management.

## Quick Start

1. Clone the repository
2. Run `.\mvnw spring-boot:run`
3. Access H2 console at `http://localhost:8080/h2-console`
4. Use API endpoints for modules (Inventory, Shipment, Billing, User)

## Reporting & Visualization

Sprint execution reports, velocity charts, and board visualizations available via Jira dashboard.

