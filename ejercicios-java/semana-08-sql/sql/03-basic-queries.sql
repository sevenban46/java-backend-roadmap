-- Semana 8 - Paso 3
-- TODO: completar y adaptar estas consultas.

SELECT *
FROM users;

SELECT *
FROM tasks;

SELECT title, status
FROM tasks
WHERE status = 'TODO';

UPDATE tasks
SET status = 'DONE'
WHERE id = 2;

DELETE FROM tasks
WHERE id = 999;
