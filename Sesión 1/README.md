![Cognizant_logo_2022 svg](https://user-images.githubusercontent.com/77414220/167276034-fc9aba50-8b81-4ce6-8da8-db3aea61e87b.png)

# Postwork

## INTEGRANTES DEL EQUIPO

- Osmar Barraza Flores
- Cruz Gil Estrada
- Dalyn Lara Cortes
- Carlos Valdivia Garcia


## 🎯 OBJETIVOS

Desarrollar funcionalidad adicional a nuestro programa.
Añadir pruebas unitarias adicionales para probar su funcionalidad.
Aplicar técnicas de diseño de pruebas.
Familiarizarse con la herramienta JUNIT.

## 🚀 DESARROLLO

Durante nuestro work, desarrollamos las primeras funcionalidades de nuestro software de entrevistas  y nos comenzamos a familiarizar con el uso de JUnit. Ahora en este post work continuaremos con el desarrollo del software de entrevistas y exploraremos algunas funcionalidades de JUnit realizando el siguiente ejercicio.

El project manager ha definido como objetivo para este sprint añadir las siguientes características a nuestro sistema actual:
La información de los entrevistadores se puede modificar desde terminal.
La definición de hecho (Definition of Done) establece que todo el código generado debe contar con pruebas unitarias.

1. Añade la opción número 3 al menú, con el texto: "3. Modificar un entrevistador" 

1. Dentro de nuestro switch generar el case con valor 3 y llamar a la función modifyInterviewer que crearemos a continuación

1. Crear la función modifyInterviewer solicitar el email del entrevistador y en caso de no encontrarlo imprimir el mensaje:  "Entrevistador no encontrado"


1. Solo se debe continuar en este flujo si el entrevistador fue encontrado. Solicitar a continuación el nuevo nombre, apellido y email, mencionando que se debe apretar Enter para mantener el valor actual. Preguntar si el entrevistador se encuentra activo.**
                    

1. Guardar los datos del entrevistador llamando a la función save de nuestro objeto interviewer.

1. Añadir las pruebas unitarias correspondientes para validar el correcto funcionamiento de la funcionalidad de editar entrevistadores.


## Indicaciones generales

Una vez que hayas terminado  la actividad responde las siguientes preguntas:

**¿Cómo estás creando la prueba para validar que se guardan correctamente los archivos?**

Primero añadimos un registro, posteriormente consultamos ese registro mediante su email o id. Una vez que se comprobó que la información ahí es correcta y existente, hacemos la modificación y consultamos nuevamete para verificar los cambios.

**¿Decidiste probar directamente en los métodos de la clase interviewer o estás probando en el menú?**

Se hizo la prueba en ambos archivos. Primero una prueba para unitaria para saber que cada clase funciona como se espera y posteriormente una en el menú, para comprobar que las clases funcionan de manera conjunta correctamente.

**¿Crees que existe diferencia entre las pruebas hechas directamente a la clase interviewer y las realizadas al menú? ¿Por qué?**

Existe una diferencia en cuanto a las salidas esperadas. Mientras que en la clase inetrviewer se esperan valores muy específicos dependiendo del funcionamiento de la clase, en el menú únicamente se espera saber si la acción se completo y el resultado final.


## ✅ Checklist 

Asegúrate que tu postwork contenga todo lo siguiente, ya que esto se evaluará al término del módulo.

- ✅ El usuario desde terminal puede seleccionar una opción que le permita editar la información de un entrevistador.




- ✅ El usuario podrá seleccionar el entrevistador a editar ingresando su id o su email.




- ✅ El usuario podrá editar todos los campos de un entrevistador.




- ✅ Test que valide que la información contenida en los archivos, después de la edición, sea la correcta.

