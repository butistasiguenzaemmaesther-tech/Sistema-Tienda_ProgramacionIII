# 🛒 Sistema de Tienda – Programación III

## 📚 Laboratorio III

**Excepciones, interfaz gráfica con Swing e hilos aplicados al proyecto incremental**

**Universidad:** Universidad Pedagógica de El Salvador
**Asignatura:** Programación III
**Código:** LG-016
**Docente:** Ing. Oscar Armando Contreras Álvarez
**Ciclo:** 02-2026

---

## 👥 Integrantes y coevaluación de participación

| N.º | Integrante                     | Carnet      | Responsabilidad                                | Participación |
| :-: | ------------------------------ | ----------- | ---------------------------------------------- | :-----------: |
|  1  | Marvin Ernesto Perez Menjivar  | PM-69065-25 | Manejo de errores (`try-catch-finally`)        |   **[100%]**   |
|  2  | Karina Lizeth Flores Rodríguez | FR-68440-25 | Excepciones personalizadas (`throw`, `throws`) |   **[100%]**   |
|  3  | Kevin Josué Vilanueva León     | VL-68652-25 | Interfaz gráfica (Swing)                       |   **[100%]**   |
|  4  | Emma Esther Bautista Sigüenza  | BS-68546-25 | Hilos (`Thread` o `Runnable`)                  |   **[100%]**   |
|  5  | Andy Humberto Carrillo Santos  | CS-69933-25 | Integración y pruebas del proyecto             |   **[100%]**   |

---

## 📝 Descripción del proyecto

El Sistema de Tienda es un proyecto desarrollado en Java que permite representar y gestionar las operaciones básicas de una tienda.

El sistema contempla elementos como productos, clientes, carrito de compras, pedidos y facturas.

Este proyecto se ha desarrollado de manera incremental durante los laboratorios de Programación III, incorporando los conocimientos adquiridos en cada etapa.

En el Laboratorio III se busca mejorar el funcionamiento del sistema mediante el manejo de excepciones, la implementación de una interfaz gráfica con Swing y la ejecución de tareas utilizando hilos.

## 🎯 Objetivo del Laboratorio III

Completar el proyecto incremental incorporando mecanismos para controlar errores, presentar el sistema mediante una interfaz gráfica y ejecutar al menos una tarea concurrente.

## ⚙️ Contenidos del Laboratorio III

### 1. Manejo de errores

Se trabaja con los mecanismos `try`, `catch` y `finally` para controlar situaciones inesperadas durante la ejecución del programa y evitar que termine abruptamente ante datos inválidos.

También se contempla el uso de excepciones `checked` y `unchecked`, así como el orden correcto de los bloques `catch`.

### 2. Excepciones personalizadas

Se incorporan excepciones propias del proyecto para controlar situaciones relacionadas con las reglas de negocio.

Se utilizan:

- `throw`: para lanzar excepciones cuando una condición no se cumple.
- `throws`: para declarar excepciones que pueden producirse en un método.
- Excepciones personalizadas `checked` y `unchecked`.
- `try-with-resources` para gestionar recursos que implementen `AutoCloseable`.

**Excepciones personalizadas del proyecto:**

- Excepción checked: [Agregar nombre y propósito].
- Excepción unchecked: [Agregar nombre y propósito].

### 3. Interfaz gráfica con Swing

Se desarrolla una interfaz gráfica utilizando Java Swing para facilitar la interacción del usuario con el sistema.

Entre los componentes contemplados se encuentran:

- `JFrame`
- `JLabel`
- `JTextField`
- `JButton`
- Layouts.
- `ActionListener`.
- `JOptionPane` para mostrar mensajes de error y advertencia.

### 4. Hilos

Se incorpora una tarea concurrente utilizando `Thread` o `Runnable`, aplicada a una operación del sistema.

El objetivo es ejecutar dicha tarea de forma concurrente y comprender la utilidad de los hilos dentro de la aplicación.

**Tarea implementada:** [Describir la tarea real que ejecuta el hilo].

## 🗂️ Estructura del proyecto

La organización debe reflejar los paquetes y las clases que realmente contiene el proyecto.

```text
Sistema-Tienda_ProgramacionIII/
│
├── src/
│   ├── main/
│   ├── modelo/
│   ├── excepciones/
│   ├── gui/
│   └── hilos/
│
├── .gitignore
└── README.md
```

*Nota: Actualizar esta estructura con los nombres reales de los paquetes y archivos del proyecto.*

## 💻 Tecnologías utilizadas

- **Lenguaje de programación:** Java.
- **JDK:** 21.
- **IDE:** IntelliJ IDEA.
- **Interfaz gráfica:** Java Swing.
- **Control de versiones:** Git.
- **Repositorio:** GitHub.

## ▶️ Instrucciones para ejecutar el proyecto

1. Instalar JDK 21.
2. Abrir IntelliJ IDEA.
3. Clonar o descargar el repositorio de GitHub.
4. Abrir el proyecto en IntelliJ IDEA.
5. Verificar que esté configurado el JDK 21.
6. Ubicar la clase principal del proyecto.
7. Ejecutar el método `main`.

**Clase principal:** [Agregar el nombre y paquete de la clase principal].

## 📸 Evidencias del proyecto

### Ventana principal del sistema

Agregar aquí una captura de pantalla de la interfaz gráfica principal desarrollada con Swing.



### Diálogo de excepción personalizada

Agregar aquí una captura de pantalla donde se muestre una excepción personalizada mediante `JOptionPane`.



## 🧪 Pruebas del sistema

Se deben realizar pruebas para comprobar el funcionamiento del sistema y el manejo de situaciones inválidas.

Entre las pruebas contempladas se encuentran:

- Ingreso de datos correctos.
- Ingreso de texto en campos que requieren valores numéricos.
- Validación de reglas de negocio.
- Activación de excepciones personalizadas.
- Visualización de mensajes mediante cuadros de diálogo.
- Comprobación de la tarea ejecutada mediante hilos.

## 🤖 Uso de herramientas de inteligencia artificial

Se utilizaron herramientas de inteligencia artificial como apoyo durante el desarrollo del proyecto.

Su uso estuvo orientado a:

- Comprender los conceptos de programación.
- Resolver dudas sobre excepciones, Swing e hilos.
- Revisar y mejorar fragmentos de código.
- Identificar posibles errores.
- Apoyar la documentación del proyecto.

Los resultados obtenidos fueron revisados y comprobados por los integrantes mediante la ejecución del programa y las pruebas correspondientes. Los ajustes necesarios se realizaron para adaptar el código a las necesidades del proyecto.

## 📌 Conclusión

El Laboratorio III permite fortalecer los conocimientos de programación en Java mediante la incorporación del manejo de excepciones, excepciones personalizadas, interfaces gráficas con Swing y programación concurrente utilizando hilos.

Además, permite continuar mejorando el Sistema de Tienda desarrollado durante los laboratorios anteriores, procurando mantener su funcionamiento y mejorar la interacción con el usuario.

---

**Universidad Pedagógica de El Salvador**
**Programación III – Ciclo 02-2026**

