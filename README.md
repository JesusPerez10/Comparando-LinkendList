Problemas con LinkedList en Java

Este proyecto proporciona soluciones a tres problemas comunes utilizando LinkedList de la biblioteca de colecciones de Java.

Problemas Resueltos

1. Eliminar Duplicados de una LinkedList

Descripción: Dada una LinkedList<Integer>, eliminar todos los valores duplicados, dejando solo la primera aparición de cada número.

Método: removeDuplicates(LinkedList<Integer> list)

Enfoque:

Usar un HashSet para rastrear los valores únicos.

Iterar sobre la lista con un Iterator y eliminar los duplicados en el lugar.

2. Invertir una LinkedList en el Mismo Lugar

Descripción: Invertir los elementos de una LinkedList<String> sin usar otra lista o ArrayList.

Método: reverseLinkedList(LinkedList<String> list)

Enfoque:

Usar dos ListIterator, uno desde el inicio y otro desde el final.

Intercambiar elementos moviéndose hacia el centro sin utilizar memoria adicional.

3. Mezclar Dos LinkedLists Ordenadas

Descripción: Dadas dos LinkedList<Integer> ordenadas, combinarlas en una nueva LinkedList<Integer> ordenada.

Método: mergeSortedLists(LinkedList<Integer> list1, LinkedList<Integer> list2)

Enfoque:

Usar iteradores para recorrer ambas listas.

Comparar elementos y agregarlos en orden a la nueva lista.

Cómo Ejecutar

Compilar y ejecutar LinkedListProblems.java.

El método main demuestra y muestra los resultados de cada problema.

Ejemplo de Salida

Lista sin duplicados: [1, 2, 3, 4, 5]
Lista invertida: [E, D, C, B, A]
Lista intercalada ordenada: [1, 2, 3, 4, 5, 6, 7, 8]

Tecnologías Utilizadas

Java

Biblioteca de Colecciones de Java (LinkedList, HashSet, Iterator, ListIterator)
