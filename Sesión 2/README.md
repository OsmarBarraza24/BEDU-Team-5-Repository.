![Cognizant_logo_2022 svg](https://user-images.githubusercontent.com/77414220/167276034-fc9aba50-8b81-4ce6-8da8-db3aea61e87b.png)

# Postwork

## INTEGRANTES DEL EQUIPO

- Osmar Barraza Flores
- Cruz Gil Estrada
- Dalyn Lara Cortes
- Carlos Valdivia Garcia


### 🎯 OBJETIVOS

- Pasar de modelos de datos abstractos (representaciones gráficas), a implementaciones concretas (clases)
- Aplicar conceptos de reutilización de código
- Añadir pruebas unitarias adicionales para probar su funcionalidad
- Aplicar técnicas de diseño de pruebas 
- Familiarizarse con la herramienta JUNIT.

### 🚀 DESARROLLO

Siguiendo con el desarrollo de nuestro software, ahora añadiremos los modelos (clases) definidos en el Reto 2.

Adicionalmente tenemos que crear pruebas que validen el correcto funcionamiento de nuestro software.

El project manager ha definido como objetivo para este sprint añadir las siguientes características a nuestro sistema actual:

- Crear las clases correspondientes a los siguientes modelos:
  - Modelo Interviewer
  - Modelo Candidate
  - Modelo Interview Type
  - Modelo Technology
  - Modelo Discipline

![image](https://user-images.githubusercontent.com/77414220/167499217-09bc1425-90a4-4195-9706-58a6a6c9fa5f.png)

La definición de hecho (Definition of Done) establece que todo el código generado debe contar con las pruebas unitarias necesarias para validar su correcto funcionamiento.

1. Dentro de tu paquete principal crea las siguientes clases

1. Crear la clase correspondiente al modelo Candidate

1. Crear la clase correspondiente al modelo Interview Type

1. Crear la clase correspondiente al modelo Interview

1. Crear la clase correspondiente al modelo Technology

1. Crear la clase correspondiente al modelo Discipline

1. Añade las pruebas que consideres necesarias

#### Creación de las clases y test correspondientes.
![S2_1](https://user-images.githubusercontent.com/77414220/167499407-5a4c49c7-c43a-4185-81c2-59b552bc34c6.PNG)

#### Clases
``` Candidate ```

```java
public class Candidate implements Serializable {
    static ArrayList<Candidate> data;

    int id;
    String name;
    String lastName;
    String email;
    Boolean isActive;

    public Candidate(
            String name,
            String lastName,
            String email,
            Boolean isActive
    ) {
        this.id = data.size() + 1;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.isActive = isActive;
    }

    public Candidate(
            int id,
            String name,
            String lastName,
            String email,
            Boolean isActive
    ) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.isActive = isActive;
    }



    public Candidate add() {
        data.add(this);
        Candidate.saveDataToFile();
        return this;
    }

    public void delete() throws Exception{
        Candidate candidate = Candidate.getByEmail(this.email);

        if (candidate != null) {
            data.remove(this);
            Candidate.saveDataToFile();
            System.out.println("Candidate has been deleted");
        }
        else
            throw new Exception("Candidate not found");
    }

    public void deleteCandidate(String email){
        Candidate candidate = Candidate.getByEmail(email);

        if (candidate != null) {
            data.remove(this);
            candidate.saveDataToFile();
            System.out.println("Interviewer has been deleted");
        }
        else
            System.out.println("Interviewer not found");
    }

    public void save(
            String name,
            String lastName,
            String email,
            Boolean isActive
    ) {
        try {
            this.delete();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }

        if (!name.equals(""))
            this.name = name;

        if (!lastName.equals(""))
            this.lastName = lastName;

        if (!email.equals(""))
            this.email = email;

        this.isActive = isActive;

        data.add(this);
    }

    public static Candidate getByEmail(String email) {
        for (Candidate candidate: data) {
            if (candidate.email.equals(email))
                return candidate;
        }

        return null;
    }

    public static Candidate getById(int id) {
        for (Candidate candidate: data) {
            if (candidate.id == id)
                return candidate;
        }

        return null;
    }

    @Override
    public String toString() {
        return "\nID: " + this.id +
                "\nName: " + this.name +
                "\nLast Name: " + this.lastName +
                "\nEmail: " + this.email +
                "\nIs Active: " + this.isActive + "\n";
    }

    public static void saveDataToFile() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("./candidate");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);

            outputStream.writeObject(Candidate.data);

            outputStream.close();
            fileOutputStream.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static void loadDataFromFile() {
        try {
            FileInputStream fileInputStream = new FileInputStream("./candidate");
            ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);

            ArrayList<Candidate> fileData = (ArrayList<Candidate>) inputStream.readObject();

            Candidate.data.clear();
            Candidate.data.addAll(fileData);

            inputStream.close();
            fileInputStream.close();
        } catch (Exception e) {
            if (!e.getMessage().contains("No such file or directory"))
                e.printStackTrace();
        }
    }
}
```
``` Discipline ```
```java 
public class Discipline implements Serializable {
    static ArrayList<Discipline> data;
    int id;
    String name;
    String description;
    String slug;

    public Discipline(
            String name,
            String description,
            String slug
    ){
        this.id = data.size()+ 1;
        this.name= name;
        this.description= description;
        this.slug = slug;
    }

    public Discipline(
            int id,
            String name,
            String description,
            String slug
    ){
        this.id = id;
        this.name= name;
        this.description= description;
        this.slug = slug;
    }

    public Discipline add() {
        data.add(this);
        Discipline.saveDataToFile();
        return this;
    }

    public void deleteDiscipline(String name){
        Discipline discipline = Discipline.getByName(name);

        if (discipline != null) {
            data.remove(this);
            discipline.saveDataToFile();
            System.out.println("Discipline has been deleted");
        }
        else
            System.out.println("Discipline not found");
    }

    public void delete() throws Exception{
        Discipline discipline = Discipline.getByName(this.name);

        if (discipline != null) {
            data.remove(this);
            discipline.saveDataToFile();
            System.out.println("Discipline has been deleted");
        }
        else
            throw new Exception("Discipline not found");
    }


    public static Discipline getByName(String name) {
        for (Discipline discipline: data) {
            if (discipline.name.equals(name))
                return discipline;
        }

        return null;
    }

    @Override
    public String toString() {
        return "\nID: " + this.id +
                "\nName: " + this.name +
                "\nLast Name: " + this.description +
                "\nIs Active: " + this.slug + "\n";
    }

    public void save(
            String name,
            String description,
            String slug
    ) {
        try {
            this.delete();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }

        if (!name.equals(""))
            this.name = name;

        if (!description.equals(""))
            this.description= description;

        if (!slug.equals(""))
            this.slug = slug;

        data.add(this);
    }


    public static void saveDataToFile() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("./discipline");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);

            outputStream.writeObject(Discipline.data);

            outputStream.close();
            fileOutputStream.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
```

```Interview ```

```java
...
```

```Interviewer ```
```java
public class Interviewer implements Serializable {
    static ArrayList<Interviewer> data;

    int id;
    String name;
    String lastName;
    String email;
    Boolean isActive;

    public Interviewer(
            String name,
            String lastName,
            String email,
            Boolean isActive
    ) {
        this.id = data.size() + 1;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.isActive = isActive;
    }

    public Interviewer(
            int id,
            String name,
            String lastName,
            String email,
            Boolean isActive
    ) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.isActive = isActive;
    }

    public Interviewer add() {
        data.add(this);
        Interviewer.saveDataToFile();
        return this;
    }

    public void delete() throws Exception{
        Interviewer interviewer = Interviewer.getByEmail(this.email);

        if (interviewer != null) {
            data.remove(this);
            Interviewer.saveDataToFile();
            System.out.println("Interviewer has been deleted");
        }
        else
            throw new Exception("Interviewer not found");
    }

    public void deleteInterviewer(String email){
        Interviewer interviewer = Interviewer.getByEmail(email);

        if (interviewer != null) {
            data.remove(this);
            Interviewer.saveDataToFile();
            System.out.println("Interviewer has been deleted");
        }
        else
            System.out.println("Interviewer not found");
    }

    public void save(
            String name,
            String lastName,
            String email,
            Boolean isActive
    ) {
        try {
            this.delete();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }

        if (!name.equals(""))
            this.name = name;

        if (!lastName.equals(""))
            this.lastName = lastName;

        if (!email.equals(""))
            this.email = email;

        this.isActive = isActive;

        data.add(this);
    }

    public static Interviewer getByEmail(String email) {
        for (Interviewer interviewer: data) {
            if (interviewer.email.equals(email))
                return interviewer;
        }

        return null;
    }

    public static Interviewer getById(int id) {
        for (Interviewer interviewer: data) {
            if (interviewer.id == id)
                return interviewer;
        }

        return null;
    }

    @Override
    public String toString() {
        return "\nID: " + this.id +
                "\nName: " + this.name +
                "\nLast Name: " + this.lastName +
                "\nEmail: " + this.email +
                "\nIs Active: " + this.isActive + "\n";
    }

    public static void saveDataToFile() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("./interviewers");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);

            outputStream.writeObject(Interviewer.data);

            outputStream.close();
            fileOutputStream.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static void loadDataFromFile() {
        try {
            FileInputStream fileInputStream = new FileInputStream("./interviewers");
            ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);

            ArrayList<Interviewer> fileData = (ArrayList<Interviewer>) inputStream.readObject();

            Interviewer.data.clear();
            Interviewer.data.addAll(fileData);

            inputStream.close();
            fileInputStream.close();
        } catch (Exception e) {
            if (!e.getMessage().contains("No such file or directory"))
                e.printStackTrace();
        }
    }
}
```

```InterviewType ```
```java
public class InterviewType implements Serializable {
    static ArrayList<InterviewType> data;

    int id;
    String name;
    String slug;
    String description;

    public InterviewType(
            String name,
            String slug,
            String description
    ) {
        this.id = data.size() + 1;
        this.name = name;
        this.slug = slug;
        this.description = description;
    }
    public InterviewType(
            int id,
            String name,
            String slug,
            String description
    ) {
        this.id = id;
        this.name = name;
        this.slug = slug;
        this.description = description;
    }


    public InterviewType add() {
        data.add(this);
        InterviewType.saveDataToFile();
        return this;
    }

    public void delete() throws Exception{
        InterviewType interviewType = InterviewType.getByName(this.name);
        if (interviewType != null) {
            data.remove(this);
            InterviewType.saveDataToFile();
            System.out.println("Interviewer has been deleted");
        }
        else
            throw new Exception("Interviewer not found");
    }

    public void deleteInterviewType(String name){
        InterviewType interviewType = InterviewType.getByName(name);

        if (interviewType != null) {
            data.remove(this);
            InterviewType.saveDataToFile();
            System.out.println("Interview has been deleted");
        }
        else
            System.out.println("Interview not found");
    }

    public void save(
            String name,
            String slug,
            String description
    ) {
        try {
            this.delete();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }

        if (!name.equals(""))
            this.name = name;

        if (!slug.equals(""))
            this.slug = slug;

        if (!description.equals(""))
            this.description = description;
        data.add(this);
    }

    public static InterviewType getByName(String name) {
        for (InterviewType interviewerType: data) {
            if (interviewerType.name.equals(name)) {
                return interviewerType;
            }
        }

        return null;
    }

    @Override
    public String toString() {
        return "\nID: " + this.id +
                "\nName: " + this.name +
                "\nSlug: " + this.slug +
                "\nDescription: " + this.description
                + "\n";
    }

    public static void saveDataToFile() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("./interviewType");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);

            outputStream.writeObject(InterviewType.data);

            outputStream.close();
            fileOutputStream.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static void loadDataFromFile() {
        try {
            FileInputStream fileInputStream = new FileInputStream("./interviewType");
            ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);

            ArrayList<InterviewType> fileData = (ArrayList<InterviewType>) inputStream.readObject();

            InterviewType.data.clear();
            InterviewType.data.addAll(fileData);

            inputStream.close();
            fileInputStream.close();
        } catch (Exception e) {
            if (!e.getMessage().contains("No such file or directory"))
                e.printStackTrace();
        }
    }

}
```

```Technology```

```java 
public class InterviewType implements Serializable {
    static ArrayList<InterviewType> data;

    int id;
    String name;
    String slug;
    String description;

    public InterviewType(
            String name,
            String slug,
            String description
    ) {
        this.id = data.size() + 1;
        this.name = name;
        this.slug = slug;
        this.description = description;
    }
    public InterviewType(
            int id,
            String name,
            String slug,
            String description
    ) {
        this.id = id;
        this.name = name;
        this.slug = slug;
        this.description = description;
    }


    public InterviewType add() {
        data.add(this);
        InterviewType.saveDataToFile();
        return this;
    }

    public void delete() throws Exception{
        InterviewType interviewType = InterviewType.getByName(this.name);
        if (interviewType != null) {
            data.remove(this);
            InterviewType.saveDataToFile();
            System.out.println("Interviewer has been deleted");
        }
        else
            throw new Exception("Interviewer not found");
    }

    public void deleteInterviewType(String name){
        InterviewType interviewType = InterviewType.getByName(name);

        if (interviewType != null) {
            data.remove(this);
            InterviewType.saveDataToFile();
            System.out.println("Interview has been deleted");
        }
        else
            System.out.println("Interview not found");
    }

    public void save(
            String name,
            String slug,
            String description
    ) {
        try {
            this.delete();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }

        if (!name.equals(""))
            this.name = name;

        if (!slug.equals(""))
            this.slug = slug;

        if (!description.equals(""))
            this.description = description;
        data.add(this);
    }

    public static InterviewType getByName(String name) {
        for (InterviewType interviewerType: data) {
            if (interviewerType.name.equals(name)) {
                return interviewerType;
            }
        }

        return null;
    }

    @Override
    public String toString() {
        return "\nID: " + this.id +
                "\nName: " + this.name +
                "\nSlug: " + this.slug +
                "\nDescription: " + this.description
                + "\n";
    }

    public static void saveDataToFile() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("./interviewType");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);

            outputStream.writeObject(InterviewType.data);

            outputStream.close();
            fileOutputStream.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static void loadDataFromFile() {
        try {
            FileInputStream fileInputStream = new FileInputStream("./interviewType");
            ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);

            ArrayList<InterviewType> fileData = (ArrayList<InterviewType>) inputStream.readObject();

            InterviewType.data.clear();
            InterviewType.data.addAll(fileData);

            inputStream.close();
            fileInputStream.close();
        } catch (Exception e) {
            if (!e.getMessage().contains("No such file or directory"))
                e.printStackTrace();
        }
    }

}
```
#### Pruebas
``` CandidateTest ```
```java
public class CandidateTest {

    static String existingCandidateName = "First";
    static String existingCandidateLastName = "User";
    static String existingCandidateEmail =  "first@email.com";

    @BeforeEach
    public void setUp() {
        Candidate.data = new ArrayList<Candidate>();

        Candidate.data.add(new Candidate(
                existingCandidateName,
                existingCandidateLastName,
                existingCandidateEmail,
                true
        ));
    }

    @Test
    public void add() {
        System.out.println("iniciado prueba");

        Candidate candidate = new Candidate("Test", "User", "mail@email.com", true);

        candidate.add();

        int expectedId = Candidate.data.size();
        assertEquals(expectedId, candidate.id,"New interviewer ID should be the new List's size" );
    }


    @Test
    public void save() {
        int originalListSize = Candidate.data.size();
        String expectedLastName = "New";
        Candidate existingCandidate = Candidate.data.get(0);
        System.out.println(Candidate.data.size());
        existingCandidate.save("", expectedLastName, "", true);

        int newListSize = Candidate.data.size();
        System.out.println(Candidate.data.size());
        int lastCandidateIndex = newListSize - 1;
        Candidate latestCandidate = Candidate.data.get(lastCandidateIndex);

        assertEquals(
                originalListSize,
                newListSize,
                "List size should be the same"
        );
        assertEquals(
                expectedLastName,
                latestCandidate.lastName,
                "Last Name should have been updated"
        );
        assertEquals(
                existingCandidate.name,
                latestCandidate.name,
                "Name should have not been updated"
        );
    }


    @Test
    public void getByEmail() {
        Candidate result = Candidate.getByEmail(existingCandidateEmail);

        assertNotNull(result, "Candidate should be found");
        assertEquals(
                existingCandidateName,
                result.name,
                "Unexpected Candidate Name"
        );
        assertEquals(
                existingCandidateLastName,
                result.lastName,
                "Unexpected Candidate Last Name"
        );
    }

    @Test
    public void deleteByEmail() {
        Candidate candidate = new Candidate("Test", "User", "mail@email.com", true);
        candidate.add();
        candidate.deleteCandidate("mail@email.com");

        assertNotNull("Candidate has been deleted");
        assertEquals("Candidate has been deleted","Candidate has been deleted");

        candidate.deleteCandidate("mail@email.com");
        assertNotNull("Candidate not found");
    }

    @Test
    public void getByNonExistingEmail() {
        String nonExistingEmail = "nonexisting@email.com";

        Candidate result = Candidate.getByEmail(nonExistingEmail);

        assertNull(result, "Candidate should not be found");
    }
}
```
![S2_2](https://user-images.githubusercontent.com/77414220/167504425-e9375a94-72d3-4c6e-98ae-a2268a89a011.PNG)

``` DisciplineTest ```
```java
public class DisciplineTest {

    static String existingDisciplineName= "Java";
    static String existingDisciplineDescription= "Lenguage";
    static String existingDisciplineSlug= "Tech";


    @BeforeEach
    public void setUp() {
        Discipline.data = new ArrayList<Discipline>();

        Discipline.data.add(new Discipline(
                existingDisciplineName,
                existingDisciplineDescription,
                existingDisciplineSlug ));
    }
    @Test
    public void add() {
        System.out.println("Iniciando prueba");

        Discipline discipline = new Discipline("java", "javaee", "tech");

        discipline.add();

        int expectedId = Discipline.data.size();
        assertEquals(expectedId, discipline.id,"New Discipline ID should be the new List's size" );
    }

    @Test
    public void save() {
        int originalListSize = Discipline.data.size();
        String expectedDescription = "New";
        Discipline existingDiscipline = Discipline.data.get(0);
        System.out.println(Discipline.data.size());
        existingDiscipline.save("",expectedDescription,"");

        int newListSize = Discipline.data.size();
        System.out.println(Discipline.data.size());
        int lastDisciplineIndex = newListSize - 1;
        Discipline latestDiscipline = Discipline.data.get(lastDisciplineIndex);

        assertEquals(
                originalListSize,
                newListSize,
                "List size should be the same"
        );
        assertEquals(
                expectedDescription,
                latestDiscipline.description,
                "Description should have been updated"
        );
        assertEquals(
                existingDiscipline.name,
                latestDiscipline.name,
                "Name should have not been updated"
        );
    }

    @Test
    public void getByName() {
        Discipline result = Discipline.getByName(existingDisciplineName);

        assertNotNull(result, "Discipline not found");
        assertEquals(
                existingDisciplineName,
                result.name,
                "Unexpected Discipline Name"
        );
        assertEquals(
                existingDisciplineDescription,
                result.description,
                "Unexpected Discipline Description"
        );
    }

    @Test
    public void deleteByName() {
        Discipline discipline = new Discipline("java", "javaee", "tech");
        discipline.add();
        discipline.deleteDiscipline("java");

        assertNotNull("Discipline has been deleted");
        assertEquals("Discipline has been deleted","Discipline has been deleted");

        discipline.deleteDiscipline("mail@email.com");
        assertNotNull("Interviewer not found");
    }

    @Test
    public void getByNonExistingName() {
        String nonExistingName = "non existing tech";

        Discipline result = Discipline.getByName(nonExistingName);

        assertNull(result, "Interviewer should not be found");
    }


}
```
![S2_3](https://user-images.githubusercontent.com/77414220/167504462-bb49999f-dac2-4511-b606-1cfb0135f90d.PNG)

``` Interview ```
```java
...
```

``` InterviewerTest```
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
![S2_4](https://user-images.githubusercontent.com/77414220/167504534-71bae84b-5c5b-4181-8e9b-eb87a9a47bd7.PNG)

``` InterviewTypeTest```
```java
public class InterviewTypeTest {
    static String nameE = "Entrevista Tecnica";
    static String slugE = "Valor Random";
    static String descriptionE =  "Prueba de test";

    @BeforeEach
    public void setUp() {
        InterviewType.data = new ArrayList<InterviewType>();

        InterviewType.data.add(new InterviewType(
                nameE,
                slugE,
                descriptionE
        ));
    }

    @Test
    public void add() {
        System.out.println("iniciado prueba");

        InterviewType interviewType = new InterviewType("Entrevista", "aaaaa", "Description test");

        interviewType.add();

        int expectedId = InterviewType.data.size();
        assertEquals(expectedId, interviewType.id,"New interviewer ID should be the new List's size" );
    }


    @Test
    public void save() {
        int originalListSize = InterviewType.data.size();
        String expectedLastName = "Test";
        InterviewType interviewType = InterviewType.data.get(0);
        System.out.println(InterviewType.data.size());
        interviewType.save("Test", "asd","asd");

        int newListSize = InterviewType.data.size();
        System.out.println(InterviewType.data.size());
        int lastInterviewerIndex = newListSize - 1;
        InterviewType latestInterviewer = InterviewType.data.get(lastInterviewerIndex);

        assertEquals(
                originalListSize,
                newListSize,
                "List size should be the same"
        );
        assertEquals(
                expectedLastName,
                latestInterviewer.name,
                "Nop"
        );
    }

    @Test
    public void getByName() {
        InterviewType result = InterviewType.getByName(nameE);

        assertNotNull(result, "Interviewer should be found");
        assertEquals(
                nameE,
                result.name,
                "Unexpected Interviewer Name"
        );
    }

    @Test
    public void deleteByName() {
        InterviewType interviewerT = new InterviewType("Test","Test","Test");
        interviewerT.add();
        interviewerT.deleteInterviewType("Test");

        assertNotNull("Interviewer has been deleted");
        assertEquals("Interviewer has been deleted","Interviewer has been deleted");

        interviewerT.deleteInterviewType("mail@email.com");
        assertNotNull("Interviewer not found");
    }
}
```
![S2_5](https://user-images.githubusercontent.com/77414220/167504559-4ed39cc5-fb38-4d32-851e-7db21b631eb8.PNG)

``` TechnologyTest```
```java
public class TechnologyTest {
    static String existingTechnologyName= "Java";
    static String existingTechnologyDescription= "Lenguage";
    static String existingTechnologySlug= "Tech";


    @BeforeEach
    public void setUp() {
        Technology.data = new ArrayList<Technology>();

        Technology.data.add(new Technology(
                existingTechnologyName,
                existingTechnologyDescription,
                existingTechnologySlug ));
    }
    @Test
    public void add() {
        System.out.println("Iniciando prueba");

        Technology technology = new Technology("java", "javaee", "tech");

        technology.add();

        int expectedId = Technology.data.size();
        assertEquals(expectedId, technology.id,"New Technology ID should be the new List's size" );
    }

    @Test
    public void save() {
        int originalListSize = Technology.data.size();
        String expectedDescription = "New";
        Technology existingTechnology = Technology.data.get(0);
        System.out.println(Technology.data.size());
        existingTechnology.save("",expectedDescription,"");

        int newListSize = Technology.data.size();
        System.out.println(Technology.data.size());
        int lastTechnologyIndex = newListSize - 1;
        Technology latestTechnology = Technology.data.get(lastTechnologyIndex);

        assertEquals(
                originalListSize,
                newListSize,
                "List size should be the same"
        );
        assertEquals(
                expectedDescription,
                latestTechnology.description,
                "Description should have been updated"
        );
        assertEquals(
                existingTechnology.name,
                latestTechnology.name,
                "Name should have not been updated"
        );
    }

    @Test
    public void getByName() {
        Technology result = Technology.getByName(existingTechnologyName);

        assertNotNull(result, "Technology not found");
        assertEquals(
                existingTechnologyName,
                result.name,
                "Unexpected Technology Name"
        );
        assertEquals(
                existingTechnologyDescription,
                result.description,
                "Unexpected Technology Description"
        );
    }

    @Test
    public void deleteByName() {
        Technology technology = new Technology("java", "javaee", "tech");
        technology.add();
        technology.deleteTechnology("java");

        assertNotNull("Technology has been deleted");
        assertEquals("Technology has been deleted","Technology has been deleted");

        technology.deleteTechnology("mail@email.com");
        assertNotNull("Interviewer not found");
    }

    @Test
    public void getByNonExistingName() {
        String nonExistingName = "non existing tech";

        Technology result = Technology.getByName(nonExistingName);

        assertNull(result, "Interviewer should not be found");
    }

}
```
![S2_6](https://user-images.githubusercontent.com/77414220/167504585-b2b03f13-a2da-4e92-be96-b8afad3ab5e1.PNG)


### Indicaciones generales

Una vez que hayas terminado  la actividad responde las siguientes preguntas:

**¿Empleaste herencia en alguna clase?**

En la realización de este proyecto no empleamos herencia, porque la estructura no nos facilitó la tarea.

**¿Qué tipo de datos son tus identificadores (id)? ¿Por qué elegiste ese tipo de dato?**

Los identificadores que usamos fueron tipo int, pues consideramos que era más fácil hacer la manipulación de información de estos datos además de que permite hacer la asignación más sencilla a través del auto-incrementable.

**¿Decidiste añadir pruebas? ¿Por qué?**
Sí, para confirmar la funcionalidad de cada una de las clases.

✅ Checklist 

Asegúrate que tu postwork contenga todo lo siguiente, ya que esto se evaluará al término del módulo.


- ✅ Existe una clase Interviewer que cuenta con los atributos y métodos definidos en nuestro diagrama.

- ✅ Existe una clase Candidate que cuenta con los atributos y métodos definidos en nuestro diagrama.

- ✅ Existe una clase Interview Type que cuenta con los atributos y métodos definidos en nuestro diagrama.

- ✅ Existe una clase Technology que cuenta con los atributos y métodos definidos en nuestro diagrama.

- ✅ Existe una clase Discipline que cuenta con los atributos y métodos definidos en nuestro diagrama.
