# Task Manager API

## Rol en el portafolio
Este es tu proyecto base de backend Java con Spring Boot. Debe demostrar que ya entiendes CRUD, capas, persistencia, validaciones y respuestas HTTP.

## Lo que ya esta listo
- `pom.xml` con Spring Boot, JPA, Validation, H2 y pruebas.
- Aplicacion principal lista para arrancar.
- Endpoint `/api/health` para validar que el proyecto levanta.
- Entidades `User` y `Task`.
- DTOs base para request y response.
- Repositorios JPA.
- Interfases de servicio.
- Manejo global de errores y validaciones.
- Pruebas minimas de contexto y health check.

## Lo que te toca implementar
- `UserController`
- `TaskController`
- Implementaciones de `UserService` y `TaskService`
- Mapeo entre entidades y DTOs
- Reglas de negocio completas
- CRUD real y pruebas de casos funcionales

## Comandos utiles
- `mvn spring-boot:run`
- `mvn test`

## Nota
El esqueleto esta pensado para ayudarte a empezar sin regalarte la solucion del proyecto.

