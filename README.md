# 🏥 Hospital Management System

A **Hospital Management System** developed using Java, Spring Boot, and MySQL to simplify and manage hospital operations through a structured backend application. The project demonstrates REST API development, database integration, and CRUD (Create, Read, Update, Delete) operations for managing hospital-related information.

## 📌 Project Overview

The Hospital Management System is designed to organize hospital data and simplify the management of patients and doctors. It provides RESTful APIs to perform essential operations, making it easier to create, retrieve, update, and delete patient records.

The project follows a layered application structure to improve code organization, maintainability, and scalability. It also serves as a practical implementation of Java backend development concepts using the Spring Boot framework.

## 🎯 Objectives

* Develop a backend application for managing hospital information.
* Implement RESTful APIs using Spring Boot.
* Perform CRUD operations for patient records.
* Integrate MySQL for persistent data storage.
* Use object-oriented programming principles to structure the application.
* Build a foundation for extending the system with additional hospital management features.

## 🛠️ Technologies Used

| Technology        | Purpose                                 |
| ----------------- | --------------------------------------- |
| Java 23           | Backend programming language            |
| Spring Boot 4     | Backend application framework           |
| Spring Web        | Building RESTful APIs                   |
| MySQL             | Relational database management          |
| MySQL Connector/J | Connecting Java applications to MySQL   |
| Maven             | Dependency management and project build |
| IntelliJ IDEA     | Development environment                 |
| Lombok            | Reducing boilerplate code               |
| MapStruct         | Object mapping between Java classes     |

*The table lists the technologies associated with the project setup; verify your `pom.xml` before publishing the final version.*

## ✨ Features

### 👤 Patient Management

* Add new patient records.
* Retrieve all patient records.
* Retrieve a patient by ID.
* Update existing patient information.
* Delete patient records.

### 🩺 Doctor Management

The project is being structured to support doctor-related information, including:

* Doctor name and contact details.
* Gender and specialization.
* Email and address information.

*Include these doctor management features as completed functionality only after implementing and testing their corresponding APIs.*

### 🔗 RESTful API Development

* Uses HTTP endpoints to manage application data.
* Supports standard CRUD operations.
* Organizes endpoints using Spring Boot controllers.

### 🗄️ Database Integration

* Uses MySQL for relational data storage.
* Connects the backend application to the database.
* Supports persistent storage of application records.

## 📂 Project Structure

```text
HospitalManagementSystem/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── .../
│   │   │       ├── controller/
│   │   │       ├── entity/
│   │   │       ├── repository/
│   │   │       └── service/
│   │   └── resources/
│   │       └── application.properties
│   └── test/
├── pom.xml
└── README.md
```

*The structure above is illustrative. Adjust the package names and folders to match your actual repository.*

## ⚙️ Installation and Setup

### Prerequisites

Install the following before running the project:

* Java Development Kit (JDK) 23
* MySQL Server
* IntelliJ IDEA or another Java IDE
* Maven (or use the Maven Wrapper if included)

### Step 1: Clone the Repository

```bash
git clone https://github.com/YOUR-USERNAME/HospitalManagementSystem.git
```

Navigate to the project directory:

```bash
cd HospitalManagementSystem
```

Replace `YOUR-USERNAME` and the repository name with your actual GitHub details.

### Step 2: Create the MySQL Database

Open MySQL and execute:

```sql
CREATE DATABASE hospital_management;
```

Use the database name configured in your application.

### Step 3: Configure Database Credentials

Update `src/main/resources/application.properties` with your local database configuration:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/hospital_management
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

Set the `DB_USERNAME` and `DB_PASSWORD` environment variables to your MySQL credentials. Ensure that the project has the required Spring Data JPA and MySQL dependencies.

**Important:** Keep your database credentials private. Do not commit passwords or other secrets to GitHub.

### Step 4: Run the Application

Using Maven:

```bash
mvn spring-boot:run
```

Alternatively, open the project in IntelliJ IDEA and run the main Spring Boot application class.

Once the application starts successfully, you can test the configured endpoints using Postman or another API client.

## 🔌 API Endpoints

The following endpoints represent the patient controller routes established in the project.

| Method | Endpoint     | Description              |
| ------ | ------------ | ------------------------ |
| POST   | `/home`      | Add a patient            |
| GET    | `/home`      | Retrieve all patients    |
| GET    | `/home/{id}` | Retrieve a patient by ID |
| PUT    | `/home/{id}` | Update a patient         |
| DELETE | `/home/{id}` | Delete a patient         |

**Note:** These routes reflect the controller mappings discussed during development. Confirm the HTTP method mappings and request formats in your actual controller before using this table as API documentation.

## 🧪 Testing

You can test the API endpoints using Postman.

1. Start the Spring Boot application.
2. Confirm that the application connects to MySQL.
3. Send a POST request to create a patient.
4. Send a GET request to retrieve patient records.
5. Test updating a record using PUT.
6. Test deleting a record using DELETE.

Verify that each operation returns the expected response and that the database reflects the changes.

## 🚀 Future Enhancements

Potential improvements for future versions include:

* Doctor registration and management.
* Appointment scheduling.
* Patient medical history management.
* Department and specialization management.
* User authentication and role-based authorization.
* Billing and payment management.
* Input validation and centralized exception handling.
* API documentation using Swagger/OpenAPI.
* Unit and integration testing.

These are planned enhancements, not claims about currently implemented functionality.

## 📚 Learning Outcomes

Through this project, I am gaining practical experience in:

* Java backend development.
* Spring Boot application development.
* REST API design and implementation.
* MySQL database integration.
* CRUD operations and HTTP methods.
* Organizing Java applications into maintainable components.
* Debugging and testing backend applications.

## 👨‍💻 Author

**Gannerla Nikhil Teja**

Aspiring Java Backend Developer | Software Development Enthusiast

---

⭐ If you find this project useful, feel free to explore the repository and share your feedback.
