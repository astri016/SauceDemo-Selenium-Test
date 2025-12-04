# 🚀 SauceDemo Selenium Automation (Java + TestNG + Maven)

Project ini adalah **projek mandiri** untuk automation testing pada website **[SauceDemo](https://www.saucedemo.com/)** menggunakan **Selenium WebDriver (Java)**.
Test yang dibuat mencakup berbagai skenario penting: login, cart operations, checkout, sorting, dan end-to-end flow.

Seluruh test dijalankan menggunakan **TestNG** dan struktur project mengikuti konsep **Page Object Model (POM)**.

---

## 📌 Tech Stack

* **Java 17**
* **Selenium WebDriver 4**
* **TestNG**
* **Maven**
* **Page Object Model (POM)**
* **ChromeDriver**
* **DataProvider (Multi User Testing)**

---

## 🗂 Project Structure

```
SauceDemo-Selenium-Test/
├── .idea/
├── src/
│   ├── main/
│   │   └── java/
│   │       ├── pages/
│   │       │   ├── CartPage.java
│   │       │   ├── CheckoutPage.java
│   │       │   ├── InventoryPage.java
│   │       │   ├── LoginPage.java
│   │       │   └── SortingPage.java
│   │       └── utils/
│   │           └── WaitUtils.java
│   └── test/
│       └── java/
│           ├── base/
│           │   └── BaseTest.java
│           ├── data/
│           │   └── UserData.java
│           └── tests/
│               ├── AddToCartTest.java
│               ├── CartViewTest.java
│               ├── CheckoutFinishTest.java
│               ├── CheckoutInfoTest.java
│               ├── LoginTest.java
│               ├── RemoveItemTest.java
│               ├── SortAZTest.java
│               ├── SortHighLowTest.java
│               ├── SortLowHighTest.java
│               └── SortZATest.java
├── resources/
│   └── testng.xml
├── .gitignore
├── pom.xml
└── Test Results - D__1-Selenium_Project_Selenium_opencart-selenium-automation_src_test_resources_testng_xml.html
```

---

## 🧪 Automated Test Coverage

### ✔ Login Tests

* Login dengan beberapa user:

  * `standard_user`
  * `problem_user`
  * `performance_glitch_user`
  * `error_user`
  * `visual_user`

### ✔ Inventory Tests

* Add to cart
* Remove from cart
* View cart

### ✔ Checkout Tests

* Input user information
* Checkout overview page
* Complete order

### ✔ Sorting Tests

* Sort A-Z
* Sort Z-A
* Sort Price Low-High
* Sort Price High-Low

---

## 🔁 Run the Tests

### **Via IntelliJ**

1. Klik kanan `testng.xml`
2. Pilih **Run 'testng.xml'**

### **Via Terminal**

```
mvn clean test
```

---

## 📊 Test Report

berikut hasil dari pengujian menggunakan selenium webdriver

* **HTML Report:** [Buka di sini](https://github.com/astri016/SauceDemo-Selenium-Test/blob/master/Test%20Results%20-%20D__1-Selenium_Project_Selenium_opencart-selenium-automation_src_test_resources_testng_xml.html)
* **PDF Report:** [Buka di sini](https://github.com/astri016/SauceDemo-Selenium-Test/blob/master/SauceDemo_TestReport_Run1_2025-12-04.pdf)

---

## 📎 Manual & Cypress Automation (Repo Lain)

Versi lain project:

* **Manual Testing**
* **Automation Cypress**

Link lengkap:
👉 [https://github.com/astri016/Saucedemo-QA-Automation-Manual](https://github.com/astri016/Saucedemo-QA-Automation-Manual)

---

# 🌸👩🏻‍💻 **Author**

**Astri Yuliana Siahaan**
- QA enthusiast

✨ *Project pribadi ini masih dalam tahap pengembangan. Mohon dimaklumi jika ada kekurangan, dan saya sangat terbuka untuk masukan, saran, maupun kolaborasi.*

---
