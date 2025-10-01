# MÓDULO DE GESTIÓN DE CLIENTES/TUTORES (CLÍNICA VETERINARIA)

## 📌 Visión General del Proyecto

Este proyecto es un módulo de gestión de clientes (referidos como "Tutores") desarrollado como una API RESTful con **Spring Boot**. El objetivo es implementar la funcionalidad básica de la base de datos (**CRUD**) en una arquitectura limpia de tres capas.

---

## 🏗️ Arquitectura y Tecnologías

El módulo se basa en el patrón de **Arquitectura de Capas** y utiliza las siguientes herramientas:

| Tecnología | Propósito |
| :--- | :--- |
| **Spring Boot 2.7.x** | Framework principal para la creación de la API. |
| **Maven** | Gestor de dependencias para la compilación y ejecución. |
| **Spring Data JPA** | Capa de persistencia para el acceso a la base de datos (CRUD). |
| **Lombok** | Herramienta para reducir código repetitivo (Getters/Setters). |
| **H2 Database** | Base de datos relacional en memoria (para desarrollo). |
| **Java 17** | Lenguaje de programación. |

---

## 📂 Estructura del Proyecto

El código está organizado en el paquete principal `com.clinica.web`, siguiendo la convención de Spring Boot y Maven:---

## 📂 Estructura del Proyecto

El código está organizado en el paquete principal `com.clinica.web`, siguiendo la convención de Spring Boot y Maven:

modulo-clientes-web-spring/
├── src/main/java/com/clinica/web/
│   ├── controller/               # Capa API: Expone los endpoints REST.
│   │   └── TutorController.java
│   ├── model/                    # Capa Modelo: Entidad JPA (Tutor.java).
│   │   └── Tutor.java
│   ├── repository/               # Capa de Acceso a Datos: Interfaz para el CRUD.
│   │   └── TutorRepository.java
│   └── ModuloClientesWebSpringApplication.java # Clase principal de arranque.
├── src/main/resources/
│   └── application.properties    # Configuración de la BBDD H2.
├── pom.xml                       # Archivo de configuración de Maven.
└── README.md                     # Documentación del proyecto.


---

## 🚀 Puesta en Marcha (Ejecución)

Para arrancar el servidor de la aplicación, asegúrate de estar en la carpeta raíz (`modulo-clientes-web-spring`) y ejecuta el siguiente comando en tu terminal:

```bash
mvn spring-boot:run
El servidor iniciará en el puerto 8080.

🌐 Endpoints de la API REST (CRUD)
El módulo implementa el CRUD completo para la gestión de clientes/tutores en la siguiente URL base: http://localhost:8080/api/tutores

Método HTTP	Endpoint	Descripción
POST	/api/tutores	CREATE: Crea un nuevo cliente/tutor.
GET	/api/tutores	READ: Recupera la lista completa de todos los clientes.
DELETE	/api/tutores/{id}	DELETE: Elimina un cliente específico por su ID.

Exportar a Hojas de cálculo
👥 Colaboradores y Autores
Este proyecto fue desarrollado por el siguiente equipo:

CLAUDIA RAMIREZ

SANTIAGO ALZATE

PAULA ROZO

---

## 🔗 Enlace al Repositorio

El código fuente completo de este módulo de gestión de clientes se encuentra alojado en:

[https://github.com/clau1967/modulo-clientes-web-spring](https://github.com/clau1967/modulo-clientes-web-spring)