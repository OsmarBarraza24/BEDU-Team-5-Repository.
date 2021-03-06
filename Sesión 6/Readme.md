>![Cognizant_logo_2022 svg](https://user-images.githubusercontent.com/77414220/167276034-fc9aba50-8b81-4ce6-8da8-db3aea61e87b.png)

# Postwork

## INTEGRANTES DEL EQUIPO

- Osmar Barraza Flores
- Cruz Gil Estrada
- Dalyn Lara Cortes
- Carlos Valdivia Garcia

## 馃幆 OBJETIVOS

- Desarrollar un programa siguiendo las reglas de TDD.
- A帽adir pruebas unitarias adicionales para probar su funcionalidad.
- Familiarizarse con TDD.
- Identificar el impacto de la premisa de transformaci贸n elegida en el resultado final

## 馃殌 DESARROLLO

- Implementar el algoritmo de ordenamiento bubble sort, desglosando el desarrollo y siguiendo las reglas de
  transformaciones vistas durante la sesi贸n

- A帽ade un caso de prueba, ejecutalo y comprueba que falla.

- Implementa el c贸digo m铆nimo necesario para que dicha prueba pase

- Aplica las premisas de transformaci贸n de ser necesario.

- Refactoriza el c贸digo si lo consideras necesario.

- Documenta (captura de pantalla, c贸digo, etc) el estado final de tus pruebas y tu c贸digo al final de cada ciclo.

Tip: La clave para derivar en un algoritmo menos eficiente es utilizar una transformaci贸n de menor orden, en el caso
particular de un bucle sort en lugar de un quicksort, dicha clave es transformar utilizando un asignaci贸n en lugar de
preferir el c贸mputo/l贸gica.

### Sigue estas instrucciones:

1. Crea un nuevo archivo llamado BubbleSortTest.java
1. Crea un nuevo archivo llamado BubbleSort.java
1. A帽ade el primer caso de prueba para un arreglo vac铆o
1. Implementar el c贸digo m铆nimo necesario para pasar este caso de uso
1. Refactoriza el c贸digo de ser necesario
1. Aplica las transformaciones que sean necesarias
1. Repite los pasos del 3 al 6 hasta completar los casos de prueba vistos durante el work.

### Desarrollo Bubble Sort

Se crea la clase BubbleSort con el m茅todo sorter vacio y BubbleSortTest, el cual prueba el env铆o de un arreglo vac铆o a la funcion sorter. Se ejecuta la prueba esperando falla en el resultado.
<!-- >![2](https://user-images.githubusercontent.com/103444882/167027374-ef41c491-d7af-4515-86cf-a5c7f8ee2b82.png) -->
><img src="https://user-images.githubusercontent.com/103444882/167027374-ef41c491-d7af-4515-86cf-a5c7f8ee2b82.png" width="200" height="200" />
>
<!-- >![3](https://user-images.githubusercontent.com/103444882/167027377-54d0a6e2-330e-42a1-b6da-0ac8a0da6a31.png) -->
><img src="https://user-images.githubusercontent.com/103444882/167027377-54d0a6e2-330e-42a1-b6da-0ac8a0da6a31.png" width="600" height="300" />


![p1](https://user-images.githubusercontent.com/77414220/167030989-e6ecd983-5800-4bff-b8f9-5cfb1a6ac781.PNG)

Se ha encontrado la falla, por lo que se agrega el primer bloque de c贸digo para pasar el test.
<!-- >![4](https://user-images.githubusercontent.com/103444882/167027378-68ff2c59-d3fe-4dda-8543-e2992592c24d.png) -->
><img src="https://user-images.githubusercontent.com/103444882/167027378-68ff2c59-d3fe-4dda-8543-e2992592c24d.png"  width="600" height="300"   />

Se ejecuta nuevamente la prueba, la cual pasa esta vez.

![p2](https://user-images.githubusercontent.com/77414220/167031066-aec20256-47d1-45a6-b611-d0fa36a307a1.PNG)

Se agrega la segunda prueba, se ejecuta y se espera la falla nuevamente.
<!-- >![5](https://user-images.githubusercontent.com/103444882/167027379-53e2319b-99dd-4d00-9df0-65485715149b.png) -->
><img src="https://user-images.githubusercontent.com/103444882/167027379-53e2319b-99dd-4d00-9df0-65485715149b.png"  width="600" height="300"   />
![p3](https://user-images.githubusercontent.com/77414220/167031460-765666f0-fe80-41f5-ba7e-c6402e3fcba9.PNG)

Se agrega el nuevo bloque de c贸digo que resolver谩 la falla del test anterior. Se ejecuta y se espera que pase la prueba esta vez.

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

Se agrega el bloque de c贸digo que permite pasar la nueva prueba, as铆 como las anteriores.

<!-- >![9](https://user-images.githubusercontent.com/103444882/167027394-311d6278-62e9-455d-9787-3b5ac11b13b9.png) -->
><img src="https://user-images.githubusercontent.com/103444882/167027394-311d6278-62e9-455d-9787-3b5ac11b13b9.png"  width="600" height="300"   />

![p7](https://user-images.githubusercontent.com/77414220/167031632-2214a3b9-deae-47d0-9739-f0fbc285b55e.PNG)

Se agrega una prueba m谩s, la cual se ejecuta y pasa el test.
![p8](https://user-images.githubusercontent.com/77414220/167032286-a14367ee-b73f-4577-a13d-7ccaa0e44e2f.PNG)

En vista de que la prueba anterior paso, se agrega una prueba m谩s, esta vez con tres elementos, esperando que falle, pero inesperadamente pasa el test.
<!-- >![11](https://user-images.githubusercontent.com/103444882/167027399-22a9f536-40bd-4817-a36f-ebddd77b52ae.png) -->
><img src="https://user-images.githubusercontent.com/103444882/167027399-22a9f536-40bd-4817-a36f-ebddd77b52ae.png"  width="600" height="300"   />

![p9](https://user-images.githubusercontent.com/77414220/167032350-8586d283-32bf-4452-813c-37b728b31aae.PNG)


Se agrega una prueba m谩s, esperando que falle.
<!-- >![12](https://user-images.githubusercontent.com/103444882/167027405-3a6744b3-9726-4a5d-b096-49158fa83060.png) -->
><img src="https://user-images.githubusercontent.com/103444882/167027405-3a6744b3-9726-4a5d-b096-49158fa83060.png"  width="600" height="300"   />

![p10](https://user-images.githubusercontent.com/77414220/167032462-faaae033-3244-4cd8-9d9d-6b2857a66b6f.PNG)

Nuevamente, se modifica el c贸digo para permitir que pase la nueva prueba. Se ejecuta el test nuevamente y esta vez pasa.
<!-- >![13](https://user-images.githubusercontent.com/103444882/167027408-8f0fed0a-c08d-43d8-b565-5dac794eb287.png) -->
><img src="https://user-images.githubusercontent.com/103444882/167027408-8f0fed0a-c08d-43d8-b565-5dac794eb287.png"  width="600" height="300"   />
>

![p11](https://user-images.githubusercontent.com/77414220/167032477-3f569e0f-a860-4250-94ab-38e5bf6a18aa.PNG)

Se a帽ade una prueba m谩s, y se ejecuta el test, el cual falla.
<!-- >![14](https://user-images.githubusercontent.com/103444882/167027414-8bfa5e16-862d-494a-8eb1-48897b115ae5.png) -->
><img src="https://user-images.githubusercontent.com/103444882/167027414-8bfa5e16-862d-494a-8eb1-48897b115ae5.png"  width="600" height="300"   />

![p12](https://user-images.githubusercontent.com/77414220/167033027-737811e6-a08f-4afb-90c7-9d924129e61f.PNG)

Se a帽ade el c贸digo que permite que esta prueba pase exitosamente.
<!-- >![15](https://user-images.githubusercontent.com/103444882/167027416-10643b39-b53f-4c07-884b-e470aa6d2aac.png) -->
><img src="https://user-images.githubusercontent.com/103444882/167027416-10643b39-b53f-4c07-884b-e470aa6d2aac.png"  width="600" height="300"   />

![p13](https://user-images.githubusercontent.com/77414220/167033212-275fa941-98ba-412f-b814-f8c0bf75f425.PNG)

Se a帽ade una prueba m谩s, y se ejecuta el test, el cual falla.

<!-- >![16](https://user-images.githubusercontent.com/103444882/167027420-756b290f-3244-4636-bc1f-d21624932fca.png) -->
><img src="https://user-images.githubusercontent.com/103444882/167027420-756b290f-3244-4636-bc1f-d21624932fca.png"  width="600" height="300"   />
![p14](https://user-images.githubusercontent.com/77414220/167033337-78a323e7-70ea-4dc3-82f6-37eba9e7d4e7.PNG)

Se a帽ade una prueba m谩s, esta vez con cuatro elementos. La prueba se ejecuta, y pasa. Se agrega una prueba m谩s esperando que falle, y falla.
<!-- >![17](https://user-images.githubusercontent.com/103444882/167027703-bf8d80de-da3c-4d5b-9663-e33acc283ef9.png) -->
><img src="https://user-images.githubusercontent.com/103444882/167027703-bf8d80de-da3c-4d5b-9663-e33acc283ef9.png"  width="600" height="300"   />

![p15](https://user-images.githubusercontent.com/77414220/167033353-efe65e05-b9f6-47cc-aa53-95b694c63ce7.PNG)

Los casos se han vuelto muy espec铆ficos, por lo que ha llegado el momento de refactorizar el c贸digo. Se ejecuta la prueba y pasa.
<!-- >![18](https://user-images.githubusercontent.com/103444882/167030112-51827a2e-0e03-4e03-94fe-01d6227c7441.png) -->
><img src="https://user-images.githubusercontent.com/103444882/167030112-51827a2e-0e03-4e03-94fe-01d6227c7441.png"  width="600" height="300"   />


<!-- >![19](https://user-images.githubusercontent.com/103444882/167030117-5a026e41-bde4-4eda-8d99-6edd23ea0689.png) -->
><img src="https://user-images.githubusercontent.com/103444882/167030117-5a026e41-bde4-4eda-8d99-6edd23ea0689.png"  width="600" height="400"   />


![p16](https://user-images.githubusercontent.com/77414220/167033366-376952d0-4f8a-4412-bf9d-8365a04d22c6.PNG)

Se realiza la 煤ltima refactorizaci贸n del c贸digo y se ejecutan las pruebas, esperando que ninguna falle el test.
```java
public class bubbleSort {

    public static int[] sorter(int[] unsorted) {
        if (unsorted.length <= 1)
            return unsorted;

        for (int i = 0; i < unsorted.length; i++)
                for (int j = i + 1; j < unsorted.length; j++) {
                    int temp = 0;
                    if (unsorted[i] > unsorted[j]) {
                        temp = unsorted[i];
                        unsorted[i] = unsorted[j];
                        unsorted[j] = temp;
                    }
                }
        return unsorted;
    }
}
```
![S6_23](https://user-images.githubusercontent.com/77414220/167701518-65cb3045-0e52-4b47-83e8-75920eced294.PNG)

Se comprueba que la refactorizaci贸n del c贸digo ha sido exitosa, y la aplicaci贸n esta finalizada.


### Desarrollo QuickSort
Una vez funcionando Bubblesort, se decide implementar el m茅todo Quicksort, por lo cual, se crea la clase sin ning煤n m茅todo y la primera prueba, que es un arreglo vac铆o. Se ejecuta la prueba y el test falla, como se espera.

```java
public class quickSort {
}
```

```java
class quickSortTest {

    //Primer Test. Arreglo vacio
    @Test
    public void quickSorterTest_Empty() {
        int[] arr = new int[]{};
        assertArrayEquals(new int[]{}, quickSort.sort(arr));
    }
}
```
![S6_0](https://user-images.githubusercontent.com/77414220/167459477-63b929a5-e352-4877-8e0b-4e5e3243d8c9.PNG)


Se crea el m茅todo sort y se agrega el primero bloque de c贸digo. Se ejecuta la prueba nuevamente y esta vez pasa el test.
```java
    public static int[] sort(int[] unsorted){
        return new int[]{};
        
    }
```
![S6_2](https://user-images.githubusercontent.com/77414220/167457365-02588905-252e-4a92-8ac8-3c37d197b72b.PNG)

Se agrega una nueva prueba, esta vez con un elemento. Se ejecuta y falla como se espera.
```java
    //Segundo Test. Arreglo de un elemento
    @Test
    public void quickSorterTest_OneElement() {
        int[] arr = new int[]{1};
        assertArrayEquals(new int[]{1}, quickSort.sort(arr));
```
![S6_3](https://user-images.githubusercontent.com/77414220/167457683-cf40559f-8a91-4649-8d2b-adc7308ce15c.PNG)

Se realiza la segunda transformaci贸n del m茅todo sort. Se ejecuta la prueba nuevamente y pasa.
```java
    public static int[] sort(int[] unsorted){
        return unsorted;
    }
```
![S6_4](https://user-images.githubusercontent.com/77414220/167460561-bcdef891-ec41-4a20-b1d5-2c840b17138b.PNG)

Se agrega una nueva prueba, esta vez con dos elementos. Se ejecuta y pasa el test, por lo que se procede a agregar una nueva prueba esperando que falle.
```java
    //Tercer Test. Arreglo de dos elementos desordenados
    @Test
    public void quickSorterTest_TwoElements1() {
        int[] arr = new int[]{1,2};
        assertArrayEquals(new int[]{1,2}, quickSort.sort(arr));
    }
```
![S6_5](https://user-images.githubusercontent.com/77414220/167461208-160dce9b-f8f9-42ee-a813-794e61d5f7ec.PNG)

```java
    //Cuarto Test. Arreglo de dos elementos desordenados
    @Test
    public void quickSorterTest_TwoElements2() {
        int[] arr = new int[]{2,1};
        assertArrayEquals(new int[]{1,2}, quickSort.sort(arr));
    }
```
![S6_6](https://user-images.githubusercontent.com/77414220/167461342-f4abab8f-9fb7-4b0d-9949-8dc175deaadc.PNG)

Se modifica nuevamente el m茅todo sort, y se ejecuta la prueba con estos cambios, la cual pasa.

```java
    public static int[] sort(int[] unsorted){
        if(unsorted.length == 2)
            if(unsorted[0] > unsorted[1])
                return new int[]{unsorted[1],unsorted[0]};
        
        return unsorted;
    }
```
![S6_7](https://user-images.githubusercontent.com/77414220/167461561-a307e601-3350-429f-8c17-c096342bd4db.PNG)

Se a帽ade una nueva prueba, esta vez con tres elementos ordenados, esperando que falle, pero pasa, por lo cual se crea una nueva prueba y esta no pasa el test.
```java
    //Quinto Test. Arreglo de tres elementos ordenados
    @Test
    public void quickSorterTest_ThreeElements1() {
        int[] arr = new int[]{1,2,3};
        assertArrayEquals(new int[]{1,2,3}, quickSort.sort(arr));
    }
```
![S6_8](https://user-images.githubusercontent.com/77414220/167461714-5d874d35-3bf2-494f-9a32-dd70752e5045.PNG)

```java
    //Sexto Test. Arreglo de tres elementos desordenados
    @Test
    public void quickSorterTest_ThreeElements2() {
        int[] arr = new int[]{2,1,3};
        assertArrayEquals(new int[]{1,2,3}, quickSort.sort(arr));
    }
```
![S6_9](https://user-images.githubusercontent.com/77414220/167462340-4a423fd9-09a3-4a3b-ba22-a8106597bcaf.PNG)

Con el fin de pasar la nueva prueba, se modifica el m茅todo sort nuevamente. La prueba se ejecuta nuevamente y pasa.
```java
    public static int[] sort(int[] unsorted){
        if(unsorted.length == 2)
            if(unsorted[0] > unsorted[1])
                return new int[]{unsorted[1],unsorted[0]};

        if(unsorted.length == 3){
            if(unsorted[0] < unsorted[1])
                return new int[]{unsorted[0],unsorted[1],unsorted[2]};
            if(unsorted[0] > unsorted[1])
                return new int[]{unsorted[1],unsorted[0],unsorted[2]};
        }

        return unsorted;
    }
```
![S6_10](https://user-images.githubusercontent.com/77414220/167462409-77da412d-74f4-405f-a6cf-73d64ba0e71c.PNG)

Se agregua una nueva prueba esperando nuevamente que falle, lo cual sucede.
```java
    //S茅ptimo Test. Arreglo de tres elementos desordenados
     @Test
    public void quickSorterTest_ThreeElements3() {
        int[] arr = new int[]{1,3,2};
        assertArrayEquals(new int[]{1,2,3}, quickSort.sort(arr));
    }
```
![S6_11](https://user-images.githubusercontent.com/77414220/167462669-4811ff1a-16a6-4309-85b5-628f5737c9fc.PNG)

Se modifica nuevamente sort para asegurar que la nueva prueba no falle. Se ejecuta el test y pasa.
```java
    public static int[] sort(int[] unsorted){
        if(unsorted.length == 2)
            if(unsorted[0] > unsorted[1])
                return new int[]{unsorted[1],unsorted[0]};

        if(unsorted.length == 3){
            if(unsorted[1]>unsorted[2])
                return new int[]{unsorted[0],unsorted[2],unsorted[1]};
            if(unsorted[0] < unsorted[1])
                return new int[]{unsorted[0],unsorted[1],unsorted[2]};
            if(unsorted[0] > unsorted[1])
                return new int[]{unsorted[1],unsorted[0],unsorted[2]};
        }

        return unsorted;
    }
```
![S6_12](https://user-images.githubusercontent.com/77414220/167462873-833ccd8d-d7ee-49f9-94c8-cdd46e9c7d28.PNG)

Se agrega una nueva prueba, esta vez con los tres elementos completamente desordenados. Se ejecuta y falla.
```java
    //Octavo Test. Arreglo de tres elementos desordenados
     @Test
    public void quickSorterTest_ThreeElements4() {
        int[] arr = new int[]{3,2,1};
        assertArrayEquals(new int[]{1,2,3}, quickSort.sort(arr));
    }
```
![S6_13](https://user-images.githubusercontent.com/77414220/167463359-e8f011dd-56de-4ff9-a58c-db943606053e.PNG)

Los casos se han vuelto muy espec铆ficos, por lo cual es necesario hacer la primera refactorizaci贸n. Se ejecuta el test y pasa.
```java
    public static int[] sort(int[] unsorted){
        if(unsorted.length == 2)
            if(unsorted[0] > unsorted[1])
                return new int[]{unsorted[1],unsorted[0]};

        if(unsorted.length == 3){
            int pivot = 0, val = 0;
            int aux = 0;
            if(unsorted[0] > unsorted[2]){
                aux = unsorted[0];
                unsorted[0] = unsorted[2];
                unsorted[2] = aux;
            }
            if(unsorted[1] > unsorted[2]){
                aux = unsorted[2];
                unsorted[2] = unsorted[1];
                unsorted[1] = aux;
            }

            if(unsorted[0] > unsorted[1]){
                aux = unsorted[0];
                unsorted[0] = unsorted[1];
                unsorted[1] = aux;
            }
            return unsorted;
        }
        return unsorted;
    }
```
![S6_14](https://user-images.githubusercontent.com/77414220/167463676-cff46da3-c86f-434c-9b80-47e531bf134e.PNG)

Se a帽ade un nuevo test, esta vez de cuatro elementos ordenados. El test se ejecuta y pasa, por lo cual es necesario agregar una nueva prueba, la cual no pasa el test.
```java
    //Noveno Test. Arreglo de cuatro elementos desordenados
    @Test
    public void quickSorterTest_FourElements() {
        int[] arr = new int[]{1,2,3,4};
        assertArrayEquals(new int[]{1,2,3,4}, quickSort.sort(arr));
    }
```
![S6_15](https://user-images.githubusercontent.com/77414220/167464023-a991311b-3d05-4914-9163-b2b51c86836b.PNG)

```java
    //D茅cimo Test. Arreglo de cuatro elementos desordenados
    @Test
    public void quickSorterTest_FourElements2() {
        int[] arr = new int[]{2,1,3,4};
        assertArrayEquals(new int[]{1,2,3,4}, quickSort.sort(arr));
    }
```
![S6_16](https://user-images.githubusercontent.com/77414220/167464160-d8ad14c7-9677-4974-9346-8289dba9dcdb.PNG)

Una nueva refactorizaci贸n es necesaria, pues ya no es posible seguir utilizando el m茅todo seguido en arreglos de tres elementos. Se crea la funci贸n quickSortM() y partition(), que fungiran como auxiliares en la implementaci贸n del m茅todo de ordenamiento quicksort. Se ejecuta el test y pasa.

```java
    public static int[] sort(int[] unsorted){
        if(unsorted.length == 2)
            if(unsorted[0] > unsorted[1])
                return new int[]{unsorted[1],unsorted[0]};

        if(unsorted.length == 3){
            int pivot = 0, val = 0;
            int aux = 0;
            if(unsorted[0] > unsorted[2]){
                aux = unsorted[0];
                unsorted[0] = unsorted[2];
                unsorted[2] = aux;
            }
            if(unsorted[1] > unsorted[2]){
                aux = unsorted[2];
                unsorted[2] = unsorted[1];
                unsorted[1] = aux;
            }

            if(unsorted[0] > unsorted[1]){
                aux = unsorted[0];
                unsorted[0] = unsorted[1];
                unsorted[1] = aux;
            }

            return unsorted;
        }
        if(unsorted.length == 4){
            quickSortM(unsorted,0,3);
            return unsorted;
        }

        return unsorted;
    }

    public static void quickSortM(int[] unsort, int low,int high){
        if(low < high){
            int pivot = partition(unsort,low,high);

            quickSortM(unsort,low,pivot-1);
            quickSortM(unsort,pivot+1,high);
        }

    }

    public static int partition(int a[], int low, int high){
        int pivot = a[high];
        int i = (low - 1);

        for(int j = low; j < high; j++){
            if(a[j] <= pivot){
                i++;

                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        int temp = a[i+1];
        a[i+1] = a[high];
        a[high] = temp;

        return (i+1);
    }
```
![S6_17](https://user-images.githubusercontent.com/77414220/167465231-fa9e331a-cd5c-4de7-ba53-2a70a41bf19d.PNG)
Se agrega dos nuevas pruebas, para asegurar el funcionamiento del nuevo bloque de c贸digo. Ambas pruebas pasan.
```java
    //Onceavo Test. Arreglo de cuatro elementos desordenados
    @Test
    public void quickSorterTest_FourElements3() {
        int[] arr = new int[]{2,1,4,3};
        assertArrayEquals(new int[]{1,2,3,4}, quickSort.sort(arr));
    }
```
![S6_18](https://user-images.githubusercontent.com/77414220/167465302-c3362ac1-2d6f-4087-9704-061e620e9962.PNG)

```java
    //Doceavo Test. Arreglo de cuatro elementos desordenados
    @Test
    public void quickSorterTest_FourElements4() {
        int[] arr = new int[]{4,1,3,2};
        assertArrayEquals(new int[]{1,2,3,4}, quickSort.sort(arr));
    }
```
![S6_19](https://user-images.githubusercontent.com/77414220/167465561-30e01b17-d3e1-43a2-8dda-67ba678041a4.PNG)

Se ha comprobado que el programa funciona con arreglos de cuatro elementos, por lo cual se agrega un nuevo test, de cinco elementos, el cual pasa la prueba.
```java
    //Treceavo Test. Arreglo de cuatro elementos desordenados
    @Test
    public void quickSorterTest_FiveElements() {
        int[] arr = new int[]{1,2,3,4,5};
        assertArrayEquals(new int[]{1,2,3,4,5}, quickSort.sort(arr));
    }
```
![S6_20](https://user-images.githubusercontent.com/77414220/167465734-fac99dde-4e40-4424-bcf5-17745ea04da8.PNG)

Finalmente se hace la 煤ltima prueba, con cinco elementos desordenados. El test falla.
```java
    //Catorceavo Test. Arreglo de cuatro elementos desordenados
    @Test
    public void quickSorterTest_FiveElements1() {
        int[] arr = new int[]{5,4,3,2,1};
        assertArrayEquals(new int[]{1,2,3,4,5}, quickSort.sort(arr));
    }
```
![S6_21](https://user-images.githubusercontent.com/77414220/167465892-9aca5b54-2cbd-461f-85bb-92b96b9eb8b7.PNG)

Se realiza la 煤ltima modificaci贸n de la clase sort. Esta vez, se eliminaran los casos espec铆ficos de dos y tres elementos, de modo que permita implementar el m茅todo desarrollado anteriormente y comprobar su funcionalidad en todos los casos posibles. Se ejecutan nuevamente todos los tests, los cuales pasan la prueba.
```java
    public static int[] sort(int[] unsorted){

        if(unsorted.length >= 2){
            quickSortM(unsorted,0,unsorted.length-1);
            return unsorted;
        }

        return unsorted;
    }

    public static void quickSortM(int[] unsort, int low,int high){
        if(low < high){
            int pivot = partition(unsort,low,high);

            quickSortM(unsort,low,pivot-1);
            quickSortM(unsort,pivot+1,high);
        }

    }

    public static int partition(int a[], int low, int high){
        int pivot = a[high];
        int i = (low - 1);

        for(int j = low; j < high; j++){
            if(a[j] <= pivot){
                i++;

                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        int temp = a[i+1];
        a[i+1] = a[high];
        a[high] = temp;

        return (i+1);
    }
```
![S6_22](https://user-images.githubusercontent.com/77414220/167466365-741aecc6-ea65-43d4-85e8-9d36beb424a8.PNG)

Se ha comprobado que el nuevo c贸digo funciona para todos los casos, por lo cual, se determina que ya no es necesario seguir haciendo m谩s pruebas.



### Indicaciones generales

驴Terminaste la actividad? Responde las siguientes preguntas:

**驴Cu谩l fue el paso clave para poder transicionar de un bubble sort a un quicksort?**

No hubo una transici贸n como tal, pero la clave fue irnos guiando en las pruebas y saber que si algo no funcionaba, siempre pod铆amos volver al estado anterior.

**驴Crees que fue m谩s f谩cil implementar un quicksort de esta forma que hacerlo sin pruebas? 驴Por qu茅?**

S铆, porque cada nuevo bloque que se a帽ad铆a o modificaba garantizaba funcionalidad.

**驴Crees que existe diferencia entre las pruebas realizadas para un bubble sort y un quicksort?**

En este caso, al ser m茅todos cuya funcionalidad es la misma, las pruebas fueron las mismas en su mayor铆a, sin embargo el quicksort tuvo un mayor n煤mero de pruebas para garantizar el funcionamiento.



## 鉁? Checklist

Aseg煤rate que tu postwork contenga todo lo siguiente, ya que esto se evaluar谩 al t茅rmino del m贸dulo.

- 鉁? T煤 implementaci贸n del algoritmo bubble sort funciona correctamente (se a帽ade Quicksort cuyo proceso tambi茅n esta documentado).


- 鉁? Seguiste un proceso de TDD para su desarrollo


- 鉁? Documentaste cada paso del desarrollo








































>

