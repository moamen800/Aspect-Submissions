# 🧪 Lab 4 – Redis Integration in Spring Boot
_CSE434 - Aspect- and Service-Oriented Software Systems_

---

## 📂 Project Overview

This Spring Boot project demonstrates the integration of **Redis caching**, **distributed locking**, and **rate limiting** using Spring and Redis.

---

## 🔧 Features Implemented

### ✅ 1. Room List with Redis Caching
- **First request:** Triggers a DB query → result cached in Redis.
- **Subsequent requests:** Served directly from Redis (💡 _Cache hit_).

### ✅ 2. Rate Limiting
- Implemented logic to block users after **4 requests in 10 seconds**.
- Uses a counter mechanism with Redis expiry for rate enforcement.

### ✅ 3. Distributed Locking
- Prevents concurrent access to sensitive methods.
- When one request holds the lock (10s timeout), others are blocked.

---

## 🧪 Demo Snapshots (Postman)

### 🔁 Redis Caching
- First Request → DB fetch
- Next Requests → Cached response
  > _Log: `Cache hit – returning rooms from Redis`_

### 🚫 Rate Limiting
- Allows 4 requests within 10 seconds.
- 5th request triggers **429 Too Many Requests**.

### 🔐 Redis Locking
- First request enters critical section.
- Second request blocked until the lock is released or expires.

---

## 🧰 Technologies Used
- Java 23 with Spring Boot 3.3.10
- Redis (via Docker Compose)
- Spring Data JPA + MySQL
- Spring Cache / RedisTemplate
- Postman for API Testing

---

## 📦 Running the Project

### Prerequisites:
- Docker & Docker Compose
- Java 17+ (JDK 23 in this setup)
- Maven

### Run Redis & MySQL:
```bash
docker-compose up -d
```

---

## 👨‍💻 Contact
- **Name:** Moamen Ahmed Ali
- **Email:** [moamenahmed800@gmail.com](mailto:moamenahmed800@gmail.com)
