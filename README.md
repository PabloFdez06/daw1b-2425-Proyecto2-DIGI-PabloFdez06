# Proyecto: Gestor de Tareas Interactivo

## Descripción

Este proyecto es un **gestor de tareas** simple pero efectivo que permite a los usuarios **añadir, listar y eliminar tareas** desde la línea de comandos. Su propósito es facilitar la organización personal y la productividad mediante una interfaz intuitiva y de fácil uso.

## Características

✅ **Añadir tareas** con una descripción personalizada.  
✅ **Listar tareas pendientes** con su identificador único.  
✅ **Eliminar tareas** por su ID.  
✅ **Persistencia de datos** en memoria (con posibilidad de expansión a bases de datos).  
✅ **Interfaz de línea de comandos (CLI)** sencilla y eficiente.

## Uso

Cuando ejecutas el script, se mostrará un menú con opciones para gestionar las tareas:

- **LOGIN** | USUARIO: `admin` CONTRASEÑA `password123`

- **1. Agregar tarea** → Introduce la descripción de la tarea.
- **2. Listar tareas** → Muestra todas las tareas pendientes con sus IDs.
- **3. Eliminar tarea** → Introduce el ID de la tarea que quieres eliminar.
- **4. Salir** → Termina la ejecución del programa.

## Posibles mejoras futuras

🚀 **Persistencia de datos** en bases de datos como SQLite o Firebase.  
🔒 **Autenticación de usuarios** para gestionar tareas personales.  
☁️ **Sincronización en la nube** para acceso multiplataforma.  
📱 **Versión web y móvil** con una interfaz gráfica amigable.


**Respuestas a preguntas del Proyecto**  
[Preguntas](Preguntas.md)


# FASE 3 DEL PROYECTO

#### Fase 1

## Digital Task Management System

A lightweight, console-based task management application built in Kotlin, designed to support digital transformation in small to medium-sized enterprises by streamlining task planning, execution, and prioritization.

### 🚀 Motivation

Digital transformation requires efficient tools to manage day-to-day operations. This project was created as a simple, yet practical solution to:
- Encourage the adoption of digital workflows in traditional business environments.
- Serve as a foundation for integrating digital task tracking into business operations.
- Showcase the potential of Kotlin in enterprise utility tools.
- Enable clear, documented, and secure collaboration through open-source software.

### 🔧 Features

- Secure login system (username and password).
- Add tasks with title, description, due date, and priority.
- View tasks sorted by priority.
- Mark tasks as completed.
- Data managed in-memory (mocked cloud storage via lists and UUIDs).

### 📦 Technologies

- **Language**: Kotlin
- **Runtime**: JVM
- **Build tool**: N/A (simple CLI app; can be compiled and run with Kotlin CLI or IntelliJ)

---

### 🖥️ Demo

[A simple web live version](https://717df0d5-865d-411d-8816-fd7df8d3a024-00-3ekw8zz1a1agf.kirk.replit.dev/)

---

### 🧪 Examples of use

```plaintext
Welcome to the Digital Task Manager!
Enter username: admin
Enter password: password123

Menu:
1. Add Task
2. View Tasks
3. Complete Task
4. Exit

> Select option: 1
Enter title: Prepare report
Enter description: Monthly finance report
Enter due date: 2025-06-01
Enter priority (1-5): 2
Task added: Prepare report
```

### DOCUMENTACIÓN GENERADA | HTML


### CONTRIBUTING
[Contributing](CONTRIBUTING.md)

### 🛠️ Installation and Usage

#### Requirements
- Java JDK 8+
- Kotlin installed, or using IntelliJ Idea

### Run locally

```bash
# Compile
kotlinc Main.kt -include-runtime -d taskmanager.jar

# Execute
java -jar taskmanager.jar
```
Or run via IntelliJ IDEA by creating a Kotlin project and pasting the code.

### LICENSE
This project is licensed under the [MIT License](LICENSE).

#### Fase 2

