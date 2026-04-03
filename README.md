# Plan de Carrera Java Backend sin IA

Este workspace convierte el plan de 16 semanas en un sistema de trabajo real para estudiar, practicar, construir portafolio y empezar a postular.

## Estructura
- `setup`: checklist del entorno, notas de configuracion y script de verificacion.
- `seguimiento`: roadmap de 16 semanas, trackers y checkpoints.
- `ejercicios-java`: guias semanales con ejercicios y criterios de salida.
- `proyectos-java`: especificaciones y checklists de los tres proyectos del portafolio.
- `aplicaciones-laborales`: CV, seguimiento de vacantes, perfil profesional y entrevista.

## Como usar este workspace
1. Revisa `setup/checklist-entorno.md` y corrige primero la version de Java.
2. Abre `seguimiento/plan-16-semanas.md` y ubica la semana actual.
3. Trabaja cada dia con apoyo de `seguimiento/diario-estudio-template.md`.
4. Completa la guia de la semana correspondiente dentro de `ejercicios-java`.
5. Cuando llegues a las semanas 9 a 16, usa `proyectos-java` para desarrollar tu portafolio.
6. Usa `aplicaciones-laborales` desde la semana 12 para preparar CV, LinkedIn y postulaciones.

## Reglas del sistema
- No avanzar de semana sin cumplir el checkpoint de salida.
- No subir codigo que no entiendas.
- No pasar mas de 3 dias seguidos consumiendo tutoriales sin escribir codigo propio.
- Hacer commits pequenos y frecuentes.
- Cada semana debe dejar evidencia en GitHub, notas y seguimiento.

Usa `setup\\verificar-entorno.cmd` como opcion simple en Windows, o `setup\\verificar-entorno.ps1` si permites scripts en PowerShell.

## Estado actual del entorno
Segun la verificacion inicial de esta maquina:
- `java -version` responde Java 8.
- `mvn -version` esta usando Java 24.
- `git` esta instalado.

Eso significa que la terminal y Maven no estan alineados. Antes de empezar con Maven o Spring Boot, corrige `JAVA_HOME` y el `PATH` para apuntar a una sola version estable. El plan recomienda `JDK 21`.

## Entregables que vas a construir aqui
- 1 repositorio de ejercicios Java.
- 3 proyectos de portafolio con README y pruebas.
- 1 CV de una pagina.
- 1 tablero de seguimiento.
- 1 tracker de postulaciones.
- 1 banco de preguntas de entrevista.

## Nota importante
Este workspace no te resuelve los ejercicios ni te escribe la logica de negocio de los proyectos. La idea es quitar friccion, darte estructura y dejarte listo para aprender de verdad sin depender de soluciones generadas.

