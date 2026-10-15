# Plan de proyecto — DeCadiCadi

## 1. Información general

- **Nombre del proyecto:** DeCadiCadi
- **Asignatura:** Ingeniería Web
- **Curso académico:** 2026/2027
- **Universidad:** Universidad de Cádiz
- **Metodología:** Scrum, complementada con prácticas de Extreme Programming (XP).
- **Repositorio:** `iw2026-2027-DeCadiCadi`

## 2. Descripción del proyecto

DeCadiCadi es una plataforma web destinada a gestionar el Concurso Oficial de Agrupaciones Carnavalescas de Cádiz (COAC) y preservar la memoria histórica del Carnaval.

El sistema contará con una interfaz pública para aficionados, prensa e investigadores, y una interfaz privada para la gestión del concurso por parte del personal autorizado.

La aplicación pretende centralizar la información del concurso, facilitar la consulta de resultados y documentación histórica, mejorar la transparencia de los procesos y conservar los datos de cada edición de forma estructurada y sostenible.

## 3. Objetivos del proyecto

- Desarrollar una aplicación web para la gestión del COAC.
- Facilitar la inscripción y gestión de agrupaciones.
- Gestionar las ediciones, fases, sorteos, sesiones y resultados.
- Permitir la consulta pública de información del concurso.
- Crear un archivo histórico consultable de agrupaciones, autores, repertorios y premios.
- Gestionar usuarios y permisos según sus responsabilidades.
- Desarrollar una solución modular, segura, accesible y mantenible.
- Mantener el código, las pruebas y la documentación versionados en GitHub.

## 4. Equipo y roles

El equipo estará formado por tres integrantes.

| Integrante | Rol principal | Responsabilidades |
|---|---|---|
| Pablo Granado Borga | Product Owner | Mantener y priorizar el backlog, recoger las necesidades del cliente y validar los objetivos de las historias. |
| Rubén Gutiérrez Villarin | Scrum Master | Facilitar los eventos Scrum, realizar seguimiento del proceso e identificar impedimentos. |
| Alejandro Álvarez Cerviño | Desarrollo | Colaborar en el análisis, diseño, implementación, pruebas y despliegue. |

Todo el equipo participará en el desarrollo, las pruebas, las revisiones de código y la documentación. Los roles representan responsabilidades principales y no especializaciones exclusivas.

## 5. Metodología de trabajo

Cada sprint tendrá un objetivo concreto y finalizará con un incremento del software potencialmente entregable y su documentación actualizada.

El trabajo se gestionará mediante GitHub Issues y Milestones. Las decisiones, los requisitos acordados con el cliente y los cambios relevantes se registrarán en el repositorio.

## 6. Roadmap inicial

### Fase 1. Inicio y planificación

- Crear y configurar el repositorio de GitHub.
- Definir las responsabilidades del equipo.
- Establecer las normas de trabajo.
- Preparar el plan de proyecto.
- Acordar las herramientas y el entorno de desarrollo.

**Hito 0:** entrega del plan de proyecto.

### Fase 2. Análisis y desarrollo iterativo

**Sprint 1 — Análisis y requisitos**
- Recopilar y validar los requisitos con el cliente.
- Identificar actores, permisos y reglas del dominio.
- Elaborar la documentación inicial de requisitos.

**Sprint 2 — Diseño y arquitectura**
- Diseñar la estructura de la aplicación.
- Definir el modelo de datos y los componentes principales.
- Preparar la estrategia de pruebas.

**Sprint 3 — Funcionalidades principales**
- Implementar las primeras funcionalidades prioritarias.
- Añadir pruebas automatizadas.
- Revisar y documentar los cambios.

**Sprint 4 — Funcionalidades complementarias**
- Ampliar la gestión del concurso y la consulta pública.
- Desarrollar las funcionalidades priorizadas restantes.
- Mejorar la validación y el control de acceso.

**Sprint 5 — Integración y estabilización**
- Integrar los módulos desarrollados.
- Corregir errores y ampliar las pruebas.
- Completar la documentación y preparar el despliegue.

### Fase 3. Cierre

- Desplegar la aplicación.
- Verificar las funcionalidades principales.
- Preparar una base de datos con información de prueba suficiente.
- Publicar la versión final y su documentación.
- Preparar la defensa del proyecto.

