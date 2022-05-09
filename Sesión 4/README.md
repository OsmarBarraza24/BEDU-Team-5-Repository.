![Cognizant_logo_2022 svg](https://user-images.githubusercontent.com/77414220/167276034-fc9aba50-8b81-4ce6-8da8-db3aea61e87b.png)

# Postwork

## INTEGRANTES DEL EQUIPO

- Osmar Barraza Flores
- Cruz Gil Estrada
- Dalyn Lara Cortes
- Carlos Valdivia Garcia

## 🎯 OBJETIVOS

- Implementar pruebas de caja negra
- Implementar pruebas de caja blanca

## 🚀 DESARROLLO

Continuaremos con el desarrollo del software de entrevistadores y exploramos las pruebas de caja negra y blanca realizando el siguiente ejercicio:

- Añadir las pruebas de casos uso generadas durante el Reto 1
- Diseñar posibles pruebas de caja blanca para el código 
- Debemos generar pruebas de caja negra y blanca según corresponda


### Sigue estas instrucciones:

1. Durante el reto 1 creamos los casos de uso y sus especificaciones par acumplir con la historia de usuario: añadir entrevistadores
2. En tu archivo de pruebas añade las pruebas correspondientes para validar que se cumplan los criterios de aceptación
3. Modifica el código de alta de entrevistadores de ser necesario
4. Repetir los pasos 2 y 3 hasta que todos los criterios de aceptación sean validados con al menos una prueba y todo tus pruebas pasen.

#### Caso de Uso

  Precondiciones:

      El usuario cuenta con persisos de administrador

  Actor:

      Usuario administrador

  Input:

      name (string al menos 3 caracteres)
      last_name (string al menos 3 caracteres)
      email (string de n caracteres)

  Output:

      intervieewr_id

  Flow:

      1. Crear el intervieewr correspondiente
          1.1 Validar el email
              1.1.1 Si el email es invalido lanzar la excepción InvalidEmail
          1.2 Crear la nueva instacia d ela clase Interviewer
          1.4 Guardar la entidad
          1.5 Responder con el id del nuevo entrevistador
      2.Enviar la respuesta
#### Precondicion
Se implementó el método de login para verificar si el usuario es administrador o no. Se definieron las credenciales de admin por default para esta prueba.
```java
  public void loginMenu(){
        System.out.println("Ingrese su usuario:");
        String user = sc.nextLine();
        System.out.println("Ingrese su contraseña:");
        String password = sc.nextLine();

        if(user.equals("admin") && password.equals("admin1")) {
            showMainMenu();
        }
        else
            showUserMenu();
    }
```
Existen dos tipos de menu, showMainMenu() permite visualizar todas las opciones disponibles y showUserAdmin únicamente permite visualizar entrevistadores y salir.
```java
  public void showUserMenu() {
        System.out.println("Bienvenido al menu de usuario");

        int option = 0;

        while (option != 2) {
            System.out.println("Seleccione la operacion a realizar:");
            System.out.println("1. Consultar un entrevistador");
            System.out.println("2. Salir");

            option = sc.nextInt();
            sc.nextLine();

                switch (option) {
                    case 1:
                        searchInterviewer();
                        break;
                }
        }
        ;
        System.out.println("Programa terminado");
    }
```
```java
    public void showMainMenu() {
        System.out.println("Bienvenido al menu de administrador");

        int option = 0;

        while (option != 5) {
            System.out.println("Seleccione la operacion a realizar:");
            System.out.println("1. Dar de alta un entrevistador");
            System.out.println("2. Consultar un entrevistador");
            System.out.println("3. Modificar un entrevistador");
            System.out.println("4. Eliminar un entrevistador");
            System.out.println("5. Salir");

            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    addInterviewer();
                    break;
                case 2:
                    searchInterviewer();
                    break;
                case 3:
                    selectInterviewer();
                    break;
                case 4:
                    deleteInterviewer();
                    break;
            }
        }
```

#### Validación de datos
En el caso de uso se indica que el nombre, apellido y email deben pasar por una validación. La clase Validation permite realizar este proceso, cumpliendo con los criterios anteriormente expuestos.

```java
  public class Validation {
      
      //Función que valida que el nombre y apellido tengan una longitud mayor a 3, además de que no contengan números.
      public boolean validateName_LastName(String validate){
          if(validate.length() > 3){
              if(validate.matches("[a-zA-Z ]*"))
                  return true;
              else {
                  System.out.println("Nombre incorrecto. Ingrese un nombre sin números.");
                  return false;
              }
          }
          System.out.println("El nombre es demasiado corto.");
          return false;
      }
      
      //Función que valida que el email cumpla con el formato especificado y no sea un string vacio.
      public boolean validateEmail(String email){
          String pattern = "^[A-Za-z0-9+_.-]+@(.+)$";
          if(!email.isEmpty()){
              if(email.matches(pattern))
                  return true;
              else {
                  System.out.println("El formato del email es incorrecto.");
                  return false;
              }
          }

          return false;

      }

  }

```
#### Output
Si las validaciones se cumplen, se debe agregar un nuevo entrevistador.

#### Posibles pruebas de caja negra
Un posible set de pruebas de caja negra sería el aplicado al set de validación, pues conociendo la estructura del código, se espera un valor de retorno true o false, dependiendo de las condiciones. Este test se aplicará únicamente en la clase de validación si integrar ninguna otra clase.
```java
public class validationTest {
    @BeforeEach
    public void setUp() {

    }

    @Test
    public void validateWrongName(){

        Validation result = new Validation();
        assertEquals(false,result.validateName_LastName("Na"));
        assertEquals(false,result.validateName_LastName("-Name"));
        assertEquals(false,result.validateName_LastName("Na90"));
        assertEquals(false,result.validateName_LastName("_Na_"));
    }

    @Test
    public void validateCorrectName(){

        Validation result = new Validation();
        assertEquals(true,result.validateName_LastName("Name"));
        assertEquals(true,result.validateName_LastName("Name secondName"));
    }

    @Test
    public void validateCorrectEmail(){
        Validation result = new Validation();

        assertEquals(true,result.validateEmail("test@test.com"));
        assertEquals(true,result.validateEmail("test_test@test.com"));
        assertEquals(true,result.validateEmail("test00@test.com"));
    }

    @Test
    public void validateIncorrectEmail(){
        Validation result = new Validation();

        assertEquals(false,result.validateEmail("testtest.com"));
        assertEquals(false,result.validateEmail("testtest@"));
        assertEquals(false,result.validateEmail("@test.com"));
    }

    @Test
    public void validateEmptyEmail(){
        final String expectedEmail = "";

        Validation result = new Validation();
        assertEquals(false,result.validateEmail(expectedEmail));
    }
}
```
![S4_3](https://user-images.githubusercontent.com/77414220/167494308-e394a464-6450-4975-aabf-64933a21b9fe.PNG)

Otro posible set de pruebas es el aplicado en la clase Interviewer, pues se aplicaría únicamente sobre la clase Interviewer y se esperan outputs especificos dependiendo de las condiciones.
```java
public class InterviewerTest {
    static String existingInterviewerName = "First";
    static String existingInterviewerLastName = "User";
    static String existingInterviewerEmail =  "first@email.com";

    @BeforeEach
    public void setUp() {
        Interviewer.data = new ArrayList<Interviewer>();

        Interviewer.data.add(new Interviewer(
                existingInterviewerName,
                existingInterviewerLastName,
                existingInterviewerEmail,
                true
        ));
    }

    @Test
    public void add() {
        System.out.println("iniciado prueba");

        Interviewer interviewer = new Interviewer("Test", "User", "mail@email.com", true);

        interviewer.add();

        int expectedId = Interviewer.data.size();
        assertEquals(expectedId, interviewer.id,"New interviewer ID should be the new List's size" );
    }


    @Test
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

        assertEquals(originalListSize,newListSize,"List size should be the same");
        assertEquals(expectedLastName,
                latestInterviewer.lastName,
                "Last Name should have been updated"
        );
        assertEquals(
                existingInterviewer.name,
                latestInterviewer.name,
                "Name should have not been updated"
        );
    }


    @Test
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

    @Test
    public void deleteByEmail() {
        Interviewer interviewer = new Interviewer("Test", "User", "mail@email.com", true);
        interviewer.add();
        interviewer.deleteInterviewer("mail@email.com");

        assertNotNull("Interviewer has been deleted");
        assertEquals("Interviewer has been deleted","Interviewer has been deleted");

        interviewer.deleteInterviewer("mail@email.com");
        assertNotNull("Interviewer not found");
    }

    @Test
    public void getByNonExistingEmail() {
        String nonExistingEmail = "nonexisting@email.com";

        Interviewer result = Interviewer.getByEmail(nonExistingEmail);

        assertNull(result, "Interviewer should not be found");
    }
}
```
![S4_2](https://user-images.githubusercontent.com/77414220/167494334-57596bb5-a452-4f25-bf12-6b2ff9317431.PNG)

#### Posibles pruebas de caja blanca
Se considera como una posible prueba de caja blanca al test implementado en Menu, pues lo que se testea es el flujo del programa y se espera recibir determinados output según las entradas que se introduzcan.
```java
public class MenuTest {
    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;

    private ByteArrayInputStream testIn;
    private ByteArrayOutputStream testOut;

    private final String login ="admin\nadmin1\n";

    @BeforeEach
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    private void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }


    private String getOutput() {
        return testOut.toString();
    }

    @AfterEach
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }

    @Test
    public void menuAdmin(){
        final String user = "admin";
        final String password = "admin1";
        final String menu = user + "\n" + password + "\n 5 \n ";
        final String expectedOutput = "Bienvenido al menu de administrador";

        provideInput(menu);

        Menu.main(new String[0]);
        final String output = getOutput();

        assertTrue(output.contains(expectedOutput));

    }

    @Test
    public void menuUser(){
        final String menu = "x \n x \n 2 \n";
        final String expectedOutput = "Bienvenido al menu de usuario";

        provideInput(menu);

        Menu.main(new String[0]);
        final String output = getOutput();
        assertTrue(output.contains(expectedOutput));
    }

    @Test
    public void menuAdminAdd(){
        final String user = "admin";
        final String password = "admin1";
        final String correctName = "Pepe";
        final String correctLastName = "Sanchez";
        final String correctEmail = "pp@mymail.com";
        final int isActive = 1;
        final String menu = login+"1 \nPp\n " + correctName + "\nSa\n"+ correctLastName +"\nmp\n" + correctEmail + " \n "+isActive+" \n 2 \n" + correctEmail + " \n 5 \n ";
        final String expectedOutput = "Bienvenido al menu de administrador";
        final String expectedOutput1 = "El nombre es demasiado corto.";
        final String expectedOutput2 = "El formato del email es incorrecto.";
        final String expectedOutput3 = "Entrevistador añadido";

        provideInput(menu);

        Menu.main(new String[0]);
        final String output = getOutput();

        assertTrue(output.contains(expectedOutput));
        assertTrue(output.contains(expectedOutput1));
        assertTrue(output.contains(expectedOutput2));
        assertTrue(output.contains(expectedOutput3));

    }

    @Test
    public void addNewInterviewer() {
        final String interviewerName = "Interviewer Name";
        final String interviewerLastName = "Interviewer Lastname";
        final String interviewerEmail = "interviewer@email.com";
        final String addNewInterviewerCommand = login+"1 \n "+ interviewerName + " \n " + interviewerLastName + " \n" + interviewerEmail + "\n 1 \n 5 \n";
        provideInput(addNewInterviewerCommand);

        Menu.main(new String[0]);
        final String output = getOutput();

        assertTrue(output.contains(interviewerName));
        assertTrue(output.contains(interviewerLastName));
        assertTrue(output.contains(interviewerEmail));
    }


    @Test
    public void getInterviewer () {
        final String interviewerName = "Interviewer Name";
        final String interviewerLastName = "Interviewer Lastname";
        final String interviewerEmail = "interviewer@mail.com";
        final String addNewInterviewerCommand = login+"1 \n "+ interviewerName + " \n " + interviewerLastName + " \n" + interviewerEmail + "\n 1 \n";
        final String getInterviewerCommand = "2 \n" + interviewerEmail + "\n ";
        final String exitCommand = "5 \n";
        provideInput(addNewInterviewerCommand + getInterviewerCommand + exitCommand);

        Menu.main(new String[0]);
        final String output = getOutput();

        assertTrue(output.contains(interviewerName));
        assertTrue(output.contains(interviewerLastName));
        assertTrue(output.contains(interviewerEmail));
    }

    @Test
    public void modifyInterviewer1(){
        final String interviewerName = "Interviewer Name";
        final String interviewerLastName = "Interviewer Lastname";
        final String interviewerEmail = "interviewer@mail.com";
        final String addNewInterviewerCommand = login+"1 \n "+ interviewerName + " \n " + interviewerLastName + " \n" + interviewerEmail + "\n 1 \n ";

        final String updateInterviewerName = "update Interviewer Name by email";
        final String updateInterviewerLastName = "update Interviewer Lastname";
        final String updateInterviewerEmail = "updateinterviewer@mail.com";

        final String updateInterviewerCommand = "3 \n " + "1 \n" + interviewerEmail + "\n"+ updateInterviewerName + " \n " + updateInterviewerLastName + " \n" + updateInterviewerEmail + "\n 1 \n 5 \n ";
        provideInput(addNewInterviewerCommand + updateInterviewerCommand);

        Menu.main(new String[0]);
        final String output = getOutput();

        assertTrue(output.contains(updateInterviewerName));
        assertTrue(output.contains(updateInterviewerLastName));
        assertTrue(output.contains(updateInterviewerEmail));
    }
    @Test
    public void modifyInterviewer2(){
        final String interviewerName = "Interviewer Name";
        final String interviewerLastName = "Interviewer Lastname";
        final String interviewerEmail = "interviewer@mail.com";
        final String addNewInterviewerCommand = login+"1 \n "+ interviewerName + " \n " + interviewerLastName + " \n" + interviewerEmail + "\n 1 \n ";

        final String updateInterviewerName = "update Interviewer Name by id";
        final String updateInterviewerLastName = "update Interviewer Lastname";
        final String updateInterviewerEmail = "updateinterviewer@mail.com";

        final String updateInterviewerCommand = "3 \n " + "2 \n 1 \n " + updateInterviewerName + " \n " + updateInterviewerLastName + " \n" + updateInterviewerEmail + "\n 1 \n 5 \n ";
        provideInput(addNewInterviewerCommand + updateInterviewerCommand);

        Menu.main(new String[0]);
        final String output = getOutput();

        assertTrue(output.contains(updateInterviewerName));
        assertTrue(output.contains(updateInterviewerLastName));
        assertTrue(output.contains(updateInterviewerEmail));
    }

    @Test
    public void eliminateInterviewer(){
        final String interviewerName = "Interviewer Name";
        final String interviewerLastName = "Interviewer Lastname";
        final String interviewerEmail = "interviewer@mail.com";
        final String addNewInterviewerCommand = login+"1 \n "+ interviewerName + " \n " + interviewerLastName + " \n" + interviewerEmail + "\n 1 \n ";

        final String deleteInterviewerCommand = "4 \n" + interviewerEmail + "\n 5 \n ";
        final String outputExpected = "Interviewer has been deleted";

        provideInput(addNewInterviewerCommand + deleteInterviewerCommand);

        Menu.main(new String[0]);
        final String output = getOutput();

        assertTrue(output.contains(outputExpected));
    }
}
```
Durante esta actividad en específico, lo que importa validar es que el usuario sea administrador y que los valores sean correctos, lo cual se refleja en la siguiente prueba:
```java
@Test
    public void menuAdminAdd(){
        final String user = "admin";
        final String password = "admin1";
        final String correctName = "Pepe";
        final String correctLastName = "Sanchez";
        final String correctEmail = "pp@mymail.com";
        final int isActive = 1;
        final String menu = login+"1 \nPp\n " + correctName + "\nSa\n"+ correctLastName +"\nmp\n" + correctEmail + " \n "+isActive+" \n 2 \n" + correctEmail + " \n 5 \n ";
        final String expectedOutput = "Bienvenido al menu de administrador";
        final String expectedOutput1 = "El nombre es demasiado corto.";
        final String expectedOutput2 = "El formato del email es incorrecto.";
        final String expectedOutput3 = "Entrevistador añadido";

        provideInput(menu);

        Menu.main(new String[0]);
        final String output = getOutput();

        assertTrue(output.contains(expectedOutput));
        assertTrue(output.contains(expectedOutput1));
        assertTrue(output.contains(expectedOutput2));
        assertTrue(output.contains(expectedOutput3));

    }
```
![S4_1](https://user-images.githubusercontent.com/77414220/167494389-90a29603-88c2-439a-8427-14878f799439.PNG)


### Indicaciones generales

¿Terminaste la actividad? responde las siguientes preguntas:

**¿Cuál es la principal diferencia que notas entre tus pruebas de caja negra y blanca?**

En las pruebas de caja negra, lo que se busca es validar el correcto funcionamiento del módulo o función a traves de la obtención de valores de retorno específicos u outputs según las condiciones, siempre conociendo la estrcutura del código. 
Por su parte, las pruebas de caja blanca buscan validar un flujo, u obtener determinados outputs según los inputs que se proporcionen.

**¿Qué ventajas consideras que tienen unas sobre las otras?**

Las pruebas de caja negra permiten validar el funcionamiento de los distintos módulos o funciones contenidas en un programa, asegurando así la funcionalidad lógica. Por su parte, las pruebas de caja blanca permiten validar que el programa funcione desde la perspectiva del usuario, garantizando así su correcto funcionamiento.

**¿Crees que existe alguna desventaja de contar solo con pruebas de caja negra?**

Sí, pues si las pruebas únicamente validan la funcionalidad de los componentes individuales, es posible que al integrarlos se produzca algún error por las entradas o salidas, y el resultado presentado al usuario podría ser erróneo, aunque también es posible considerar que el flujo del programa sea el equivocado.


✅ Checklist 

Asegúrate que tu postwork contenga todo lo siguiente, ya que esto se evaluará al término del módulo.


- ✅ Todos tus criterios de aceptación cuentan con una prueba que los valida




- ✅ Todas tus pruebas pasan




- ✅ Utilizaste pruebas de caja blanca o negra según corresponda.
