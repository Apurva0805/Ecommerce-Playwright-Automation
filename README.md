# 🧪 Ecommerce Automation Framework (Playwright + Java)

## 📌 Project Overview
This project is a UI test automation framework built for an e-commerce web application using Playwright with Java. It follows industry best practices like Page Object Model (POM), data-driven testing, and modular design.

---

## 🚀 Tech Stack
- Java
- Playwright
- TestNG
- Maven
- JSON (Test Data)
- Properties File (Config)

---

## 🏗 Framework Design
- Page Object Model (POM)
- Base Test Architecture
- Utility Classes for Reusability
- Config-driven setup
- Data-driven testing support

---

## 📂 Project Structure
## 📂 Project Structure

```text
E-Commerce-Playwright-Java-Framework
├── .mvn                        
├── allure-results              
├── src
│   ├── main/java               
│   │   └── com/utils
│   │       └── JsonReader.java 
│   └── test/java               
│       ├── base
│       │   └── BaseTest.java   
│       ├── pages               
│       │   ├── LoginPage.java
│       │   ├── ProductPage.java
│       │   ├── CartPage.java
│       │   └── CheckoutPage.java
│       ├── tests               
│       │   ├── LoginTest.java
│       │   ├── AddToCartTest.java
│       │   └── CheckoutTest.java
│       └── resources           
│           └── testdata.json   
├── .gitignore                  
├── pom.xml                     
└── README.md



---

## 🧪 Test Scenarios Covered
- Login Functionality
- Product Selection
- Add to Cart
- Checkout Flow (End-to-End)

---

## ⚙️ Features
- Page Object Model design
- External test data (JSON)
- Config file support
- Reusable utilities
- Clean separation of test layers

---

## ▶️ How to Run

### 1. Clone Repository

### 2. Run Tests

### 3. Run via TestNG XML

---

## 📊 Reporting

- Allure Reports supported

---

## 👨‍💻 Author
Automation Tester transitioning from Manual Testing (3+ years experience)