Las funcionalidades y el número de sprints se revisarán con el cliente y el equipo. Las fechas concretas se acordarán y registrarán en GitHub.

## 7. Eventos Scrum

- **Sprint Planning:** al comienzo de cada sprint, se define el objetivo y se seleccionan las tareas.
- **Seguimiento diario:** reunión breve, de aproximadamente 15 minutos, para comunicar avances, trabajo siguiente e impedimentos. Si el equipo no puede reunirse diariamente, acordará una alternativa de seguimiento y mantendrá la comunicación actualizada.
- **Sprint Review:** al final del sprint, se demuestra el incremento y se recoge la valoración del cliente.
- **Sprint Retrospective:** al final del sprint, se identifican aspectos que mantener, mejorar y aplicar en el siguiente ciclo.

Las decisiones y acciones relevantes se registrarán en la documentación o en las incidencias de GitHub.

## 8. Modelo de trabajo y control de versiones

GitHub será la fuente única de verdad del proyecto para el código, el backlog, la documentación y las versiones entregadas.

- Las tareas y las incidencias se registrarán mediante Issues.
- Cada sprint tendrá su propio Milestone.
- Las tareas de desarrollo se implementarán preferentemente en ramas independientes.
- Los cambios se integrarán mediante Pull Requests y revisión de código.
- Los commits tendrán mensajes claros y relacionados con el trabajo realizado.
- No se integrará código sin revisar y ejecutar las pruebas pertinentes.
- Se mantendrán sincronizados el código, la documentación y el estado real de las tareas.

### Tecnologías

- Java 21.
- Spring Boot 4.
- Vaadin 25.
- Apache Maven.
- Git y GitHub.

Las versiones y configuraciones concretas se comprobarán en el entorno de desarrollo y en la documentación técnica de la asignatura.

## 9. Definición de Done

Una tarea se considerará terminada cuando:

1. Cumpla los criterios de aceptación acordados.
2. El código esté implementado y sea coherente con la arquitectura del proyecto.
3. Las pruebas pertinentes se hayan ejecutado y superado.
4. No se introduzcan errores conocidos que impidan el funcionamiento de la funcionalidad.
5. El código haya sido revisado e integrado en la rama principal.
6. La documentación afectada esté actualizada.
7. La incidencia de GitHub refleje el estado real de la tarea.
8. Los cambios puedan ser explicados por los integrantes responsables.

Cuando corresponda, se comprobarán también la seguridad, la accesibilidad y el comportamiento de la aplicación.

## 10. Acuerdos del equipo

- Utilizar GitHub como registro común del trabajo.
- Comunicar los impedimentos tan pronto como se detecten.
- Repartir las tareas de forma equilibrada.
- Participar en el análisis, desarrollo, pruebas y documentación.
- No cerrar una incidencia sin verificar su cumplimiento.
- Revisar los cambios antes de integrarlos.
- Registrar los acuerdos relevantes con el cliente.
- Actualizar el plan después de las retrospectivas.
- Utilizar herramientas de IA como apoyo, revisando y comprendiendo todos los resultados generados.
- Declarar en la documentación las herramientas de IA utilizadas y su finalidad.
- Mantener el archivo `AGENTS.md` con las convenciones del proyecto.

## 11. Gestión de riesgos

| Riesgo | Medida preventiva |
|---|---|
| Requisitos ambiguos del dominio | Consultar al cliente y registrar los acuerdos. |
| Reparto desigual del trabajo | Revisar periódicamente las tareas, contribuciones e impedimentos. |
| Conflictos al integrar código | Trabajar con ramas, Pull Requests y pruebas. |
| Retrasos en los sprints | Priorizar las funcionalidades esenciales y revisar el alcance. |
| Errores o pérdida de información | Mantener el código versionado y probar las operaciones relevantes. |
| Dependencia de herramientas de IA | Revisar, probar y comprender el código generado. |
| Problemas de despliegue | Preparar el entorno y comprobar el despliegue con antelación. |

## 12. Seguimiento y actualización

El plan se revisará al finalizar cada retrospectiva. Se actualizarán el roadmap, los riesgos, los acuerdos y las prácticas del equipo cuando sea necesario.

El estado del proyecto se comprobará mediante las Issues, los Milestones, los Pull Requests, las pruebas y las versiones publicadas en GitHub.
