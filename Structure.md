cybersecurity-monitoring/
├── backend/
│   ├── src/main/java/com/cysec/
│   │   ├── config/                      # cấu hình DB, scheduler, security
│   │   ├── controller/                  # REST API / Web Controller
│   │   ├── dto/                         # Data Transfer Objects
│   │   ├── exception/                   # custom exceptions
│   │   ├── model/                       # Entities
│   │   │   ├── User.java
│   │   │   ├── Role.java
│   │   │   ├── ServiceEntity.java
│   │   │   ├── Appointment.java
│   │   │   ├── ActivityLog.java
│   │   │   └── Feedback.java
│   │   ├── repository/                  # Spring Data JPA repository
│   │   │   ├── UserRepository.java
│   │   │   ├── ServiceEntityRepository.java
│   │   │   ├── AppointmentRepository.java
│   │   │   ├── ActivityLogRepository.java
│   │   │   └── FeedbackRepository.java
│   │   ├── security/                    # Spring Security: auth & roles
│   │   ├── service/                     # Business logic
│   │   └── CyberSecApplication.java     # Spring Boot main entry point
│   │
│   ├── src/main/resources/
│   │   ├── application.properties
│   │   ├── templates/
│   │   └── static/
│   │
│   ├── target/                          # Maven build output
│   ├── pom.xml                          # Java 21, Spring Boot 3.3.2
│   └── docker-compose.yml
│
├── frontend_ad/                         # Admin Dashboard
│   ├── src/
│   ├── public/
│   ├── package.json
│   └── (build config)
│
├── frontend-user/                       # User Interface
│   ├── src/
│   ├── public/
│   ├── package.json
│   └── (build config)
│
├── .vscode/
├── .git/
├── README.md
├── Structure.md
├── workflow.md
└── .gitignore

## Build & Deployment

- **Backend**: Maven (Java 21, Spring Boot 3.3.2)
- **Build Command**: `mvnd -DskipTests clean package`
- **Main Class**: `com.cysec.CyberSecApplication`
- **Output JAR**: `backend/target/cybersecurity-monitoring-0.0.1-SNAPSHOT.jar`

## Package Structure

All Java sources follow: `com.cysec.*`
