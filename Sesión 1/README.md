![Cognizant_logo_2022 svg](https://user-images.githubusercontent.com/77414220/167276034-fc9aba50-8b81-4ce6-8da8-db3aea61e87b.png)

# Postwork

## INTEGRANTES DEL EQUIPO

- Osmar Barraza Flores
- Cruz Gil Estrada
- Dalyn Lara Cortes
- Carlos Valdivia Garcia


## 馃幆 OBJETIVOS

Desarrollar funcionalidad adicional a nuestro programa.
A帽adir pruebas unitarias adicionales para probar su funcionalidad.
Aplicar t茅cnicas de dise帽o de pruebas.
Familiarizarse con la herramienta JUNIT.

## 馃殌 DESARROLLO

Durante nuestro work, desarrollamos las primeras funcionalidades de nuestro software de entrevistas  y nos comenzamos a familiarizar con el uso de JUnit. Ahora en este post work continuaremos con el desarrollo del software de entrevistas y exploraremos algunas funcionalidades de JUnit realizando el siguiente ejercicio.

El project manager ha definido como objetivo para este sprint a帽adir las siguientes caracter铆sticas a nuestro sistema actual:
La informaci贸n de los entrevistadores se puede modificar desde terminal.
La definici贸n de hecho (Definition of Done) establece que todo el c贸digo generado debe contar con pruebas unitarias.

1. A帽ade la opci贸n n煤mero 3 al men煤, con el texto: "3. Modificar un entrevistador" 
```java

    System.out.println("Seleccione la operacion a realizar:");
    System.out.println("1. Dar de alta un entrevistador");
    System.out.println("2. Consultar un entrevistador");
    System.out.println("3. Modificar un entrevistador");
    System.out.println("4. Salir");
```

2. Dentro de nuestro switch generar el case con valor 3 y llamar a la funci贸n modifyInterviewer que crearemos a continuaci贸n. (En este caso en particular, se manda a llamar a la funci贸n selectInterviewer, que es la que nos permite seleccionar si queremos modificar al interviewer por email o id)
```java

    switch (option) {
                case 1:
                    addInterviewer();
                    break;
                case 2:
                    searchInterviewer();
                    break;
                case 3:
                    selectInterviewer(); //se llama a select Interviewer porque permite seleccionar bajo qu茅 criterio se buscar谩 interviewer.
                    break;
            }
```


3. Crear la funci贸n modifyInterviewer solicitar el email del entrevistador y en caso de no encontrarlo imprimir el mensaje:  "Entrevistador no encontrado" 
public void modifyInterviewer(Interviewer interviewer) {
```java
//Esta funci贸n permite seleccionar si se utilizar谩 el id o email para buscar al interviewer. Una vez realizada la b煤squeda, se llamar谩 a modifyInterviewer.
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
    //Si la informaci贸n recibida esta vac铆a, se muestra el mensaje de "Entrevistador no encontrado"
    if (interviewer != null) {
            ...
        } else {
            System.out.println("Entrevistador no encontrado");
        }
```

4. Solo se debe continuar en este flujo si el entrevistador fue encontrado. Solicitar a continuaci贸n el nuevo nombre, apellido y email, mencionando que se debe apretar Enter para mantener el valor actual. Preguntar si el entrevistador se encuentra activo.**
 ```java
    //Si la informaci贸n recibida no esta vac铆a, se prosigue con el flujo pidiendo los datos y almacen谩ndolos el variables.
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

5. Guardar los datos del entrevistador llamando a la funci贸n save de nuestro objeto interviewer.

```java
    //La informaci贸n se guarda mediante el m茅todo 'save' y se muestra en pantalla.
    if (interviewer != null) {
            
            ...
            
            interviewer.save(name, lastName, newEmail, isActive);
            System.out.println(interviewer.toString());

        }
```


6. A帽adir las pruebas unitarias correspondientes para validar el correcto funcionamiento de la funcionalidad de editar entrevistadores.
```java
    InterviewerTest.java
```
```java
    @Test // Se compruba que la funci贸n de guardar funciona correctamente y guarda o actualiza la infromaci贸n.
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

    @Test //Se comprube que la funci贸n de buscar y obtener interviewer por email funciona
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
    @Test //Se comprube que la funci贸n de buscar y obtener interviewer por id funciona
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

**驴C贸mo est谩s creando la prueba para validar que se guardan correctamente los archivos?**

Primero a帽adimos un registro, posteriormente consultamos ese registro mediante su email o id. Una vez que se comprob贸 que la informaci贸n ah铆 es correcta y existente, hacemos la modificaci贸n y consultamos nuevamete para verificar los cambios.

**驴Decidiste probar directamente en los m茅todos de la clase interviewer o est谩s probando en el men煤?**

Se hizo la prueba en ambos archivos. Primero una prueba para unitaria para saber que cada clase funciona como se espera y posteriormente una en el men煤, para comprobar que las clases funcionan de manera conjunta correctamente.

**驴Crees que existe diferencia entre las pruebas hechas directamente a la clase interviewer y las realizadas al men煤? 驴Por qu茅?**

Existe una diferencia en cuanto a las salidas esperadas. Mientras que en la clase inetrviewer se esperan valores muy espec铆ficos dependiendo del funcionamiento de la clase, en el men煤 煤nicamente se espera saber si la acci贸n se completo y el resultado final.


## 鉁? Checklist 

Aseg煤rate que tu postwork contenga todo lo siguiente, ya que esto se evaluar谩 al t茅rmino del m贸dulo.

- 鉁? El usuario desde terminal puede seleccionar una opci贸n que le permita editar la informaci贸n de un entrevistador.




- 鉁? El usuario podr谩 seleccionar el entrevistador a editar ingresando su id o su email.




- 鉁? El usuario podr谩 editar todos los campos de un entrevistador.




- 鉁? Test que valide que la informaci贸n contenida en los archivos, despu茅s de la edici贸n, sea la correcta.

