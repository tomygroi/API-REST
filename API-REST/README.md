# API REST - Gestión de Productos

API REST desarrollada con **Spring Boot**, **Spring Data JPA** y **MySQL** siguiendo una arquitectura por capas y aplicando el patrón DTO para la transferencia de datos.

---

## 🛠️ Tecnologías Utilizadas

* **Java 21**
* **Spring Boot 3.x / 4.x**
* **Spring Web**
* **Spring Data JPA**
* **Jakarta Validation**
* **MySQL**
* **Maven**

---

## 📂 Arquitectura del Proyecto

El proyecto está organizado en una arquitectura por capas para garantizar la separación de responsabilidades:

```text
src/main/java/net/laboratorioderedes/product/
├── controller/         # Exposición de endpoints REST y manejo de excepciones
├── dto/                # Objetos de transferencia de datos (Request y Response)
├── entity/             # Modelo persistente JPA
├── repository/         # Interfaz para acceso a base de datos (JpaRepository)
├── service/            # Lógica de negocio
│   └── impl/           # Implementación de servicios
└── ApiProductApplication.java
