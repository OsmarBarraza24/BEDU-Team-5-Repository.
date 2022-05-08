![Cognizant_logo_2022 svg](https://user-images.githubusercontent.com/77414220/167276034-fc9aba50-8b81-4ce6-8da8-db3aea61e87b.png)

# Postwork

## INTEGRANTES DEL EQUIPO

- Osmar Barraza Flores
- Cruz Gil Estrada
- Dalyn Lara Cortes
- Carlos Valdivia Garcia

## 🎯 OBJETIVOS

- Añadir la funcionalidad de resta a la clase SomeBusinessLogic
- Añadir pruebas con inyección de mocks.
- Familiarizarse con las herramientas de mockito.

## 🚀 DESARROLLO

Durante nuestro work, desarrollamos algunas funcionalidades en la clase SomeBusinessLogic y comenzamos a familiarizarnos con el uso de Mockito. Ahora en este post work continuaremos con el desarrollo de esta clase y exploraremos algunas funcionalidades de Mockito realizando el siguiente ejercicio:

- Añade la funcionalidad de restar en la clase SomeBusinessLogic
- El método debe utilizar SomeDataService
- Debemos probar al menos 3 casos: con un arreglo de múltiples números, con un arreglo vacío y con un arreglo de un solo número
- Implementa los mocks con múltiples valores de retorno: Mas información: https://dev.to/srinivasu619/mockito-returning-a-different-value-for-the-same-function-invocation-434c 
- Explora las posibilidades de utilizar mocks que regresan valores específicos de acuerdo a los parámetros que reciben.


Sigue estas instrucciones:

1. En el archivo SomeBusinessLogic.java  añade una función llamada calculateSubstractionWithADataService
1. Para su implementación basate en lo realizado con calculateSumWithADataService
1. En el archivo SomeBusinessLogicMockTest.java crea tres metodos con los siguientes nombres: calculateSubstractionUsingDataService_basic, calculateSubstractionUsingDataService_empty y calculateSubstracionUsingDataService_oneValue
1. Implementa los mocks con múltiples valores de retorno: Mas información: https://dev.to/srinivasu619/mockito-returning-a-different-value-for-the-same-function-invocation-434c 


### Indicaciones generales

¿Terminaste la actividad? Responde las siguientes preguntas:

**¿Cómo decidiste inyectar el mock?**
_________________________________________________________________________________________________________________________________________________________________________________________________________________________________
**¿Implementaste un solo método de prueba con múltiples valores de retorno o implementaste múltiples pruebas? ¿Por qué?**

Implementamos una prueba por cada caso y al final una prueba con múltiples valores para comprender mejor el funcionamiento

**¿Crees que existe diferencia entre los mocks que inyectamos manualmente y los inyectados con mockito? ¿Cuáles?**

La diferencia principal es la cantidad de esfuerzo y código implementado para las pruebas, pues con Mockito se ahorran líneas de código y tiempo.

¡Mucho éxito y reta tu potencial!


## ✅ Checklist 

Asegúrate que tu postwork contenga todo lo siguiente, ya que esto se evaluará al término del módulo.


- ✅ Existe la funcionalidad de restar en la clase SomeBusinessLogic




- ✅ La funcionalidad de restar utiliza SomeDataService




- ✅ Existen pruebas para al menos 3 casos de uso:  con un arreglo de múltiples números, con un arreglo vacío y con un arreglo de un solo número
