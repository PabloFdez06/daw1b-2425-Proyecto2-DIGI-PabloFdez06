import java.util.*

/**
 * Objeto singleton que actúa como gestor de tareas.
 *
 * Simula un almacenamiento en la nube utilizando una lista en memoria. Proporciona
 * funcionalidades básicas como autenticación, adición, listado y finalización de tareas.
 */
object TaskManager {

    /** Lista que contiene todas las tareas creadas en el sistema. */
    private val tareas = mutableListOf<Tareas>()

    /**
     * Mapa que simula usuarios del sistema.
     * Contiene pares de nombre de usuario y contraseña.
     */
    private val users = mutableMapOf("admin" to "password123")

    /**
     * Verifica si las credenciales de inicio de sesión son válidas.
     *
     * @param username Nombre de usuario.
     * @param password Contraseña correspondiente.
     * @return `true` si las credenciales coinciden, `false` en caso contrario.
     */
    fun login(username: String, password: String): Boolean {
        return users[username] == password
    }

    /**
     * Añade una nueva tarea al sistema.
     *
     * @param title Título de la tarea.
     * @param descripcion Descripción detallada.
     * @param fechaVencimiento Fecha límite en formato YYYY-MM-DD.
     * @param prioridad Prioridad numérica (1-5), donde 1 es la más alta.
     * @return La tarea recién creada.
     */
    fun aniadirTarea(title: String, descripcion: String, fechaVencimiento: String, prioridad: Int): Tareas {
        val tarea = Tareas(
            UUID.randomUUID().toString(),
            title,
            descripcion,
            false,
            fechaVencimiento,
            prioridad
        )
        tareas.add(tarea)
        return tarea
    }

    /**
     * Devuelve la lista de tareas ordenadas por prioridad ascendente.
     *
     * @return Lista de tareas ordenada.
     */
    fun obtenerTarea(): List<Tareas> = tareas.sortedBy { it.prioridad }

    /**
     * Marca como completada una tarea según su ID.
     *
     * @param id Identificador único de la tarea.
     * @return `true` si la tarea fue encontrada y marcada como completada, `false` si no existe.
     */
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
