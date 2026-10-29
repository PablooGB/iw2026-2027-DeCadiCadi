# Análisis de requisitos — DeCadiCadi

## 1. Introducción

DeCadiCadi es una plataforma web destinada a gestionar el Concurso Oficial de Agrupaciones Carnavalescas (COAC) de Cádiz y conservar la memoria histórica del Carnaval.

El sistema pretende centralizar la información del concurso, facilitar la gestión de cada edición y permitir la consulta pública de información histórica.

Este documento parte de los objetivos descritos en el enunciado P00 del proyecto. A partir de ellos, el equipo define los requisitos funcionales, los objetivos no funcionales y las reglas del dominio que determinarán el comportamiento de la aplicación.

## 2. Usuarios del sistema

Se contemplan los siguientes perfiles de usuario:

- **Usuarios públicos o lectores:** aficionados, prensa e investigadores que consultan la información publicada.
- **Administradores:** responsables de gestionar el sistema, validar inscripciones y mantener la información.
- **Miembros del jurado:** usuarios responsables de evaluar las agrupaciones e introducir sus puntuaciones.
- **Autores o representantes de agrupaciones:** usuarios que registran agrupaciones y gestionan las inscripciones que les corresponden.

Cada perfil dispondrá de permisos específicos. El sistema comprobará que cada usuario esté autorizado para realizar las operaciones solicitadas.

## 3. Requisitos funcionales

### 3.1. Front-office: consulta pública

**RF-01. Consulta de la edición en curso**

El sistema permitirá consultar la información pública de la edición en curso, incluyendo las agrupaciones inscritas, el orden de actuación, las sesiones programadas y los resultados publicados de cada fase.

**RF-02. Ficha de agrupación**

El sistema permitirá consultar la información de una agrupación, incluyendo su nombre, modalidad, localidad, autores, componentes y tipo correspondiente a cada año.

**RF-03. Archivo histórico**

El sistema permitirá buscar y consultar información histórica mediante criterios como el año, la modalidad, los autores y los premios obtenidos.

**RF-04. Consulta de repertorios**

El sistema permitirá consultar las letras publicadas de los repertorios de las agrupaciones, junto con la información contextual disponible.

**RF-05. Consulta del calendario**

El sistema permitirá consultar el calendario de las sesiones del concurso y de las actuaciones en la calle que se encuentren registradas en la aplicación.

**RF-06. Consulta de resultados**

El sistema permitirá consultar las puntuaciones y los resultados una vez que hayan sido publicados para la fase correspondiente.

### 3.2. Back-office: gestión interna

**RF-07. Gestión de ediciones**

El sistema permitirá al administrador crear y gestionar ediciones del concurso, incluyendo sus bases, plazos, modalidades, fases y parámetros de clasificación.

**RF-08. Gestión de inscripciones**

El sistema permitirá a los autores o representantes registrar agrupaciones y presentar sus inscripciones con los datos y la documentación requeridos.

El administrador podrá revisar, validar o rechazar las inscripciones. También podrá habilitar temporalmente la edición de una inscripción enviada para que su autor o representante corrija los datos indicados.

**RF-09. Gestión del sorteo y la programación**

El sistema permitirá gestionar el sorteo, el orden de actuación, las sesiones y la asignación de las agrupaciones a las distintas fases del concurso.

**RF-10. Gestión del jurado y las puntuaciones**

El sistema permitirá gestionar la composición del jurado y registrar las puntuaciones de las agrupaciones.

Los miembros del jurado podrán introducir las puntuaciones que les correspondan. El administrador podrá gestionar o corregir puntuaciones cuando sea necesario, dejando constancia de las modificaciones realizadas.

**RF-11. Clasificación entre fases**

El sistema permitirá configurar por edición los parámetros de clasificación y calcular automáticamente qué agrupaciones pasan de una fase a la siguiente.

El cálculo respetará las reglas de puntuación, los criterios de desempate y el número de agrupaciones establecido para cada fase.

**RF-12. Publicación de resultados**

El sistema permitirá publicar los resultados al finalizar cada fase, una vez que hayan sido revisados y autorizados para su publicación.

Antes de publicarse, las puntuaciones y los resultados no serán accesibles para los lectores.

**RF-13. Catalogación del archivo histórico**

El sistema permitirá al administrador incorporar, organizar y corregir información histórica sobre ediciones, agrupaciones, autores, componentes, repertorios, letras, actuaciones y resultados.

**RF-14. Gestión de usuarios y permisos**

El sistema permitirá al administrador gestionar los usuarios, sus perfiles y los permisos asociados.

Las operaciones protegidas estarán disponibles únicamente para los usuarios autorizados.

## 4. Objetivos no funcionales

Los siguientes objetivos se derivan del enunciado P00. Sus criterios de aceptación concretos deberán precisarse durante el diseño y las pruebas.

**RNF-01. Código abierto y auditabilidad**

La solución estará orientada a ser software público, auditable y reutilizable.

**RNF-02. Mantenibilidad**

El sistema deberá contar con una estructura organizada y documentación suficiente para facilitar su mantenimiento por futuros equipos de desarrollo.

**RNF-03. Extensibilidad**

La arquitectura deberá permitir incorporar nuevas funcionalidades y adaptar las reglas de cada edición sin modificar innecesariamente el núcleo de la aplicación.

**RNF-04. Seguridad y control de acceso**

El sistema deberá proteger las operaciones de gestión y las puntuaciones no publicadas mediante autenticación y comprobación de permisos.

**RNF-05. Accesibilidad**

La interfaz deberá tener en cuenta los criterios de accesibilidad aplicables a una plataforma web de consulta pública.

**RNF-06. Conservación histórica**

