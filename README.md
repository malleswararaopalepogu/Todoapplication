# Todo App

A simple and user-friendly Todo application built using **Spring Boot, Spring Data JPA, Thymeleaf, and MySQL**.

This project demonstrates how to build a CRUD-based web application using Spring Boot and connect it with a relational database.

## Features

*  Add new Todo tasks
*  Mark Todo tasks as completed/uncompleted
*  Update Todo tasks
*  Delete Todo tasks
*  Display all Todo tasks
*  Prevent empty Todo submission
*  Store Todo data in MySQL database
*  Server-side HTML rendering using Thymeleaf

##  Technologies Used

* **Java**
* **Spring Boot**
* **Spring MVC**
* **Spring Data JPA**
* **Hibernate**
* **Thymeleaf**
* **MySQL**
* **HTML5**
* **CSS3**
* **Bootstrap**
* **Maven**

##  Project Structure

```text
src/
└── main/
    ├── java/
    │   └── com.springbootprojects.todoapp/
    │       ├── controller/
    │       ├── entity/
    │       └── repository/
    │
    └── resources/
        ├── templates/
        │   └── index.html
        ├── static/
        │   ├── css/
        │   └── favicon.png
        └── application.properties
```

##  Application Flow

 
User
 ↓
Thymeleaf UI
 ↓
Spring MVC Controller
 ↓
Spring Data JPA Repository
 ↓
Hibernate
 ↓
MySQL Database
```
  
## Future Improvements

* User authentication and authorization
* Todo categories and priorities
* Due dates and reminders
* Search and filtering
* REST API integration
* Responsive UI improvements

##  Author

**PALEPOGU NAGAMALLESWARA RAO**

If you found this project useful, feel free to ⭐ the repository.
