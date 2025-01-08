**Archivo de Estudio Maestro: Introducción a la Gestión de Proyectos de Software (IGPS)**

**I. Conceptos Clave de Software e Ingeniería**

*   **¿Qué es Ingeniería?**
    *   Conjunto de conocimientos orientados a la invención y utilización de técnicas para el aprovechamiento de los recursos naturales o para la actividad industrial (RAE).
    *   Profesión y ejercicio de la ingeniería.
*   **Cualidades de un Buen Ingeniero:**
    *   Multidisciplinario, Ingenioso, Creativo, Pasión por la ciencia, Analítico, Trabajador, Social, Lógico, Detallista, Estudioso.
*   **Ingeniería Informática:**
    *   Combina principios de ingeniería y ciencias de la computación para diseñar, desarrollar y gestionar sistemas de software y hardware.
    *   Incluye desarrollo de software, redes, seguridad, IA.
    *   Crea soluciones tecnológicas, se adapta a los cambios.
*   **¿Qué es Software?**
    *   Conjunto de programas, instrucciones y reglas informáticas para ejecutar tareas en una computadora (RAE).
    *   Incluye código fuente, documentación asociada y datos requeridos.
*   **¿Quién Construye el Software?**
    *   Ingenieros de Software.

**II. Evolución y Desarrollo del Software**

*   **Etapas de Evolución del Desarrollo de Software:**
    *   **1950-1965:** "Codificar y Corregir", sin planificación, poca documentación, prueba y error.
    *   **1965-1972:** Simplificación, multiprogramación, sistemas en tiempo real, software como producto, crisis del software.
    *   **1972-1985:** Sistemas distribuidos, complejidad en los sistemas de información, redes LAN, microprocesadores.
    *   **1985-1995:** Impacto colectivo del software, redes de información, tecnología orientada a objetos, IA.
    *   **2000-Presente:** Ubicuidad de la web, reutilización de información, componentes de software.
*   **Por qué el Software es un Desafío**
    *   **Tiempo:** ¿Por qué tanto?
    *   **Costos:** ¿Por qué tan altos?
    *   **Errores:** ¿Por qué cuesta tanto detectarlos?
    *   **Desarrollo:** ¿Por qué cuesta medir su avance?
    *   **Mantenimiento:** ¿Por qué dedicamos tanto tiempo y esfuerzo?