El sistema deberá conservar la información registrada de las distintas ediciones, facilitando su consulta y evitando que las correcciones administrativas eliminen la trazabilidad de los cambios relevantes.

**RNF-07. Transparencia de resultados**

El sistema deberá facilitar la consulta de las puntuaciones y los resultados que hayan sido publicados.

## 5. Requisitos tecnológicos

El proyecto utilizará las tecnologías establecidas en el enunciado P00:

- Java 21.
- Spring Boot 4.
- Vaadin 25.
- Apache Maven.
- GitHub para el código fuente, la gestión del trabajo, la documentación y el control de versiones.
- AWS para el despliegue de la aplicación.

## 6. Reglas del dominio del COAC

Las reglas del dominio de DeCadiCadi serán definidas por el equipo de desarrollo tomando como referencia los objetivos establecidos en P00 y el funcionamiento del Concurso Oficial de Agrupaciones Carnavalescas (COAC).

El equipo tomará las decisiones necesarias para concretar el funcionamiento de la aplicación. Las decisiones se documentarán expresamente y se aplicarán de forma coherente en los requisitos, el diseño, la implementación y las pruebas.

Las bases oficiales del COAC podrán utilizarse como referencia para comprender su funcionamiento. Cuando el equipo decida adaptar alguna regla para la aplicación, dicha adaptación se considerará una decisión de diseño del proyecto.

### 6.1. Criterios para definir las reglas

- Coherencia con los objetivos establecidos en P00.
- Consistencia entre las funcionalidades.
- Claridad y ausencia de contradicciones.
- Seguridad y control de permisos.
- Facilidad de mantenimiento y ampliación.
- Justificación y documentación de las decisiones relevantes.

### 6.2. Decisiones sobre las inscripciones

- Las inscripciones incluirán los datos necesarios para identificar a la agrupación, como su nombre, modalidad, localidad, autores y componentes, además de la documentación que corresponda.
- Los autores o representantes podrán registrar nuevas agrupaciones y presentar sus inscripciones.
- El administrador será responsable de revisar y validar las inscripciones antes de que se consideren definitivas.
- Una vez enviada una inscripción, el autor o representante no podrá modificarla libremente.
- El administrador podrá habilitar temporalmente la edición de una inscripción para que su autor o representante corrija los datos indicados.
- El administrador podrá corregir los datos directamente cuando sea necesario, dejando constancia de los cambios relevantes.

### 6.3. Decisiones sobre puntuaciones y resultados

- Los miembros del jurado serán los responsables de evaluar las agrupaciones e introducir las puntuaciones que les correspondan.
- El administrador dispondrá de permisos para gestionar o corregir puntuaciones cuando sea necesario.
- Las modificaciones administrativas de puntuaciones deberán quedar registradas para identificar quién las realizó y cuándo.
- Las puntuaciones permanecerán privadas para los lectores hasta la publicación de los resultados de la fase correspondiente.
- Los resultados se publicarán al finalizar cada fase, una vez revisados y autorizados por el perfil correspondiente.

### 6.4. Decisiones sobre las fases y la clasificación

- El sistema contemplará las fases de preliminares, cuartos de final, semifinales y final.
- El administrador podrá configurar para cada edición los parámetros necesarios para determinar la clasificación.
- El sistema calculará automáticamente qué agrupaciones pasan a la siguiente fase aplicando los parámetros configurados.
- Los criterios de puntuación, el número de agrupaciones que pasan de fase y las reglas de desempate deberán estar definidos antes de calcular la clasificación.
- El sistema deberá impedir la publicación de una clasificación incompleta o calculada sin los datos necesarios.
- Los parámetros podrán adaptarse a distintas ediciones sin necesidad de modificar directamente el código de la aplicación.

### 6.5. Decisiones sobre el archivo histórico

- La aplicación conservará en una base de datos la información registrada de las distintas ediciones del concurso.
- El archivo podrá incluir datos de agrupaciones, autores, componentes, modalidades, repertorios, letras, actuaciones, puntuaciones y resultados.
- Los lectores podrán consultar la información histórica que sea pública.
- El administrador podrá corregir errores en los registros históricos, incluso cuando una edición haya finalizado.
- Las correcciones relevantes deberán mantener una trazabilidad que permita identificar quién realizó el cambio, cuándo se produjo y qué información se modificó.
- Las modificaciones históricas deberán respetar los permisos y las restricciones de publicación que correspondan.

### 6.6. Decisiones sobre usuarios y permisos

- **Administrador:** podrá gestionar ediciones, inscripciones, programación, jurado, puntuaciones, resultados, archivo histórico, usuarios y permisos.
- **Jurado:** podrá consultar la información necesaria para evaluar las agrupaciones e introducir las puntuaciones correspondientes.
- **Autores o representantes:** podrán registrar agrupaciones, presentar inscripciones y corregirlas cuando el administrador habilite temporalmente su edición.
- **Lectores:** podrán consultar la información pública, los resultados publicados y el archivo histórico, sin modificar los datos.

El sistema comprobará los permisos antes de ejecutar cada operación protegida.

## 7. Trazabilidad y mantenimiento de los requisitos

Los requisitos se relacionarán con las Issues correspondientes de GitHub cuando proceda.

Las decisiones relevantes sobre las reglas del dominio, los cambios en los requisitos y las modificaciones de comportamiento quedarán documentados en el repositorio.

La documentación se actualizará cuando cambien las funcionalidades o las decisiones del equipo.

## 8. Referencias

- P00 — Proyecto de prácticas, Ingeniería Web, Universidad de Cádiz, curso 2026/2027.
- Bases oficiales del COAC de la edición correspondiente, cuando se utilicen como referencia para definir o justificar reglas del dominio.
- Issues y documentación del repositorio DeCadiCadi en GitHub.