This is a simple email service built with Spring Boot that allows sending emails programmatically.

Prerequisites
Java Development Kit (JDK) 11 or later
Apache Maven
SMTP server configuration (e.g., Gmail SMTP settings)

Setup
1. Clone the repository:
bash
Copy code
git clone <repository-url>
2 .Navigate to the project directory:
bash
Copy code
cd email-service
3. Open the application.properties file located in src/main/resources and configure the SMTP server settings:
properties
Copy code
spring.mail.host=smtp.example.com
spring.mail.port=587
spring.mail.username=your-email@example.com
spring.mail.password=your-email-password
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true

Replace smtp.example.com, your-email@example.com, and your-email-password with your SMTP server host, email address, and password respectively.
Usage
Sending Email
To send an email, you can use the /send endpoint with the following parameters:

to: Recipient email address
subject: Email subject
body: Email body
Example:

http
Copy code
POST /send
Content-Type: application/json

{
  "to": "recipient@example.com",
  "subject": "Test Email",
  "body": "This is a test email sent from the Email Service."
}
Running the Application
You can run the application using Maven:

bash
Copy code
mvn spring-boot:run
The application will start on port 8080 by default.

Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.
