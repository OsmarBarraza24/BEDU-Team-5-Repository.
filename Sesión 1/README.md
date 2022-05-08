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
```java

    System.out.println("Seleccione la operacion a realizar:");
    System.out.println("1. Dar de alta un entrevistador");
    System.out.println("2. Consultar un entrevistador");
    System.out.println("3. Modificar un entrevistador");
    System.out.println("4. Salir");
```

2. Dentro de nuestro switch generar el case con valor 3 y llamar a la función modifyInterviewer que crearemos a continuación. (En este caso en particular, se manda a llamar a la función selectInterviewer, que es la que nos permite seleccionar si queremos modificar al interviewer por email o id)
```java

    switch (option) {
                case 1:
                    addInterviewer();
                    break;
                case 2:
                    searchInterviewer();
                    break;
                case 3:
                    selectInterviewer(); //se llama a select Interviewer porque permite seleccionar bajo qué criterio se buscará interviewer.
                    break;
            }
```


3. Crear la función modifyInterviewer solicitar el email del entrevistador y en caso de no encontrarlo imprimir el mensaje:  "Entrevistador no encontrado" 
public void modifyInterviewer(Interviewer interviewer) {
```java
//Esta función permite seleccionar si se utilizará el id o email para buscar al interviewer. Una vez realizada la búsqueda, se llamará a modifyInterviewer.
    public void selectInterviewer(){
        Interviewer interviewer;

        System.out.println("Seleccione el campo por el que desea buscar el entrevistador a modificar: \n1. Email\n2. ID");
        int option = sc.nextInt();
        sc.nextLine();

        if(option == 1) {
            System.out.println("Ingrese el email del entrevistador a modificar:");
            String email = sc.nextLine();
            interviewer = Interviewer.getByEmail(email);
        }else{
            System.out.println("Ingrese el id del entrevistador a modificar:");
            int id = sc.nextInt();
            sc.nextLine();
            interviewer = Interviewer.getById(id);
        }

        modifyInterviewer(interviewer);
    }
```
```java
    //Si la información recibida esta vacía, se muestra el mensaje de "Entrevistador no encontrado"
    if (interviewer != null) {
            ...
        } else {
            System.out.println("Entrevistador no encontrado");
        }
```

4. Solo se debe continuar en este flujo si el entrevistador fue encontrado. Solicitar a continuación el nuevo nombre, apellido y email, mencionando que se debe apretar Enter para mantener el valor actual. Preguntar si el entrevistador se encuentra activo.**
 ```java
    //Si la información recibida no esta vacía, se prosigue con el flujo pidiendo los datos y almacenándolos el variables.
    if (interviewer != null) {
            System.out.println("Entrevistador encontrado:");
            System.out.println(interviewer.toString());

            System.out.println("Ingrese el nuevo nombre del entrevistador: (Enter para mantener actual)");
            String name = sc.nextLine();
            System.out.println("Ingrese el nuevo apellido del entrevistador: (Enter para mantener actual)");
            String lastName = sc.nextLine();
            System.out.println("Ingrese el nuevo email del entrevistador: (Enter para mantener actual)");
            String newEmail = sc.nextLine();
            System.out.println("El entrevistador se encuentra activo? (1=Si/2=No)");
            Boolean isActive = sc.nextInt() == 1;
            sc.nextLine();
            
            ...

        }
```

5. Guardar los datos del entrevistador llamando a la función save de nuestro objeto interviewer.

```java
    //La información se guarda mediante el método 'save' y se muestra en pantalla.
    if (interviewer != null) {
            
            ...
            
            interviewer.save(name, lastName, newEmail, isActive);
            System.out.println(interviewer.toString());

        }
```


6. Añadir las pruebas unitarias correspondientes para validar el correcto funcionamiento de la funcionalidad de editar entrevistadores.
```java
    InterviewerTest.java
```
```java
    @Test // Se compruba que la función de guardar funciona correctamente y guarda o actualiza la infromación.
    public void save() {
        int originalListSize = Interviewer.data.size();
        String expectedLastName = "New";
        Interviewer existingInterviewer = Interviewer.data.get(0);
        System.out.println(Interviewer.data.size());
        existingInterviewer.save("", expectedLastName, "", true);

        int newListSize = Interviewer.data.size();
        System.out.println(Interviewer.data.size());
        int lastInterviewerIndex = newListSize - 1;
        Interviewer latestInterviewer = Interviewer.data.get(lastInterviewerIndex);

        assertEquals(
                originalListSize,
                newListSize,
                "List size should be the same"
        );
        assertEquals(
                expectedLastName,
                latestInterviewer.lastName,
                "Last Name should have been updated"
        );
        assertEquals(
                existingInterviewer.name,
                latestInterviewer.name,
                "Name should have not been updated"
        );
    }
```
![S1_10](https://user-images.githubusercontent.com/77414220/167283859-78a50ccc-b2b9-49cd-800a-a2368d87fb96.PNG)
```java

    @Test //Se comprube que la función de buscar y obtener interviewer por email funciona
    public void getByEmail() {
        Interviewer result = Interviewer.getByEmail(existingInterviewerEmail);

        assertNotNull(result, "Interviewer should be found");
        assertEquals(
                existingInterviewerName,
                result.name,
                "Unexpected Interviewer Name"
        );
        assertEquals(
                existingInterviewerLastName,
                result.lastName,
                "Unexpected Interviewer Last Name"
        );
    }

```
![S1_11](https://user-images.githubusercontent.com/77414220/167283864-3e3f50eb-4fbd-442a-811d-5ad0517a6484.PNG)
```java
    @Test //Se comprube que la función de buscar y obtener interviewer por id funciona
    public void getById() {
        Interviewer result = Interviewer.getById(1);

        assertNotNull(result, "Interviewer should be found");
        assertEquals(
                existingInterviewerName,
                result.name,
                "Unexpected Interviewer Name"
        );
        assertEquals(
                existingInterviewerLastName,
                result.lastName,
                "Unexpected Interviewer Last Name"
        );
    }
```

![S1_12](https://user-images.githubusercontent.com/77414220/167283866-02b13ca0-8a01-4132-9b46-fc2491898c1e.PNG)


```java
    MenuTest.java
```
```java
@Test
    public void modifyInterviewer1(){
        final String interviewerName = "Interviewer Name";
        final String interviewerLastName = "Interviewer Lastname";
        final String interviewerEmail = "interviewer@mail.com";
        final String addNewInterviewerCommand = "1 \n "+ interviewerName + " \n " + interviewerLastName + " \n " + interviewerEmail + " \n 1 \n ";

        final String updateInterviewerName = "update Interviewer Name by email";
        final String updateInterviewerLastName = "update Interviewer Lastname";
        final String updateInterviewerEmail = "updateinterviewer@mail.com";

        final String updateInterviewerCommand = "3 \n " + "1 \n " + interviewerEmail + " \n "+ updateInterviewerName + " \n " + updateInterviewerLastName + " \n " + updateInterviewerEmail + " \n 1 \n 4 \n ";
        provideInput(addNewInterviewerCommand + updateInterviewerCommand);

        Menu.main(new String[0]);
        final String output = getOutput();

        assertTrue(output.contains(updateInterviewerName));
        assertTrue(output.contains(updateInterviewerLastName));
        assertTrue(output.contains(updateInterviewerEmail));
    }
```
![S1_13](https://user-images.githubusercontent.com/77414220/167283962-ed73194b-e19f-46eb-9bff-3c7696b17256.PNG)

```java
    @Test
    public void modifyInterviewer2(){
        final String interviewerName = "Interviewer Name";
        final String interviewerLastName = "Interviewer Lastname";
        final String interviewerEmail = "interviewer@mail.com";
        final String addNewInterviewerCommand = "1 \n "+ interviewerName + " \n " + interviewerLastName + " \n " + interviewerEmail + " \n 1 \n ";

        final String updateInterviewerName = "update Interviewer Name by id";
        final String updateInterviewerLastName = "update Interviewer Lastname";
        final String updateInterviewerEmail = "updateinterviewer@mail.com";

        final String updateInterviewerCommand = "3 \n " + "2 \n 1 \n " + updateInterviewerName + " \n " + updateInterviewerLastName + " \n " + updateInterviewerEmail + " \n 1 \n 4 \n ";
        provideInput(addNewInterviewerCommand + updateInterviewerCommand);

        Menu.main(new String[0]);
        final String output = getOutput();

        assertTrue(output.contains(updateInterviewerName));
        assertTrue(output.contains(updateInterviewerLastName));
        assertTrue(output.contains(updateInterviewerEmail));
    }
```
![S1_14](https://user-images.githubusercontent.com/77414220/167283981-3f9309d7-c747-467c-87bf-ead265f98dc1.PNG)


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

