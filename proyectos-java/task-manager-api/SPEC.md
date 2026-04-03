# Especificacion de Task Manager API

## Entidades sugeridas
### User
- id
- name
- email

### Task
- id
- title
- description
- status
- dueDate
- userId

## Endpoints minimos sugeridos
- `POST /api/users`
- `GET /api/users`
- `GET /api/users/{id}`
- `POST /api/tasks`
- `GET /api/tasks`
- `GET /api/tasks/{id}`
- `PUT /api/tasks/{id}`
- `DELETE /api/tasks/{id}`
- `GET /api/users/{id}/tasks`

## Reglas de negocio minimas
- No permitir tarea sin titulo.
- Validar email basico en usuario.
- No devolver 200 cuando el recurso no existe.
- El estado de tarea debe ser controlado por enum o lista limitada.

## Entregables
- Codigo.
- README.
- Coleccion Postman o ejemplos HTTP.
- Pruebas minimas de servicio o controlador.

