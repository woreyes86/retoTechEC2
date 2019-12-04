# RETO TÉCNICO

## Introduccion

Una aplicacion basada en tecnologia java utilizando como framework spring boot y orientada a una arquitectura de microservicios.

## Instrucciones: 

## Ejecución

## Ejecución Automática: SH:
compilar_todo.sh

## Ejecución Manual
1: Crear el componente: 
- cd back && mvn clean
- mvn test
- mvn install
- cd .. 

2: Detener y Construir los contenedores:
docker-compose down
docker-compose build

3: Poner en Marcha los contnedores:
docker-compose up -d

## Para el MicroServicio
URL servicio Back:  
localhost:8084 No Accesible.

#
URL Servicio  Con N. Reverse-proy (Puerto 8080):  
localhost:8080/multiply/1/1

## Visualizar inserts en contenedor de la Aplicación:
docker logs api-web

