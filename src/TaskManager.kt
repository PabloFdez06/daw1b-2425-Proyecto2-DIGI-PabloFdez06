// Gestor de tareas que simula almacenamiento en la nube
import java.util.*

object TaskManager {
    private val tareas = mutableListOf<Tareas>()
    private val users = mutableMapOf("admin" to "password123") // Usuario y contraseña simulados

    fun login(username: String, password: String): Boolean {
        return users[username] == password
    }

    fun aniadirTarea(title: String, description: String, dueDate: String, priority: Int): Tareas {
        val tarea = Tareas(UUID.randomUUID().toString(), title, description, false, dueDate, priority)
        tareas.add(tarea)
        return tarea
    }

    fun obtenerTarea(): List<Tareas> = tareas.sortedBy { it.prioridad }

    fun completarTarea(id: String): Boolean {
        val tarea = tareas.find { it.id == id }
        return if (tarea != null) {
            tarea.completada = true
            true
        } else {
            false
        }
    }
}