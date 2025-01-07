## About The Project

This is something I developed to improve and showcase my level of familiarity with in-demand tools like the Spring Boot framework, React library, and general database operations.

Some features:
- Employee management: you can add, update, view, and delete existing people and their records
- Departmental management: you can simulate the organization and management of departments within a larger org
- The assignment of various roles to employees and departments
- Built-in searching by name, department, and/or role

## Technologies
- Frontend: Javascript, React, HTML/CSS
- Backend: Java, Spring Boot
- MySQL
- Maven
- Axios HTTP Library

## Installation
Firstly, make sure your JDK, Node.js, and MySQL versions are up-to-date. I believe any JDK 11+ or higher, Node.js 14+ or higher, and MySQL 8+ should suffice though. Also: Spring Boot 2+ and Maven 3+.

Cloning the repo:
   ```sh
  git clone https://github.com/eshan327/Corporate-Manager.git
  cd Corporate-Manager
   ```
Setting up the backend:
   ```sh
  cd Backend
spring.datasource.url=jdbc:mysql://localhost:3306/employee_db
spring.datasource.username=your_username
spring.datasource.password=your_password
   ```
Make sure to fill in `your_username` and `your_password`, of course. Then,
   ```sh
mvn clean install
mvn spring-boot:run
   ```
Now for the frontend:
   ```sh
cd ../Frontend
npm install
npm start
   ```
Lastly, open up `http://localhost:3000` in your browser and you're good to go!

## License
This project is licensed under the MIT License. See the [LICENSE](https://github.com/eshan327/Corporate-Manager/blob/main/LICENSE) file for details.
