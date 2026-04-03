# Guia de Commits Semanales

## Objetivo
Hacer commits pequenos, claros y frecuentes para que tu historial muestre progreso real.

## Regla base
Haz commit cuando cierres una unidad pequena de trabajo, no cuando termines una semana entera.

## Frecuencia recomendada
- 1 commit por cada 1 a 3 ejercicios terminados
- 1 commit cuando corrijas errores importantes
- 1 commit cuando mejores nombres, mensajes o estructura
- 1 commit al cerrar un bloque semanal

## Estructura recomendada del mensaje
Usa verbos en presente:
- `agrega ejercicio de calculadora basica`
- `corrige validacion de division por cero`
- `prepara base de semana 2`
- `agrega test de calculadora util`

## Ejemplos por semana
### Semana 1
- `agrega ejercicios de fundamentos semana 1`
- `corrige logica de numero par e impar`
- `mejora mensajes de calculadora basica`

### Semana 2
- `agrega tabla de multiplicar y suma de N`
- `resuelve contador de vocales`
- `agrega factorial con metodo`

### Semana 3
- `crea clase producto con encapsulacion`
- `agrega metodos de cuenta bancaria`
- `arma mini sistema de consola con objetos`

### Semana 4
- `agrega interfaz pagable y jerarquia de empleados`
- `crea composicion biblioteca y libro`

### Semana 5
- `agrega agenda con arraylist`
- `implementa inventario con hashmap`

### Semana 6
- `agrega lectura y escritura de archivos`
- `crea excepcion personalizada para datos invalidos`

### Semana 7
- `agrega pruebas unitarias de calculadora util`
- `mejora pom y flujo de git`

### Semana 8
- `agrega script de creacion de tablas`
- `agrega inserts y consultas join`

## Antes de cada commit
1. Ejecuta `git status`
2. Revisa que no haya archivos generados ni privados
3. Asegurate de entender todo lo que subiras
4. Si puedes, compila o prueba antes del commit

## Flujo corto recomendado
```powershell
 git status
 git add ruta-o-archivo
 git commit -m "mensaje claro"
```

## Flujo semanal recomendado
```powershell
 git status
 git add ejercicios-java
 git add seguimiento
 git commit -m "cierra avances de semana X"
```

## Lo que debes evitar
- commits con mensaje `update`
- commits gigantes con 20 cambios distintos
- subir archivos generados
- esperar hasta el final del mes para guardar avances
