-- Semana 8 - Paso 1
-- TODO: ajustar nombres y tipos si eliges otro dominio.

CREATE TABLE users (
    id BIGINT PRIMARY KEY,
    name VARCHAR(80) NOT NULL,
    email VARCHAR(120) NOT NULL UNIQUE
);

CREATE TABLE tasks (
    id BIGINT PRIMARY KEY,
    title VARCHAR(120) NOT NULL,
    status VARCHAR(30) NOT NULL,
    due_date DATE,
    user_id BIGINT NOT NULL,
    CONSTRAINT fk_tasks_users FOREIGN KEY (user_id) REFERENCES users(id)
);
