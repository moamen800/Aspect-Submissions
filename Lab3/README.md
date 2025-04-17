# Lab 3 - Event Management System

### 📚 CSE434 - Aspect- and Service-Oriented Software Systems

---

## 🔧 Project Overview

This lab implements a RESTful Event Management System using **Spring Boot** as the backend framework, integrated with a **MySQL** database running in a Docker container. API operations were tested using **Postman**, and data relationships are visually validated via **phpMyAdmin**.

The system demonstrates **aspect-oriented design principles** in a service-oriented architecture context, with a focus on entity relationships, database design, and real-world API operations such as user RSVP and event hosting.

---

## 🚀 Core Features

- ✅ **Create an Event** – Host a new event with title, description, date, location, etc.
- 📄 **Retrieve All Events** – View all events stored in the database.
- 🔍 **Get Event by ID** – Fetch detailed data for a specific event using its unique ID.
- ✏️ **Update Event** – Modify event details like time, location, or description.
- ❌ **Delete Event** – Remove an event permanently from the database.
- 🙋 **RSVP to Event** – Allow users to join as attendees to specific events.
- 🐳 **Docker Integration** – MySQL database and phpMyAdmin are deployed via `docker-compose`.
- 🛠️ **Database Relationship Modeling** – One-to-many and many-to-many entity mappings using JPA annotations.

---

## 🧪 API Testing with Postman

All CRUD and RSVP operations were tested using Postman. Screenshots of each request and response are included in the submitted PDF report.

### 🔹 Endpoints Summary:

| Method | Endpoint                                  | Description                     |
|--------|-------------------------------------------|---------------------------------|
| POST   | `/api/events`                             | Create a new event              |
| GET    | `/api/events`                             | Get all events                  |
| GET    | `/api/events/{id}`                        | Get a specific event by ID      |
| PUT    | `/api/events/{id}`                        | Update event by ID              |
| DELETE | `/api/events/{id}`                        | Delete event by ID              |
| POST   | `/api/events/{eventId}/rsvp?userId={id}`  | RSVP a user to an event         |

---

### 🔸 Sample Create Event Request:
```http
POST http://localhost:8080/api/events
```
---

### 🔸 Sample Create Event Request:
```http
POST http://localhost:8080/api/events
```

---

### 🔸 Sample Get All Events Request:
```http
GET http://localhost:8080/api/events
```

---

### 🔸 Sample Get Event by ID:
```http
GET http://localhost:8080/api/events/2
```

---

### 🔸 Sample Update Event Request:
```http
PUT http://localhost:8080/api/events/2
```

---

### 🔸 Sample Delete Event Request:
```http
DELETE http://localhost:8080/api/events/2
```

---

### 🔸 Sample RSVP Request:
```http
POST http://localhost:8080/api/events/2/rsvp?userId=1
```
---



### 📬 Contact
**Name:** Moamen Ahmed Ali  
**Email:** moamenahmed800@gmail.com

---