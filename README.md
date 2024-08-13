# StudentManagerSpringBootProject

This is a Spring Boot API for managing student data, built to assist in college placements. The API supports various CRUD operations such as registering students, retrieving student information by roll number, fetching all students, and deleting student records.

## Table of Contents
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Project Structure](#project-structure)
- [Setup and Installation](#setup-and-installation)
- [API Endpoints](#api-endpoints)
- [Database Configuration](#database-configuration)
- [Swagger Documentation](#swagger-documentation)
- [License](#license)
- [Contact](#contact)

## Features
- **Register Student:** Add a new student to the database.
- **Get Student by Roll Number:** Retrieve specific student details using their roll number.
- **Get All Students:** Fetch details of all students in the database.
- **Delete Student:** Remove a student from the database.

## Technologies Used
- **Java**: Core programming language.
- **Spring Boot**: Framework used for building the RESTful API.
- **Maven**: Build automation tool.
- **Lombok**: Reduces boilerplate code (like getters, setters).
- **Swagger**: API documentation and testing tool.
- **MySQL**: Relational database used to store student data.

## Project Structure
```bsh
StudentManagerSpringBootProject
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── studentmanager
│   │   │               ├── controller
│   │   │               ├── entity
│   │   │               ├── repository
│   │   │               ├── service
│   │   │               └── StudentManagerApplication.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── schema.sql
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── studentmanager
│                       └── StudentManagerApplicationTests.java
└── pom.xml
```

- **`controller`**: Contains REST controllers that handle incoming HTTP requests and responses.
- **`entity`**: Contains the JPA entities representing the database tables.
- **`repository`**: Contains the repository interfaces for database operations.
- **`service`**: Contains the service classes implementing business logic.
- **`StudentManagerApplication.java`**: Main class to run the Spring Boot application.

## Setup and Installation

1. **Clone the Repository**
   ```bash
   git clone https://github.com/excptional/StudentManagerSpringBootProject.git
   cd StudentManagerSpringBootProject
   ```

2. **Configure MySQL Database**
   - Create a new database in MySQL named `student_details`.
   - Configure the database connection in `src/main/resources/application.yml` `src/main/resources/application-dev.yml` `src/main/resources/application-prod.yml`.

3. **Build the Project**
   ```bash
   mvn clean install
   ```

4. **Run the Application**
   ```bash
   mvn spring-boot:run
   ```

## API Endpoints

#### API URL
```bash
https://studentmanagerspringbootproject-exceptional.up.railway.app
```

### Student Controller

| Method | Endpoint                         | Description                        |
|--------|----------------------------------|------------------------------------|
| POST   | `/students`                      | Register a new student             |
| GET    | `/students/{rollNo}`             | Get a student by roll number       |
| GET    | `/students/all`                  | Get all students                   |
| DELETE | `/students/{id}`                 | Delete a student by id    |

### Example Request
#### Register Student
`POST https://studentmanagerspringbootproject-exceptional.up.railway.app/students`
```json
{
    "id": 1,
    "email": "example@example.com",
    "name": "John Doe",
    "address": "123 Main St, Anytown, USA",
    "phone_no": "1234567890",
    "roll_no": "R12345",
    "registration_no": "REG123456",
    "dept": "Computer Science",
    "dob": "2000-01-01",
    "sex": "Male",
    "course_type": "Full-time",
    "school": {
        "pct_10th": "85.5",
        "yop_10th": "2016",
        "pct_12th": "88.0",
        "yop_12th": "2018",
        "phys_marks_12th": "75",
        "chem_marks_12th": "80",
        "math_marks_12th": "90"
    },
    "diploma": {
        "diploma_sgpa_sem1": "8.5",
        "diploma_sgpa_sem2": "8.7",
        "diploma_sgpa_sem3": "8.8",
        "diploma_sgpa_sem4": "8.6",
        "diploma_sgpa_sem5": "8.9",
        "diploma_sgpa_sem6": "8.8",
        "diploma_ogpa": "8.7",
        "diploma_pct_sem1": "85.0",
        "diploma_pct_sem2": "86.0",
        "diploma_pct_sem3": "87.0",
        "diploma_pct_sem4": "86.5",
        "diploma_pct_sem5": "87.5",
        "diploma_pct_sem6": "88.0",
        "diploma_opct": "86.8",
        "yop_diploma": "2021"
    },
    "be": {
        "be_sgpa_sem1": "9.0",
        "be_sgpa_sem2": "9.1",
        "be_sgpa_sem3": "9.0",
        "be_sgpa_sem4": "8.9",
        "be_sgpa_sem5": "9.2",
        "be_sgpa_sem6": "9.1",
        "be_sgpa_sem7": "9.3",
        "be_sgpa_sem8": "9.2",
        "be_cgpa": "9.1",
        "be_pct_sem1": "90.0",
        "be_pct_sem2": "91.0",
        "be_pct_sem3": "90.5",
        "be_pct_sem4": "89.5",
        "be_pct_sem5": "91.0",
        "be_pct_sem6": "90.0",
        "be_pct_sem7": "92.0",
        "be_pct_sem8": "91.5",
        "be_opct": "90.8",
        "yop_be": "2024",
        "backlogs": "0",
        "back_papers": "None"
    },
    "pref_job_roles": "Software Engineer, Web Developer",
    "prof_exp": "Yes",
    "linked_in": "https://www.linkedin.com/in/johndoe",
    "github": "https://github.com/johndoe",
    "resume": "https://example.com/resume.pdf"
}

```

#### Get Student by Roll Number
`GET https://studentmanagerspringbootproject-exceptional.up.railway.app/students/CSE420`

## Database Configuration

Configure your database settings in the `src/main/resources/application-dev.yml` file:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/student_details
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## Swagger Documentation

Swagger is integrated to visualize and test the API. Once the application is running, you can access the Swagger UI at:

```
http://localhost:8080/swagger-ui.html
```
## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contact

For any questions or suggestions, feel free to reach out:

- **Name**: [Bikash Dutta]()
- **Email**: [bd27official@gmail.com]()
- **LinkedIn**: [Bikash Dutta](https://www.linkedin.com/in/excptional/)

---

This `README.md` file provides a comprehensive guide to your **StudentManagerSpringBootProject**, outlining its structure, features, setup instructions, and API usage. You can customize it further based on your specific project details.
