import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("Sistema de gestión de tareas - Transformación Digital")

    print("Ingrese usuario: ")
    val username = scanner.nextLine()
    print("Ingrese contraseña: ")
    val password = scanner.nextLine()

    if (TaskManager.login(username, password)) {
        println("Acceso concedido")
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
                1 -> {
                    print("Título de la tarea: ")
                    val title = scanner.nextLine()
                    print("Descripción: ")
                    val description = scanner.nextLine()
                    print("Fecha de vencimiento (YYYY-MM-DD): ")
                    val dueDate = scanner.nextLine()
                    print("Prioridad (1-5): ")
                    val priority = scanner.nextInt()
                    scanner.nextLine()

                    val task = TaskManager.aniadirTarea(title, description, dueDate, priority)
                    println("Tarea agregada: $task")
                }
                2 -> {
                    println("\nLista de tareas (ordenadas por prioridad):")
                    TaskManager.obtenerTarea().forEach { println(it) }
                }
                3 -> {
                    print("Ingrese el ID de la tarea a completar: ")
                    val id = scanner.nextLine()
                    if (TaskManager.completarTarea(id)) {
                        println("Tarea completada con éxito")
                    } else {
                        println("Tarea no encontrada")
                    }
                }
                4 -> println("Saliendo del sistema...")
                else -> println("Opción no válida")
            }
        } while (option != 4)
    } else {
        println("Acceso denegado")
    }
}
