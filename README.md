# JWT Authentication System - Spring Boot

## Overview

This project is a JWT (JSON Web Token) Authentication System built using Spring Boot, Spring Security, MySQL, and JPA.
It supports user registration, login, JWT token generation, token validation, and protected CRUD APIs.

⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻

## Technologies Used
	•	Java
	•	Spring Boot
	•	Spring Security
	•	JWT (JSON Web Token)
	•	MySQL
	•	JPA / Hibernate
	•	Maven
	•	Postman
	•	Git & GitHub

⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻

## Features
	•	User Registration
	•	User Login
	•	JWT Token Generation
	•	JWT Token Validation
	•	Protected APIs
	•	User CRUD Operations
	•	Stateless Authentication
	•	Spring Security Filter Chain

⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻

## API Endpoints

| Method | Endpoint | Description |
|-------|----------|-------------|
| POST | /api/register | Register new user |
| POST | /api/login | Login and get JWT token |
| GET | /api/hello | Validate JWT token |
| GET | /api/users | Get all users |
|POST | /api/users | Create user |
|PUT | /api/users/{id} | Update user |
|DELETE | /api/users/{id} | Delete user |

⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻

## Authentication Flow
	1.	User registers using /api/register
	2.	User logs in using /api/login
	3.	Server generates JWT token
	4.	Client sends token in Authorization header
	5.	JWT Filter validates token
	6.	If valid → Access protected APIs

### Authorization header format:
     Authorization: Bearer <JWT_TOKEN>

⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻

## Screenshots:
### 📍 Register User
<img width="713" height="645" alt="register" src="https://github.com/user-attachments/assets/7bcfd045-56ae-4396-b7d3-e10247dc0c0f" />

### 📍 Login User
<img width="707" height="645" alt="login" src="https://github.com/user-attachments/assets/2142a7af-04e2-4110-b492-a75bf940b913" />

### 📍 Validate Token
<img width="707" height="645" alt="validate" src="https://github.com/user-attachments/assets/894ce447-9522-438b-a468-37c27d786554" />

### 📍 Get Users
<img width="652" height="645" alt="getuser" src="https://github.com/user-attachments/assets/c80c2ac6-efb6-433b-84d2-e5efff775dc7" />

### 📍 Create User
<img width="652" height="645" alt="createuser" src="https://github.com/user-attachments/assets/94752bf7-a33c-4ca1-bf10-143e5ba35c72" />

### 📍 Update User
<img width="652" height="645" alt="updateuser" src="https://github.com/user-attachments/assets/4208bf54-c42e-4f70-a494-450c1eb00938" />

### 📍 Delete User
<img width="652" height="645" alt="deleteuser" src="https://github.com/user-attachments/assets/76847b53-d974-45ab-a2ba-1b748dfbe10f" />

### 📍 Maven Build
<img width="913" height="217" alt="mavenbuild" src="https://github.com/user-attachments/assets/bdc2f940-d7be-431a-9c6f-6e41d59b267c" />




⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻

## How to Run Project
	1.	Clone repository
	2.	Open in Eclipse / IntelliJ
	3.	Configure MySQL in application.properties
	4.	Run Spring Boot Application
	5.	Test APIs using Postman

⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻⸻

## Author

Anshika Sinha




























