# Prueba técnica Certant - Backend

## Agustin Carrizo

### Requisitos

Para el correcto funcionamiento de la aplicacion es necesario tener las siguientes dependencias:

- [Java 17](https://techkrowd.com/programacion/como-instalar-jdk-17-en-windows-10-y-11/) - Guia de instalación
- [Maven](https://www.arteco-consulting.com/post/instalacion-de-maven) - Guia de instalación

## Caracteristicas
### Gestión de datos
Como gestor de datos la aplicacion hace uso de H2, que es una base de datos relacional en memoria.

El esquema lo genera Spring Boot mediante Hibernate.

El script que carga los datos iniciales se encuentra en src/main/resources/data.sql

Spring boot se encarga de levantar la base de datos al ejecutar la aplicacion.

## Pasos para ejecutar la aplicacion backend

```sh
git clone https://github.com/Jcarrizoagustin/prueba-tecnica-back.git
cd prueba-tecnica-back
mvn clean install
mvn spring-boot:run
```