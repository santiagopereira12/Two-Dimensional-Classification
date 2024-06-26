# Two-Dimensional-Classification

Este proyecto es una aplicación Java Spring Boot que utiliza Spring Data JPA para conectarse a una base de datos MySQL y recuperar datos de las tablas `tabla_a` y `tabla_b`. El objetivo principal es mostrar cómo configurar y usar Spring Data JPA para operaciones CRUD básicas en una base de datos relacional.

## Configuración del Proyecto

El proyecto utiliza Maven para la gestión de dependencias y está configurado para conectarse a una base de datos MySQL local. A continuación se detalla la configuración necesaria:

### Requisitos

- Java 8 o superior
- MySQL
- Maven

### Configuración de la Base de Datos

1. Cree una base de datos llamada `euclidiana` en su servidor MySQL local.
2. Ejecute los scripts de creación de tablas `tabla_a.sql` y `tabla_b.sql` para crear las tablas y cargar algunos datos de ejemplo en la base de datos.

### Configuración de la Aplicación

En el archivo `application.properties`, asegúrese de que la configuración de la base de datos coincida con su entorno:

```properties
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/euclidiana
spring.datasource.username=root
spring.datasource.password=tu_contraseña
spring.jpa.hibernate.ddl-auto=update
```

## Estructura del Proyecto

El proyecto sigue una estructura básica de aplicación Spring Boot:

- `src/main/java/com/euclidiana/dimensions`: Contiene los archivos fuente de la aplicación.
    - `persistence/entity`: Contiene las entidades JPA que representan las tablas de la base de datos.
    - `persistence/repository`: Contiene los repositorios Spring Data JPA para acceder a los datos de la base de datos.
    - `service`: Contiene las clases de servicio que encapsulan la lógica de negocio.
    - `web/controller`: Contiene los controladores REST que manejan las solicitudes HTTP y devuelven las respuestas.
- `src/main/resources`: Contiene los archivos de configuración, como `application.properties`.

## Uso de la Aplicación

Una vez que haya configurado la base de datos y la aplicación, puede ejecutarla como una aplicación Spring Boot estándar. Puede utilizar herramientas como Postman para enviar solicitudes HTTP a los endpoints definidos en los controladores REST y recibir respuestas con los datos recuperados de la base de datos.

Por ejemplo, puede enviar una solicitud GET a `http://localhost:8080/api/eucidiana` para recuperar todos los datos de la tabla `tabla_a`.

## Contribuciones

Las contribuciones son bienvenidas. Si desea contribuir a este proyecto, abra un issue para discutir los cambios propuestos o envíe una solicitud de extracción.
