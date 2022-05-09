>![Cognizant_logo_2022 svg](https://user-images.githubusercontent.com/77414220/167276034-fc9aba50-8b81-4ce6-8da8-db3aea61e87b.png)

# Postwork

## INTEGRANTES DEL EQUIPO

- Osmar Barraza Flores
- Cruz Gil Estrada
- Dalyn Lara Cortes
- Carlos Valdivia Garcia

## 🎯 OBJETIVOS

- Desarrollar un programa siguiendo las reglas de TDD.
- Añadir pruebas unitarias adicionales para probar su funcionalidad.
- Familiarizarse con TDD.
- Identificar el impacto de la premisa de transformación elegida en el resultado final

## 🚀 DESARROLLO

- Implementar el algoritmo de ordenamiento bubble sort, desglosando el desarrollo y siguiendo las reglas de
  transformaciones vistas durante la sesión

- Añade un caso de prueba, ejecutalo y comprueba que falla.

- Implementa el código mínimo necesario para que dicha prueba pase

- Aplica las premisas de transformación de ser necesario.

- Refactoriza el código si lo consideras necesario.

- Documenta (captura de pantalla, código, etc) el estado final de tus pruebas y tu código al final de cada ciclo.

Tip: La clave para derivar en un algoritmo menos eficiente es utilizar una transformación de menor orden, en el caso
particular de un bucle sort en lugar de un quicksort, dicha clave es transformar utilizando un asignación en lugar de
preferir el cómputo/lógica.

### Sigue estas instrucciones:

1. Crea un nuevo archivo llamado BubbleSortTest.java
1. Crea un nuevo archivo llamado BubbleSort.java
1. Añade el primer caso de prueba para un arreglo vacío
1. Implementar el código mínimo necesario para pasar este caso de uso
1. Refactoriza el código de ser necesario
1. Aplica las transformaciones que sean necesarias
1. Repite los pasos del 3 al 6 hasta completar los casos de prueba vistos durante el work.

### Desarrollo Bubble Sort

Se crea la clase BubbleSort con el método sorter vacio y BubbleSortTest, el cual prueba el envío de un arreglo vacío a la funcion sorter. Se ejecuta la prueba esperando falla en el resultado.
<!-- >![2](https://user-images.githubusercontent.com/103444882/167027374-ef41c491-d7af-4515-86cf-a5c7f8ee2b82.png) -->
><img src="https://user-images.githubusercontent.com/103444882/167027374-ef41c491-d7af-4515-86cf-a5c7f8ee2b82.png" width="200" height="200" />
>
<!-- >![3](https://user-images.githubusercontent.com/103444882/167027377-54d0a6e2-330e-42a1-b6da-0ac8a0da6a31.png) -->
><img src="https://user-images.githubusercontent.com/103444882/167027377-54d0a6e2-330e-42a1-b6da-0ac8a0da6a31.png" width="600" height="300" />


![p1](https://user-images.githubusercontent.com/77414220/167030989-e6ecd983-5800-4bff-b8f9-5cfb1a6ac781.PNG)

Se ha encontrado la falla, por lo que se agrega el primer bloque de código para pasar el test.
<!-- >![4](https://user-images.githubusercontent.com/103444882/167027378-68ff2c59-d3fe-4dda-8543-e2992592c24d.png) -->
><img src="https://user-images.githubusercontent.com/103444882/167027378-68ff2c59-d3fe-4dda-8543-e2992592c24d.png"  width="600" height="300"   />

Se ejecuta nuevamente la prueba, la cual pasa esta vez.

![p2](https://user-images.githubusercontent.com/77414220/167031066-aec20256-47d1-45a6-b611-d0fa36a307a1.PNG)

Se agrega la segunda prueba, se ejecuta y se espera la falla nuevamente.
<!-- >![5](https://user-images.githubusercontent.com/103444882/167027379-53e2319b-99dd-4d00-9df0-65485715149b.png) -->
><img src="https://user-images.githubusercontent.com/103444882/167027379-53e2319b-99dd-4d00-9df0-65485715149b.png"  width="600" height="300"   />
![p3](https://user-images.githubusercontent.com/77414220/167031460-765666f0-fe80-41f5-ba7e-c6402e3fcba9.PNG)

Se agrega el nuevo bloque de código que resolverá la falla del test anterior. Se ejecuta y se espera que pase la prueba esta vez.

<!-- >![6](https://user-images.githubusercontent.com/103444882/167027389-1066f977-8f1a-476c-a125-f72fa9ea6e37.png) -->
><img src="https://user-images.githubusercontent.com/103444882/167027389-1066f977-8f1a-476c-a125-f72fa9ea6e37.png"  width="600" height="300"   />

![p4](https://user-images.githubusercontent.com/77414220/167031485-5f82fbca-a781-4613-bc6b-04c5c1408fe1.PNG)

Se agrega una tercera prueba, se ejecuta y pasa el test. 
<!-- >![7](https://user-images.githubusercontent.com/103444882/167027390-bb72b05e-14eb-473e-959a-e133b3ce829d.png) -->
><img src="https://user-images.githubusercontent.com/103444882/167027390-bb72b05e-14eb-473e-959a-e133b3ce829d.png"  width="600" height="300"   />

![p5](https://user-images.githubusercontent.com/77414220/167031578-ac33110d-6223-459f-97a5-6587322777c3.PNG)

Se agrega un nuevo test y se ejecuta la prueba, esperando que falle.

<!-- >![8](https://user-images.githubusercontent.com/103444882/167027392-fcea7139-2271-417b-a5f3-70627f2e1a84.png) -->
><img src="https://user-images.githubusercontent.com/103444882/167027392-fcea7139-2271-417b-a5f3-70627f2e1a84.png"  width="600" height="300"   />

![p6](https://user-images.githubusercontent.com/77414220/167031603-20952780-1d0e-43b9-b93f-cef22fde65d4.PNG)

Se agrega el bloque de código que permite pasar la nueva prueba, así como las anteriores.

<!-- >![9](https://user-images.githubusercontent.com/103444882/167027394-311d6278-62e9-455d-9787-3b5ac11b13b9.png) -->
><img src="https://user-images.githubusercontent.com/103444882/167027394-311d6278-62e9-455d-9787-3b5ac11b13b9.png"  width="600" height="300"   />

![p7](https://user-images.githubusercontent.com/77414220/167031632-2214a3b9-deae-47d0-9739-f0fbc285b55e.PNG)

Se agrega una prueba más, la cual se ejecuta y pasa el test.
![p8](https://user-images.githubusercontent.com/77414220/167032286-a14367ee-b73f-4577-a13d-7ccaa0e44e2f.PNG)

En vista de que la prueba anterior paso, se agrega una prueba más, esta vez con tres elementos, esperando que falle.
<!-- >![11](https://user-images.githubusercontent.com/103444882/167027399-22a9f536-40bd-4817-a36f-ebddd77b52ae.png) -->
><img src="https://user-images.githubusercontent.com/103444882/167027399-22a9f536-40bd-4817-a36f-ebddd77b52ae.png"  width="600" height="300"   />

La prueba ha fallado, por lo que se agruega el bloque de código que permite que el test pase. Se realiza el test nuevamente y esta vez pasa.
![p9](https://user-images.githubusercontent.com/77414220/167032350-8586d283-32bf-4452-813c-37b728b31aae.PNG)

Se agrega una prueba más, esperando que falle.
<!-- >![12](https://user-images.githubusercontent.com/103444882/167027405-3a6744b3-9726-4a5d-b096-49158fa83060.png) -->
><img src="https://user-images.githubusercontent.com/103444882/167027405-3a6744b3-9726-4a5d-b096-49158fa83060.png"  width="600" height="300"   />

![p10](https://user-images.githubusercontent.com/77414220/167032462-faaae033-3244-4cd8-9d9d-6b2857a66b6f.PNG)

Nuevamente, se modifica el código para permitir que pase la nueva prueba. Se ejecuta el test nuevamente y esta vez pasa.
<!-- >![13](https://user-images.githubusercontent.com/103444882/167027408-8f0fed0a-c08d-43d8-b565-5dac794eb287.png) -->
><img src="https://user-images.githubusercontent.com/103444882/167027408-8f0fed0a-c08d-43d8-b565-5dac794eb287.png"  width="600" height="300"   />
>

![p11](https://user-images.githubusercontent.com/77414220/167032477-3f569e0f-a860-4250-94ab-38e5bf6a18aa.PNG)

Se añade una prueba más, y se ejecuta el test, el cual falla.
<!-- >![14](https://user-images.githubusercontent.com/103444882/167027414-8bfa5e16-862d-494a-8eb1-48897b115ae5.png) -->
><img src="https://user-images.githubusercontent.com/103444882/167027414-8bfa5e16-862d-494a-8eb1-48897b115ae5.png"  width="600" height="300"   />

![p12](https://user-images.githubusercontent.com/77414220/167033027-737811e6-a08f-4afb-90c7-9d924129e61f.PNG)

Se añade el código que permite que esta prueba pase exitosamente.
<!-- >![15](https://user-images.githubusercontent.com/103444882/167027416-10643b39-b53f-4c07-884b-e470aa6d2aac.png) -->
><img src="https://user-images.githubusercontent.com/103444882/167027416-10643b39-b53f-4c07-884b-e470aa6d2aac.png"  width="600" height="300"   />

![p13](https://user-images.githubusercontent.com/77414220/167033212-275fa941-98ba-412f-b814-f8c0bf75f425.PNG)

Se añade una prueba más, y se ejecuta el test, el cual falla.

<!-- >![16](https://user-images.githubusercontent.com/103444882/167027420-756b290f-3244-4636-bc1f-d21624932fca.png) -->
><img src="https://user-images.githubusercontent.com/103444882/167027420-756b290f-3244-4636-bc1f-d21624932fca.png"  width="600" height="300"   />
![p14](https://user-images.githubusercontent.com/77414220/167033337-78a323e7-70ea-4dc3-82f6-37eba9e7d4e7.PNG)

Se añade una prueba más, esta vez con cuatro elementos. La prueba se ejecuta, y pasa. Se agrega una prueba más esperando que falle, y falla.
<!-- >![17](https://user-images.githubusercontent.com/103444882/167027703-bf8d80de-da3c-4d5b-9663-e33acc283ef9.png) -->
><img src="https://user-images.githubusercontent.com/103444882/167027703-bf8d80de-da3c-4d5b-9663-e33acc283ef9.png"  width="600" height="300"   />

![p15](https://user-images.githubusercontent.com/77414220/167033353-efe65e05-b9f6-47cc-aa53-95b694c63ce7.PNG)

Los casos se han vuelto muy específicos, por lo que ha llegado el momento de refactorizar el código. Se ejecuta la prueba y pasa.
<!-- >![18](https://user-images.githubusercontent.com/103444882/167030112-51827a2e-0e03-4e03-94fe-01d6227c7441.png) -->
><img src="https://user-images.githubusercontent.com/103444882/167030112-51827a2e-0e03-4e03-94fe-01d6227c7441.png"  width="600" height="300"   />


<!-- >![19](https://user-images.githubusercontent.com/103444882/167030117-5a026e41-bde4-4eda-8d99-6edd23ea0689.png) -->
><img src="https://user-images.githubusercontent.com/103444882/167030117-5a026e41-bde4-4eda-8d99-6edd23ea0689.png"  width="600" height="400"   />


![p16](https://user-images.githubusercontent.com/77414220/167033366-376952d0-4f8a-4412-bf9d-8365a04d22c6.PNG)

### Desarrollo QuickSort

### Indicaciones generales

¿Terminaste la actividad? Responde las siguientes preguntas:

¿Cuál fue el paso clave para poder transicionar de un bubble sort a un quicksort?
_________________________________________________________________________________________________________________________________________________________________________________________________________________________________
¿Crees que fue más fácil implementar un quicksort de esta forma que hacerlo sin pruebas? ¿Por qué?
_________________________________________________________________________________________________________________________________________________________________________________________________________________________________

¿Crees que existe diferencia entre las pruebas realizadas para un bubble sort y un quicksort?
_________________________________________________________________________________________________________________________________________________________________________________________________________________________________


## ✅ Checklist

Asegúrate que tu postwork contenga todo lo siguiente, ya que esto se evaluará al término del módulo.

- [ ] Tú implementación del algoritmo bubble sort funciona correctamente


- [ ] Seguiste un proceso de TDD para su desarrollo


- [ ] Documentaste cada paso del desarrollo








































>

