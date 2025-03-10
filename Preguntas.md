# Respuestas a las preguntas del Proyecto 2: Transformación Digital

## **Ciclo de vida del dato (5b)**

### **1. ¿Cómo se gestionan los datos desde su generación hasta su eliminación en tu proyecto?**
Actualmente, los datos (tareas) se almacenan en memoria mientras se ejecuta el programa. Al cerrarlo, los datos se pierden. Para mejorar esto, se podría implementar almacenamiento en bases de datos locales o en la nube.

### **2. ¿Qué estrategia sigues para garantizar la consistencia e integridad de los datos?**
Se utiliza un identificador único (UUID) para cada tarea, asegurando que cada entrada sea distinta. Se podría agregar validaciones para evitar tareas duplicadas y garantizar coherencia.

### **3. Si no trabajas con datos, ¿cómo podrías incluir una funcionalidad que los gestione de forma eficiente?**
Se podría implementar una base de datos SQLite o Firebase para almacenar tareas de forma persistente, asegurando consistencia y recuperabilidad.

## **Almacenamiento en la nube (5f)**

### **1. Si tu software utiliza almacenamiento en la nube, ¿cómo garantizas la seguridad y disponibilidad de los datos?**
Actualmente, no se almacena en la nube. Sin embargo, podría integrarse con Firebase Firestore o AWS DynamoDB con autenticación segura.

### **2. ¿Qué alternativas consideraste para almacenar datos y por qué elegiste tu solución actual?**
Inicialmente, se consideró almacenamiento en memoria por simplicidad. Alternativas incluyen bases de datos SQL o NoSQL y almacenamiento en la nube.

### **3. Si no usas la nube, ¿cómo podrías integrarla en futuras versiones?**
Podría integrarse con Firebase Firestore o Google Cloud Storage para almacenamiento remoto seguro y accesible desde cualquier dispositivo.

## **Seguridad y regulación (5i)**

### **1. ¿Qué medidas de seguridad implementaste para proteger los datos o procesos en tu proyecto?**
Actualmente, solo se realiza autenticación básica. Para mejorar, se podría implementar hashing de contraseñas (BCrypt) y conexión segura HTTPS.

### **2. ¿Qué normativas (e.g., GDPR) podrían afectar el uso de tu software y cómo las has tenido en cuenta?**
Si se almacenan datos de usuarios, debería cumplirse con GDPR y normativas de protección de datos. Se podría agregar un sistema de consentimiento y encriptación de datos.

### **3. Si no implementaste medidas de seguridad, ¿qué riesgos potenciales identificas y cómo los abordarías en el futuro?**
El principal riesgo es el acceso no autorizado a tareas. Se podría mitigar con autenticación segura y encriptación de datos sensibles.

## **Implicación de las THD en negocio y planta (2e)**

### **1. ¿Qué impacto tendría tu software en un entorno de negocio o en una planta industrial?**
Podría mejorar la gestión de tareas en equipos de IT y OT, facilitando la planificación y seguimiento de actividades en tiempo real.

### **2. ¿Cómo crees que tu solución podría mejorar procesos operativos o la toma de decisiones?**
Facilita la organización de tareas y prioridades, optimizando el flujo de trabajo y mejorando la productividad.

### **3. Si tu proyecto no aplica directamente a negocio o planta, ¿qué otros entornos podrían beneficiarse?**
Podría ser útil en educación, gestión de proyectos personales o startups tecnológicas.

## **Mejoras en IT y OT (2f)**

### **1. ¿Cómo puede tu software facilitar la integración entre entornos IT y OT?**
Con una versión basada en la nube, diferentes departamentos podrían acceder y coordinar tareas en tiempo real.

### **2. ¿Qué procesos específicos podrían beneficiarse de tu solución en términos de automatización o eficiencia?**
Automatización de asignación de tareas, seguimiento de progreso y generación de reportes.

### **3. Si no aplica a IT u OT, ¿cómo podrías adaptarlo para mejorar procesos tecnológicos concretos?**
Se podría desarrollar integraciones con APIs empresariales para mejorar la interoperabilidad.

## **Tecnologías Habilitadoras Digitales (2g)**

### **1. ¿Qué tecnologías habilitadoras digitales (THD) has utilizado o podrías integrar en tu proyecto?**
Se podría integrar con Cloud Computing (Firebase, AWS), Big Data (análisis de tareas) y Ciberseguridad (encriptación de datos).

### **2. ¿Cómo mejoran estas tecnologías la funcionalidad o el alcance de tu software?**
Permitirían almacenamiento seguro y colaboración en tiempo real entre equipos de trabajo.

### **3. Si no has utilizado THD, ¿cómo podrías implementarlas para enriquecer tu solución?**
Integrando servicios de autenticación como OAuth, almacenamiento en la nube y dashboards con visualización de datos.

---
