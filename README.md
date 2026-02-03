# 🧑‍💻 JSP & Servlet Login System (Maven Project)

A simple **Login-Logout system** built using **Jakarta Servlets**, **JSP**, and **MySQL Database**.  
This project demonstrates **session management**, **authentication**, and **page redirection** with proper cache control.

---

## 🚀 Features

- User login authentication with MySQL  
- Session tracking using `HttpSession`  
- Cache control to prevent access after logout  
- JSP frontend for login, welcome, and video pages  
- Logout functionality to invalidate session  
- Maven-based project (WAR packaging)  
- Compatible with **Tomcat 10+** (Jakarta EE 9 / Servlet 6.0)

---

## 🗂️ Project Structure

servlets/
│
├── src/main/java/org/example/
│ ├── Login.java
│ ├── LoginDao.java
│ └── Logout.java
│
├── src/main/webapp/
│ ├── index.jsp
│ ├── welcome.jsp
│ ├── video.jsp
│ └── WEB-INF/
│ └── web.xml (optional)
│
└── pom.xml


---

## ⚙️ Setup Instructions

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/kadam-tejesh/servlets.git
cd servlets
2️⃣ Create Database and Table
CREATE DATABASE tejesh;
USE tejesh;

CREATE TABLE Login (
  UserName VARCHAR(50) PRIMARY KEY,
  Password VARCHAR(50)
);

3️⃣ Update Database Credentials
In LoginDao.java, update credentials if necessary:

INSERT INTO Login VALUES ('admin', 'admin123');
String url = "jdbc:mysql://localhost:3306/tejesh";
String username = "root";
String password = "your_password";

4️⃣ Build Project
mvn clean package

5️⃣ Deploy on Tomcat

Copy the generated WAR from target/ to Tomcat’s webapps/ folder.

Or run directly via IntelliJ:
Run → Edit Configurations → Add New Configuration → Tomcat Server → Local → Artifact → Run


Run

🌐 Application Flow

Open http://localhost:8080/servlets/index.jsp

Enter login credentials (admin / admin123)

On success → redirected to welcome.jsp

Access video.jsp for embedded YouTube video

Click logout → session invalidated → back to login page
🧰 Dependencies
<dependencies>
  <dependency>
    <groupId>jakarta.servlet</groupId>
    <artifactId>jakarta.servlet-api</artifactId>
    <version>6.0.0</version>
    <scope>provided</scope>
  </dependency>

  <dependency>
    <groupId>com.mysql</groupId>
    <artifactId>mysql-connector-j</artifactId>
    <version>8.3.0</version>
  </dependency>
</dependencies>

🧱 Maven Build Plugins
<build>
  <plugins>
    <plugin>
      <groupId>org.apache.maven.plugins</groupId>
      <artifactId>maven-compiler-plugin</artifactId>
      <version>3.11.0</version>
      <configuration>
        <release>23</release>
      </configuration>
    </plugin>

    <plugin>
      <groupId>org.apache.maven.plugins</groupId>
      <artifactId>maven-war-plugin</artifactId>
      <version>3.4.0</version>
      <configuration>
        <failOnMissingWebXml>false</failOnMissingWebXml>
      </configuration>
    </plugin>
  </plugins>
</build>

🔒 Session & Cache Handling

Each protected JSP includes:

response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
response.setHeader("Expires", "0");
if (session.getAttribute("name") == null) {
    response.sendRedirect("index.jsp");
}


This ensures users cannot return to protected pages after logging out.

👨‍💻 Author

Tejeshwar Sai Kadam
📧 Email: kadamtejesh07@gmail.com
]
🌐 GitHub: https://github.com/kadam-tejesh
