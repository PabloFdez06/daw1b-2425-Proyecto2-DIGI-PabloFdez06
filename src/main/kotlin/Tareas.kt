/**
 * Representa una tarea dentro del sistema de gestión.
 *
 * @property id Identificador único de la tarea, generado con UUID.
 * @property titulo Título breve que resume la tarea.
 * @property descripcion Descripción detallada de la tarea.
 * @property completada Indica si la tarea ha sido marcada como completada. Por defecto es `false`.
 * @property fechaVencimiento Fecha límite para completar la tarea, en formato YYYY-MM-DD.
 * @property prioridad Nivel de prioridad de la tarea (1 = más alta, 5 = más baja).
 */
data class Tareas(
    val id: String,
    val titulo: String,
    val descripcion: String,
    var completada: Boolean = false,
    val fechaVencimiento: String,
    val prioridad: Int
)
