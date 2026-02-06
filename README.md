# creacionApi

# Pasos para la creacion de la API

# 1. Entramos a Spring Initializr y configuramos nuestro proyecto, en mi caso use las siguientes configuraciones + dependencias

### En el lenguaje de programacion use Java + Spring Boot, Spring boot simplifica mucho las conexiones con las bases de datos, ademas que usando JPA, nos queda muy facil trabajar con bases de datos.

### Escojo la version de Spring Boot 4.02 usando Gradle - Groovy

### Ademas utilizao app.properties ya que para mi opinion es mas facil configurar la conexion con la base de datos.

### Y ademas de esto utilizo el JDK 25

### - Spring Web -> Para poder trabajar con MVC
### - MySQL Driver -> Para usar el motor de la base de datos MySQL
### - Spring Data JPA -> Para usar mediante codigo java instrucciones SQL, usando jdbc.
### - Lombok -> Para poder simplificar algunas codificaciones (como GETS, SETS, CONSTRUCTORES)
