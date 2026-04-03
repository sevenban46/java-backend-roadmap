# Especificacion de Inventory System

## Entidades sugeridas
### Product
- id
- name
- sku
- category
- stock
- price

### InventoryMovement
- id
- productId
- type
- quantity
- movementDate
- note

## Capacidades minimas
- Crear y editar productos.
- Registrar entrada y salida de stock.
- Consultar historial de movimientos.
- Filtrar productos por categoria o stock bajo.
- Evitar stock negativo.

## Entregables
- API funcional.
- README con reglas del negocio.
- Pruebas para movimientos y validaciones.
