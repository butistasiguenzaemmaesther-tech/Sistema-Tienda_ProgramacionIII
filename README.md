## 📚 Laboratorio 2

**Herencia, Clases Abstractas, Polimorfismo e Interfaces**

### 👥 Integrantes

- Integrante 1 — Pendiente
- **Karina Lizeth Flores Rodríguez** — FR-68440-25
- **Kevin Josué Vilanueva León** — VL-68652-25
- **Andy Humberto Carrillo Santos** - CS-69933-25
- **Emma Esther Bautista Sigüenza** — BS-68546-25
---

## 🛍️ Descripción del proyecto

Sistema de tienda desarrollado en **Java**, que permite representar productos, clientes, carrito de compras, pedidos y facturas.

Para este Laboratorio 2 se amplió el proyecto del Laboratorio 1 aplicando conceptos de Programación Orientada a Objetos:

- Herencia
- Clases abstractas
- Polimorfismo
- Sobrecarga y sobrescritura
- Interfaces

### -  Herencia y abstracción

`Producto` es una clase abstracta de la cual heredan:

- `ProductoElectronico`
- `ProductoAccesorio`

La clase `Producto` contiene métodos concretos y el método abstracto `mostrarTipo()`.

### -  Polimorfismo

Se utilizan referencias de tipo `Producto` y `Vendible` para demostrar el comportamiento dinámico de los objetos.

### - Sobrecarga y sobrescritura

El método `mostrarProducto()` cuenta con diferentes versiones según sus parámetros.

Las subclases sobrescriben:

- `mostrarTipo()`
- `calcularPrecioFinal()`

### -  Interfaz

La interfaz `Vendible` es implementada por `ProductoElectronico` y `ProductoAccesorio`.

---

## -  Estructura

```text
src/
├── main/
│   └── Main.java
└── modelo/
    ├── carrito.java
    ├── Cliente.java
    ├── Factura.java
    ├── Pedido.java
    ├── Producto.java
    ├── ProductoElectronico.java
    ├── ProductoAccesorio.java
    ├── Tienda.java
    └── Vendible.java

```

---

## - Tecnologías

- **Java:** JDK 21
- **IDE:** IntelliJ IDEA
- **Control de versiones:** Git y GitHub

### -  Ejecución

La clase principal es:

```text
src/main/Main.java

```

Ejecutar el método `main()` para iniciar la demostración del sistema.

---

## - Uso de IA

Se utilizó Inteligencia Artificial como herramienta de apoyo para comprender conceptos, revisar código, detectar errores y mejorar la organización del proyecto.

Las sugerencias fueron revisadas, comprendidas y probadas antes de incorporarlas al proyecto.

---

## -  Participación

Los porcentajes de participación serán actualizados cuando se defina la distribución final del equipo.

| Integrante                    | DISTRIBUCION                            | Participación   |   
| ----------------------------- | --------------------------------------- |---------------- | 
| Emma Esther Bautista Sigüenza | clase abstracta - producto              |  100%           | 
| Karina Lizeth Flores Rodriguez| Herencia - subclases                    |  100%           | 
| Marvin Ernesto Perez Menjivar | Interfaces - vendible                   |  100%           | 
| Kevin Josué Villanueva León   | polimorfismo - sobrecarga/sobrescritura |  100%           | 
| Andy Humberto Carrillo Santos | Integracion - Main mas demostracion     |  100%           | 
---

**Programación III — UPED**
**Laboratorio 2 — 2026**

