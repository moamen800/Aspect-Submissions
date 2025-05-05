
# 📝 Lab 5 – Aspect- and Service-Oriented Software Systems  
_CSE434 – Aspect- and Service-Oriented Software Systems_

---

## 📂 Project Overview  

A Spring Boot service demonstrating **aspect-oriented authentication**, including user registration, login/logout, and protected vs. public endpoints.

---

## 🔧 Features Implemented  

### ✅ 1. User Registration (`/register`)

* **Request:**  
    ```json
      { "username": "...", "password": "..." }
    ````

* **Behavior:**

    * **Success:** Creates a new user.
    * **Failure:** 400 if username already exists.

---

### ✅ 2. User Login (`/login`)

* **Request:**

    ```json
      { "username": "...", "password": "..." }
     ```
* **Behavior:**

    * **Success:** 200 + HTTP session cookie.
    * **Failure:** 401 for invalid credentials.

---

### ✅ 3. Logout (`/logout`)

* **Behavior:** Invalidates the current session.

---

### ✅ 4. Public Endpoint (`/public`)

* **Access:** No authentication required.
* **Response:** 200 OK.

---

### ✅ 5. Protected Endpoint (`/protected`)

* **Access:** Requires a valid session (aspect enforces).
* **Response:**

    * 200 OK if logged in.
    * 401 Unauthorized otherwise.

---

## 📡 API Endpoints

| Method | Path         | Request Body                               | Description                                      |
| ------ | ------------ | ------------------------------------------ | ------------------------------------------------ |
| POST   | `/register`  | `{ "username": "...", "password": "..." }` | Create a new user                                |
| POST   | `/login`     | `{ "username": "...", "password": "..." }` | Authenticate and start a session                 |
| GET    | `/logout`    | –                                          | Invalidate the current session                   |
| GET    | `/public`    | –                                          | Publicly accessible endpoint                     |
| GET    | `/protected` | – (requires valid session)                 | Protected endpoint that triggers the auth aspect |

---

## 🧪 Demo Snapshots (Postman)

### 🔓 Registration & Login

* **Register New User** → `201 Created`
* **Register Existing User** → `400 Bad Request`
* **Login Valid Credentials** → `200 OK` + cookie
* **Login Invalid Credentials** → `401 Unauthorized`

---

### 🌐 Public vs Protected

* **GET /public** → `200 OK`
* **GET /protected** →

    * `200 OK` when authenticated
    * `401 Unauthorized` when not

---

## 🧰 Technologies Used

* **Java 11+ & Spring Boot**
* **AspectJ** for AOP-based security
* **Spring Data JPA** + H2 (or MySQL)
* **Maven** for build & dependencies
* **Postman** for API testing

---

## 🚀 Running the Project

### Prerequisites

* Java 11 or higher
* Maven 3.6+
* Docker (optional, if you switch to MySQL via Docker)

### Steps

```bash

git clone https://github.com/moamen800/Aspect-Submissions.git
cd Aspect-Submissions/Lab5

mvn clean package
mvn spring-boot:run
```

*Service will start on* `http://localhost:8088`

---

## 👨‍💻 Contact

- **Name:** Moamen Ahmed Ali
- **Email:** [moamenahmed800@gmail.com](mailto:moamenahmed800@gmail.com)
