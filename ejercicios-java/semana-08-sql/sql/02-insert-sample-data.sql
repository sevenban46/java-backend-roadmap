-- Semana 8 - Paso 2
-- TODO: insertar datos de prueba propios.

INSERT INTO users (id, name, email)
VALUES (1, 'Ana', 'ana@example.com');

INSERT INTO users (id, name, email)
VALUES (2, 'Luis', 'luis@example.com');

INSERT INTO tasks (id, title, status, due_date, user_id)
VALUES (1, 'Terminar CRUD', 'IN_PROGRESS', '2026-04-10', 1);

INSERT INTO tasks (id, title, status, due_date, user_id)
VALUES (2, 'Preparar README', 'TODO', '2026-04-12', 2);
