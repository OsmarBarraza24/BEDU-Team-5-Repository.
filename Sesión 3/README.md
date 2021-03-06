![Cognizant_logo_2022 svg](https://user-images.githubusercontent.com/77414220/167276034-fc9aba50-8b81-4ce6-8da8-db3aea61e87b.png)

# Postwork

## INTEGRANTES DEL EQUIPO

- Osmar Barraza Flores
- Cruz Gil Estrada
- Dalyn Lara Cortes
- Carlos Valdivia Garcia

## 馃幆 OBJETIVOS

- Comparar el funcionamiento de JUnit y TestNG en escenarios similares
- Analizar c贸mo funciona la ejecuci贸n en paralelo en JUnit 5
- Analizar c贸mo funciona la ejecuci贸n en paralelo en TestNG

## 馃殌 DESARROLLO

Antes de comenzar con la actividad te recomendamos revisar el siguiente recurso para que comprendas que hay detr谩s de la ejecuci贸n de pruebas en paralelo utilizando JUnit 5:

[Ejecuci贸n Paralela](https://junit.org/junit5/docs/5.3.0-M1/user-guide/index.html#writing-tests-parallel-execution)

Continuaremos con el desarrollo del software de entrevistadores y exploraremos la paralelizaci贸n de pruebas con JUnit realizando el siguiente ejercicio:

- Configura tu proyecto e instala las dependencias necesarias 

- Paralelizar la ejecuci贸n de tus pruebas

### Sigue estas instrucciones:

- En tu archivo build.grade asegurate de tener junit en su versi贸n 5.3 o superior
    ```
    dependencies {
        testImplementation 'org.junit.jupiter:junit-jupiter-api:5.7.0'
        testRuntimeOnly 'org.junit.jupiter:junit-jupiter-engine:5.7.0'
        implementation 'org.junit.jupiter:junit-jupiter:5.7.0'
        testImplementation 'org.junit.jupiter:junit-jupiter-api:5.8.1'
        testRuntimeOnly 'org.junit.jupiter:junit-jupiter-engine:5.8.1'
    }
    ```
- En el mismo archivo asegurate que la configuraci贸n test luzca de la siguiente forma

    ```
    test {
        useJUnitPlatform()
        systemProperty 'junit.jupiter.execution.parallel.enabled', 'true'
    }
    ```

- Ejecuta las pruebas

   Prueba en ejecuci贸n paralela
   ![S3_3-parallel](https://user-images.githubusercontent.com/77414220/167284093-5a605bc0-aa79-47ad-a153-ad4341d441de.PNG)
   Prueba en ejecuci贸n secuencial
   ![S3_3-notparallel](https://user-images.githubusercontent.com/77414220/167284122-4c3d250d-59b9-4423-81d1-4225fc275d48.PNG)


    
- Cambia la configuraci贸n anterior a false y observa las diferencias en los tiempos de ejecuci贸n
    ```
    test {
        useJUnitPlatform()
        systemProperty 'junit.jupiter.execution.parallel.enabled', 'false'
    }
    ```


Para cerrar nuestro postwork, revisemos el siguiente video que realiza un benchmark de la ejecuci贸n en paralelo entre diferentes frameworks de pruebas:

[驴Cu谩l tecnolog铆a es m谩s eficiente para ejecutar los tests en paralelo?](https://www.youtube.com/watch?v=omX2IQvHA1A)


## Indicaciones generales

驴Terminaste la actividad? responde las siguientes preguntas:

**驴Notaste alguna diferencia en el tiempo de ejecuci贸n de las pruebas?**

Al ser una cantidad peque帽a de pruebas, la diferencia no fue tan notoria, sin embargo, despu茅s de correr las pruebas en ambos modos un par de veces, notamos que en paralelo el tiempo promedio era de 94 milisegundos, mientras que secuenciales era de 96 milisegundos.

**驴Qu茅 ventajas consideras que aporta la ejecuci贸n en paralelo?**

Considero que cuando el proyecto es grande y se requiere lanzar todas las pruebas a la vez, las pruebas paralelas son 煤tiles porque ahorran tiempo.

**驴Crees que existe alguna desventaja de ejecutar nuestras pruebas en paralelo?**

Probablemente cuando se requieran hacer pruebas por bloques o secuenciales no se tendr铆a muy claro que parte de la prueba fallo.


隆Mucho 茅xito y reta tu potencial!

## 鉁? Checklist 

Aseg煤rate que tu postwork contenga todo lo siguiente, ya que esto se evaluar谩 al t茅rmino del m贸dulo.

- 鉁? Tu archivo de configuraci贸n build.grade cuenta la configuraci贸n  systemProperty 'junit.jupiter.execution.parallel.enabled', 'true'  




- 鉁? Tus pruebas se ejecutan en paralelo




- 鉁? Al cambiar la configuraci贸n `systemProperty 'junit.jupiter.execution.parallel.enabled', 'false鈥檂 tus pruebas se ejecutan secuencialmente  
