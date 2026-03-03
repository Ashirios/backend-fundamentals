# Java Backend Fundamentals 

Репозиторий содержит мои практические работы по глубокому изучению Core Java, многопоточности, тестированию и работе с базами данных. Это фундамент, на котором строятся мои Spring Boot сервисы.

## 📂 Структура проекта

### 1. [Java OOP & API](./java-oop-and-api)
Основы языка и стандартные библиотеки:
* **Collections Framework**: Практика использования List, Set, Map, Queue и итераторов.
* **Stream API & Lambdas**: Обработка данных в функциональном стиле.
* **Exception Handling**: Создание кастомных исключений, блоки try-with-resources.
* **OOP Design**: Применение интерфейсов, наследования и абстрактных классов на практических примерах (Project Garage, Animals, Math).

### 2. [Concurrency & Multithreading](./javaee-concurrency-and-multithreading)
Работа с многопоточностью (одна из самых сложных тем в Java):
* Создание потоков через `Thread` и `Runnable`.
* Использование `ExecutorService` и `ThreadFactory` для управления пулом потоков.
* Реализация планировщиков (`CleaningScheduler`) и процессоров логирования.
* Работа с DAO в многопоточной среде.

### 3. [Unit Testing (JUnit 5 & Mockito)](./JUnit)
Демонстрация культуры написания надежного кода:
* **JUnit 5**: Жизненный цикл тестов (`@BeforeEach`, `@AfterEach`), вложенные тесты (`@Nested`).
* **Parameterized Tests**: Тестирование с различными наборами данных из CSV и аргументов.
* **Mockito**: Создание моков для изоляции бизнес-логики (тестирование банковских методов).
* **Assumptions & Timeouts**: Проверка условий выполнения тестов.

### 4. [JDBC & Database Basics](./learning-jdbc-2725172)
Низкоуровневая работа с реляционными базами данных:
* Прямое подключение к БД через JDBC.
* Написание SQL-запросов и использование `DatabaseUtils` для управления ресурсами.
* Понимание того, как работают ORM (Hibernate) "под капотом".

---

##  Технологический стек
* **Language:** Java 17+
* **Build Tool:** Maven
* **Testing:** JUnit 5, Mockito
* **Database:** PostgreSQL / JDBC
* **Environment:** Docker (базовое использование для БД)

##  Как запустить
Каждый модуль является независимым Maven-проектом. Для запуска тестов используйте:
```bash
mvn test
