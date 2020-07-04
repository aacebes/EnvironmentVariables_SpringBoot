# EnvironmentVariables_SpringBoot

Este es el código de ejemplo para seguir el tutorial sobre configuración de Spring Boot con variables de entorno en el blog http://adictosaltrabajo.com

Disponemos de dos clases con las que estamos cargando propiedades:
- La clase `IndividualProperties` usa la anotación `@Value` y carga valores simples y un mapa en formato json mediante SPEL.
- La clase `GroupProperties` usa la anotación `@ConfigurationProperties` y carga esas mismas propiedades en un objeto de configuración. Además también carga una lista de objetos complejos y un mapa en formato yaml.

Simplemente ejecutando `./mvnw spring-boot:run` en Unix o `./mvnw.cmd spring-boot:run` en Windows se ejecutará la aplicación y se mostrará por consola las propiedades que se han cargado en cada caso.

Las propiedades que se están cargando se encuentran en el fichero `application.yaml`. 
Sin embargo, el objetivo del tutorial es usar variables de entorno para sobrescribir esta configuración. 
Para ello simplemente hay que inicializar la variable que queramos mediante el siguiente comando en Unix:

```
EXPORT MY_PROPERTY_S="NUEVO VALOR"
```

O este en Windows:

```
SET MY_PROPERTY_S="NUEVO VALOR"
```