*   **Atributos del Software:**
    *   Mantenibilidad (#evolución, #cambio)
    *   Confiabilidad y seguridad (#siFallaNoDaña)
    *   Eficiencia (#noDesperdiciaRecursos)
    *   Aceptabilidad (#comprensible, #compatible, #friendly)
*   **Problemas del Software:**
    *   Tiempo, Calidad, Mantenimiento, Reutilización, Entendimiento del Usuario.
*   **Costos del Software:**
    *   60% Desarrollo, 40% Pruebas (Sommerville).
    *   Para software específico, los costes de evolución son mayores que los de desarrollo.

**III. Procesos de Desarrollo de Software**

*   **Proceso de Software:**
    *   Descripción de una secuencia de actividades para generar un producto, incluida la solución de software.
*   **Actividades Estructurales:**
    *   Comunicación, Planificación, Modelado, Construcción, Despliegue.
*   **Actividades Sombrilla:**
    *   Seguimiento/Control, Gestión de Riesgos, Aseguramiento de Calidad, Gestión de Configuración, Revisiones Técnicas.
*   **Tipos de Flujo de Actividades:**
    *   **Lineal:** Flujo secuencial.
    *   **Iterativo:** Flujo repetitivo y cíclico.
    *   **Paralelo:** Actividades ejecutándose concurrentemente.
    *   **Evolutivo:** Adaptación y evolución con el tiempo.

*   **Modelos de Proceso:**
    *   **Cascada:** Fases secuenciales rígidas.
         * Ventajas: Fácil de entender
         * Desventajas: Los cambios son difíciles de gestionar, difícil de satisfacer requisitos cambiantes.
    *   **Cascada en V:** Fases de prueba paralelas al desarrollo, incluye validación de los requisitos de usuario.
          * Ventajas: La validación es más sistemática, perspectiva del usuario durante las pruebas.
          * Desventajas: Los cambios siguen siendo difíciles de gestionar, las fases de prueba están lejos de la recopilación inicial de requisitos.
    *   **Incrementales:** Entrega de partes funcionales en incrementos.
        * Ventajas: Entrega temprana de características parciales
        * Desventajas: Difícil de determinar los requisitos para el proyecto completo.
    *   **Evolutivos:** Desarrollo mediante iteraciones, refinamiento con feedback.
         * Ventajas: Flexibilidad y adaptación, mejor comprensión de las necesidades, feedback de los usuarios.
        * Desventajas: Difícil de gestionar en proyectos grandes.
    *   **Proceso Unificado:** Iterativo e incremental, dirigido por casos de uso, centrado en la arquitectura.

**IV. Control de Versiones con GIT**

*   **¿Qué es Git?**
    *   Sistema de control de versiones distribuido, gratuito y de código abierto.
    *   Gestiona proyectos de forma eficiente, desde pequeños a grandes.
    *   Modelo de ramificación único.
*   **Conceptos Clave:**
    *   **Commits:** Instantáneas de la línea de tiempo del proyecto, creadas con `git commit`.
        *   Se envían al repositorio local.
    *   **Ramas (Branches):** Divisiones del estado del código, permiten múltiples rutas de desarrollo.
        *   Creación, fusión y eliminación son rápidas en Git.
    *   **Repositorios:**
        *   **Local:** En tu máquina, donde se realizan la mayoría de las operaciones.
        *   **Remoto:** En un servidor, permite la sincronización con otros repos locales.
*   **Flujo de Trabajo:**
    *   Los cambios locales no afectan al repositorio remoto hasta que se sincronicen.
*   **Recomendaciones:**
    *   Realizar commits de unidades lógicas terminadas.
    *   Usar ramas para funcionalidades.
    *   Mantener el entorno de trabajo limpio antes de acciones de impacto.
    *   Actualizar ramas locales antes de merges.
    *   El *stage* es para cambios, no para archivos.
*   **Comandos Básicos de Git:**
    *   `git config`: Configurar identidad de usuario.
        *   `--global`: user.name, user.email
    *   `git init`: Inicializar un nuevo repositorio Git.
    *   `git clone <repo>`: Clonar un repositorio remoto.
    *   `git add .`: Añadir todos los cambios al *stage*.
    *   `git commit -m "<mensaje>"`: Confirmar cambios.
    *   `git remote add <nombre> <url>`: Añadir un repositorio remoto.
    *   `git push`: Enviar commits locales al repositorio remoto.
*   **Git Flow**
    *   Rama de Desarrollo (local)
    *   Rama de Características
    *   Rama Master
    *   Rama de Release
    *   Rama Hotfix

**V. Metodología Ágil: SCRUM**

*   **Principios Ágiles:**
    *   Colaboración, comunicación, entrega rápida de valor.
    *   Adaptación a requisitos cambiantes.
    *   Iterativo e incremental.
    *   Participación del cliente.
    *   Comunicación frecuente
*   **Definición de Scrum:**
    *   Marco ágil para trabajo en equipo, comunicación y adaptabilidad.
    *   Divide el trabajo en ciclos cortos (sprints) de 2-4 semanas.
*   **Principios Scrum:**
    *   Empirismo (Transparencia, Inspección, Adaptación).
    *   Auto-organización.
    *   Colaboración.
    *   Priorización de valor.
    *   Time boxing.
    *   Desarrollo por iteraciones.
*   **Conceptos Clave:**
    *   **Épica:** Historia de usuario grande, dividida en historias más pequeñas.
    *   **Historia de Usuario:** Representación escrita de un requisito del usuario.
    *   **Tarea:** Desglose técnico de una historia de usuario.
    *   **Definición de Hecho (Definition of Done):** Criterios acordados para considerar una historia de usuario completada.
    *   **Criterios de Aceptación:** Componentes objetivos para validar la funcionalidad.
    *   **Objetivo del Sprint (Sprint Goal):** Meta del sprint alcanzada mediante el product backlog.
*   **Roles de Scrum:**
    *   **Product Owner:** Define requisitos, prioriza, representa al cliente.
        *   Conocimiento del negocio, comunicación, negociación, proactivo, decisivo.
    *   **Scrum Master:** Facilita el proceso Scrum, ayuda al equipo a lograr objetivos.
        *   Líder servicial, guardián, proactivo.
    *   **Equipo de Desarrollo:** Construye el producto.
*   **Eventos de Scrum:**
    *   **Planificación del Sprint (Sprint Planning):** Planificación del sprint.
    *   **Scrum Diario (Daily Scrum):** Actualización diaria del progreso.
    *   **Revisión del Sprint (Sprint Review):** Mostrar el producto a los interesados.
    *   **Retrospectiva del Sprint (Sprint Retrospective):** El equipo reflexiona y busca mejoras.
*   **Artefactos de Scrum:**
    *   **Backlog del Producto (Product Backlog):** Lista de todas las características deseadas.
    *   **Backlog del Sprint (Sprint Backlog):** Lista de tareas para el sprint.
    *   **Incremento del Producto (Product Increment):** Versión funcional entregada al final de cada sprint.
*   **Participantes del Evento**
        *  **Planificación del Sprint**: SM, PO, DT
        *   **Scrum Diario**: SM, PO (opcional), DT
        *   **Revisión del Sprint**: SM, PO, DT, Stakeholders
        *   **Retrospectiva del Sprint**: SM, PO, DT
*   **Estimaciones:**
    *   Basadas en el esfuerzo para completar la tarea.
    *   Secuencia de Fibonacci (1, 1, 2, 3, 5, 8…) u horas dependiendo del sistema usado.
    *   Tareas sin ideas claras, estimadas a infinito para resaltar la necesidad de mayor desglose.

**VI. Innovación**

*   **Definición de Innovación:**
    *   Proceso de negocio que crea nuevos productos, servicios, procesos, modelos de negocio y mercados para entregar valor.
*   **Objetivo de la Innovación:**
    *   Crear productos diferenciados con velocidad, mantener retornos superiores al promedio, asegurar la sostenibilidad.
*   **La innovación como un Proceso Sistemático**
    *  Implementar metodologías para integrar la innovación como parte de la organización.
    *  Debe ser sistemática
*   **Modelos de Innovación:**
    *   **Technology-Push:** (1950-1960) Modelo lineal impulsado por avances tecnológicos.
    *   **Market-Pull:** (1960-1970) Modelo lineal que considera las necesidades del cliente.
    *   **Marquis:** (1969) Innovación basada en ideas e insights.
    *   **Por Etapas:** Modelo lineal que combina "Technology Push" y "Market Pull".
    *   **Modelo Integrado de Procesos:** (1980) Fases no secuenciales y solapadas para acortar el tiempo de desarrollo.
    *   **Modelo en Sistemas y en Red:** (1980) Alianzas estratégicas y colaboración.
*   **Requisitos de la Innovación:**
    *   Apoyo directivo, liderazgo horizontal, personal cualificado, equipos multidisciplinarios, información interna/externa, participación del cliente.
*   **Esquemas de Innovación:**
    *   **Individual:** Ideas de los empleados.
    *   **Incremental:** Mejoras continuas en la producción.
    *   **Disruptiva:** Algo completamente nuevo, progreso sustancial sobre tecnologías existentes.

**VII. Técnicas de Priorización**

*   **Votación:** Asignar puntos a los requisitos.
*   **Apuestas:** Distribuir "dólares" conceptuales entre los requisitos.
*   **Cinco Porqués:** Preguntar repetidamente "¿por qué?" para entender la verdadera necesidad.
*   **MoSCoW:** Categorizar los requisitos en:
    *   **Must:** Obligatorio.
    *   **Should:** Alta prioridad.
    *   **Could:** Preferido, pero no necesario.
    *   **Would:** Puede ser pospuesto.

**VIII. Consejos para la Preparación del Examen**

*   Repasa los conceptos clave de cada presentación.
*   Comprende los diferentes modelos de desarrollo de software y sus casos de uso.
*   Practica los comandos y flujos de trabajo de Git.
*   Entiende los conceptos de Agile y Scrum.
*   Estudia el proceso de innovación.
*   Familiarízate con las diferentes técnicas de priorización.
*   Revisa los casos de estudio y ejemplos incluidos en cada presentación.

Este "archivo de estudio" te servirá como guía para tu preparación. Asegúrate no solo de conocer las definiciones, sino también de entender cómo se aplican estos conceptos en escenarios reales de desarrollo de software. ¡Mucho éxito en tu examen!
