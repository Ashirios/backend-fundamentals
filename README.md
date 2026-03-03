
---

# Java Backend Fundamentals

This repository contains practical assignments focused on deep-diving into Java Core, multithreading, testing, and database interactions. These modules represent the fundamental building blocks I use to develop robust Spring Boot services.

## 📂 Project Structure

### 1. [Java OOP & API](https://www.google.com/search?q=./java-oop-and-api)

Language fundamentals and standard libraries:

* **Collections Framework**: Hands-on experience with List, Set, Map, Queue, and Iterators.
* **Stream API & Lambdas**: Functional-style data processing.
* **Exception Handling**: Implementing custom exceptions and utilizing try-with-resources blocks.
* **OOP Design**: Practical application of interfaces, inheritance, and abstract classes (e.g., Project Garage, Animals, Math).

### 2. [Concurrency & Multithreading](https://www.google.com/search?q=./javaee-concurrency-and-multithreading)

Mastering multi-threaded execution (one of Java's most complex areas):

* Thread creation via `Thread` class and `Runnable` interface.
* Using `ExecutorService` and `ThreadFactory` for efficient thread pool management.
* Implementation of schedulers (`CleaningScheduler`) and logging processors.
* Handling DAO (Data Access Objects) in a multi-threaded environment.

### 3. [Unit Testing (JUnit 5 & Mockito)](https://www.google.com/search?q=./JUnit)

Demonstrating a culture of writing reliable and maintainable code:

* **JUnit 5**: Mastering the test lifecycle (`@BeforeEach`, `@AfterEach`) and nested test structures (`@Nested`).
* **Parameterized Tests**: Testing logic against various data sets using CSV and argument sources.
* **Mockito**: Creating mocks to isolate business logic (e.g., testing banking operations).
* **Assumptions & Timeouts**: Validating execution conditions and performance constraints.

### 4. [JDBC & Database Basics](https://www.google.com/search?q=./learning-jdbc-2725172)

Low-level interaction with relational databases:

* Direct database connectivity using JDBC.
* Writing SQL queries and utilizing `DatabaseUtils` for resource management.
* Understanding the "under the hood" mechanics of ORM frameworks like Hibernate.

---

## 🛠 Tech Stack

* **Language:** Java 17+
* **Build Tool:** Maven
* **Testing:** JUnit 5, Mockito
* **Database:** PostgreSQL / JDBC
* **Environment:** Docker (basic DB orchestration)

## 🚀 How to Run

Each module is an independent Maven project. To run the tests, use:

```bash
mvn test

```

---

### Pro-Tip for your Portfolio:

Since you've mentioned that this is the "foundation for Spring Boot services," you might eventually want to add a **"Path to Spring"** section at the bottom. This shows recruiters exactly how you plan to bridge these Core skills into the Enterprise world (e.g., moving from JDBC to Spring Data JPA).

