# Orden de Implementacion Recomendado

1. Crear implementacion de `UserService`.
2. Crear `UserController` con `POST`, `GET all` y `GET by id`.
3. Crear implementacion de `TaskService`.
4. Crear `TaskController` con CRUD y consulta por usuario.
5. Agregar mapeadores o metodos privados para convertir entidad a DTO.
6. Escribir pruebas de servicio.
7. Escribir pruebas de controlador.
8. Reemplazar H2 por PostgreSQL o MySQL cuando ya todo funcione.

