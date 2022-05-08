![Cognizant_logo_2022 svg](https://user-images.githubusercontent.com/77414220/167276034-fc9aba50-8b81-4ce6-8da8-db3aea61e87b.png)

# Postwork

## INTEGRANTES DEL EQUIPO

- Osmar Barraza Flores
- Cruz Gil Estrada
- Dalyn Lara Cortes
- Carlos Valdivia Garcia

## 🎯 OBJETIVOS

- Comparar el funcionamiento de JUnit y TestNG en escenarios similares
- Analizar cómo funciona la ejecución en paralelo en JUnit 5
- Analizar cómo funciona la ejecución en paralelo en TestNG

## 🚀 DESARROLLO

Antes de comenzar con la actividad te recomendamos revisar el siguiente recurso para que comprendas que hay detrás de la ejecución de pruebas en paralelo utilizando JUnit 5:

[Ejecución Paralela](https://junit.org/junit5/docs/5.3.0-M1/user-guide/index.html#writing-tests-parallel-execution)

Continuaremos con el desarrollo del software de entrevistadores y exploraremos la paralelización de pruebas con JUnit realizando el siguiente ejercicio:

- Configura tu proyecto e instala las dependencias necesarias 

- Paralelizar la ejecución de tus pruebas

### Sigue estas instrucciones:

- En tu archivo build.grade asegurate de tener junit en su versión 5.3 o superior
- En el mismo archivo asegurate que la configuración test luzca de la siguiente forma


```
test {
    useJUnitPlatform()
    systemProperty 'junit.jupiter.execution.parallel.enabled', 'true'
}
```

-Ejecuta las pruebas
-Cambia la configuración anterior a false y observa las diferencias en los tiempos de ejecución


Para cerrar nuestro postwork, revisemos el siguiente video que realiza un benchmark de la ejecución en paralelo entre diferentes frameworks de pruebas:

[¿Cuál tecnología es más eficiente para ejecutar los tests en paralelo?](https://www.youtube.com/watch?v=omX2IQvHA1A)


## Indicaciones generales

¿Terminaste la actividad? responde las siguientes preguntas:

**¿Notaste alguna diferencia en el tiempo de ejecución de las pruebas?**

Al ser una cantidad pequeña de pruebas, la diferencia no fue tan notoria, sin embargo, después de correr las pruebas en ambos modos un par de veces, notamos que en paralelo el tiempo promedio era de 94 milisegundos, mientras que secuenciales era de 96 milisegundos.

**¿Qué ventajas consideras que aporta la ejecución en paralelo?**

Considero que cuando el proyecto es grande y se requiere lanzar todas las pruebas a la vez, las pruebas paralelas son útiles porque ahorran tiempo.

**¿Crees que existe alguna desventaja de ejecutar nuestras pruebas en paralelo?**

Probablemente cuando se requieran hacer pruebas por bloques o secuenciales no se tendría muy claro que parte de la prueba fallo.


¡Mucho éxito y reta tu potencial!

## ✅ Checklist 

Asegúrate que tu postwork contenga todo lo siguiente, ya que esto se evaluará al término del módulo.

- ✅ Tu archivo de configuración build.grade cuenta la configuración  systemProperty 'junit.jupiter.execution.parallel.enabled', 'true'  




- ✅ Tus pruebas se ejecutan en paralelo




- ✅ Al cambiar la configuración `systemProperty 'junit.jupiter.execution.parallel.enabled', 'false’` tus pruebas se ejecutan secuencialmente  
