-- Semana 8 - Paso 4
-- TODO: practicar al menos dos joins propios.

SELECT t.id, t.title, u.name AS user_name
FROM tasks t
INNER JOIN users u ON t.user_id = u.id;

SELECT u.name, t.title, t.status
FROM users u
LEFT JOIN tasks t ON u.id = t.user_id;
