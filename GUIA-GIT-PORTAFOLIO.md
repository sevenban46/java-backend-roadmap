# Guia Git para tu Portafolio

## Objetivo
Usar este workspace como base de estudio local, pero dejar el repo raiz listo para subir solo lo que aporta a tu portafolio publico.

## Este repo publico debe incluir
- `README.md`
- `ejercicios-java/`
- `proyectos-java/`
- `seguimiento/`
- `.gitignore`
- `GUIA-GIT-PORTAFOLIO.md`

## Este repo publico NO debe incluir
- `aplicaciones-laborales/`
- `setup/`
- `.m2/`
- `target/`
- `.idea/`
- `.vscode/`
- archivos `.class`
- logs, temporales y binarios

## Por que se excluyen esas carpetas
- `aplicaciones-laborales/`: puede contener CV final, notas privadas y seguimiento de vacantes.
- `setup/`: contiene configuracion local y archivos de apoyo para esta maquina.
- `.m2/`, `target/`, `.class`: son archivos generados automaticamente.

## Si quieres separar publico y privado
### Repo publico
Usa este repo raiz para mostrar aprendizaje y portafolio:
- `README.md`
- `ejercicios-java/`
- `proyectos-java/`
- `seguimiento/`

### Repo privado o carpeta solo local
Maneja aparte:
- `aplicaciones-laborales/`
- `setup/`

## Comandos recomendados para subir solo lo correcto
```powershell
git status
git add .gitignore README.md GUIA-GIT-PORTAFOLIO.md
git add ejercicios-java proyectos-java seguimiento
git status
git commit -m "Organiza ejercicios y portafolio Java"
```

## Que revisar antes de cada commit
1. Que no aparezcan `.class`, `target`, `.m2`, `.idea` o `aplicaciones-laborales`.
2. Que el commit tenga codigo fuente, README o seguimiento real.
3. Que puedas explicar todo lo que vas a subir.

## Regla practica
Si un archivo lo escribiste tu y ayuda a entender tu progreso, normalmente si se sube.
Si un archivo lo genero la maquina, expone datos privados o solo sirve en tu PC, normalmente no se sube.
