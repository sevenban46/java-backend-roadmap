# Comandos Git Sugeridos

## Flujo basico recomendado
- `git status`
- `git add .`
- `git commit -m "descripcion corta del avance"`
- `git log --oneline`

## Flujo con ramas
- `git checkout -b feature/nombre-del-cambio`
- `git add .`
- `git commit -m "agrega ejercicio de factorial"`
- `git checkout main`
- `git merge feature/nombre-del-cambio`

## Regla practica
Haz commits pequenos y con mensajes que expliquen lo que cambiaste.
