import java.util.Scanner

/**
 * Punto de entrada principal para el sistema de gestión de tareas.
 */
fun main() {
    val scanner = Scanner(System.`in`)
    println("Sistema de gestión de tareas - Transformación Digital")

    print("Ingrese usuario: ")
    val username = scanner.nextLine()
    print("Ingrese contraseña: ")
    val password = scanner.nextLine()

    if (TaskManager.login(username, password)) {
        println("Acceso concedido")
        ejecutarMenu(scanner)
    } else {
        println("Acceso denegado")
    }
}

/**
 * Muestra el menú principal del sistema y gestiona las acciones del usuario.
 *
 * @param scanner Objeto Scanner para leer entradas desde la consola.
 */
fun ejecutarMenu(scanner: Scanner) {
    var option: Int
    do {
        println("\nMenú:")
        println("1. Agregar tarea")
        println("2. Ver tareas")
        println("3. Completar tarea")
        println("4. Salir")
        print("Seleccione una opción: ")
        option = scanner.nextInt()
        scanner.nextLine()

        when (option) {
            1 -> agregarTarea(scanner)
            2 -> verTareas()
            3 -> completarTarea(scanner)
            4 -> println("Saliendo del sistema...")
            else -> println("Opción no válida")
        }
    } while (option != 4)
}

/**
 * Solicita los datos de una nueva tarea al usuario y la agrega al sistema.
 *
 * @param scanner Objeto Scanner para leer entradas desde la consola.
 */
fun agregarTarea(scanner: Scanner) {
    print("Título de la tarea: ")
    val titulo = scanner.nextLine()
    print("Descripción: ")
    val descripcion = scanner.nextLine()
    print("Fecha de vencimiento (YYYY-MM-DD): ")
    val fechaVencimiento = scanner.nextLine()
    print("Prioridad (1-5): ")
    val prioridad = scanner.nextInt()
    scanner.nextLine()

    val tarea = TaskManager.aniadirTarea(titulo, descripcion, fechaVencimiento, prioridad)
    println("Tarea agregada: $tarea")
}

/**
 * Muestra todas las tareas existentes ordenadas por prioridad.
 */
fun verTareas() {
    println("\nLista de tareas (ordenadas por prioridad):")
    TaskManager.obtenerTarea().forEach { println(it) }
}

/**
 * Solicita al usuario un ID de tarea y marca esa tarea como completada si existe.
 *
 * @param scanner Objeto Scanner para leer entradas desde la consola.
 */
fun completarTarea(scanner: Scanner) {
    print("Ingrese el ID de la tarea a completar: ")
    val id = scanner.nextLine()
    if (TaskManager.completarTarea(id)) {
        println("Tarea completada con éxito")
    } else {
        println("Tarea no encontrada")
    }
}
