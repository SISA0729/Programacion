Colecciones (I): ArrayList

Contenido
Cómo crear una instancia de ArrayList	1
Métodos que podemos utilizar con un ArrayList	2
Cómo recorrer un ArrayList	4
Cómo ordenar un ArrayList	5


******Cómo crear una instancia de ArrayList******
=========================================================================

Para poder utilizar la clase lo habitual es importarla:
import java.util.ArrayList;


Una vez hecho esto, hay varias formas de crear instancias de esta clase:
Lo más sencillo es con la palabra new, indicando en <> el tipo de datos que va a almacenar:
ArrayList<String> lista = new ArrayList<>(); // arraylist de String


Esta lista se crea vacía, con una capacidad inicial de 10 (es el tamaño por defecto).
También podemos crearlo con una capacidad inicial determinada, poniendo el tamaño entre paréntesis:
ArrayList<String> lista = new ArrayList<>(50);
Aquí tenemos una lista vacía, con una capacidad inicial de 50.
También podemos crear un ArrayList formado por los elementos de otro ArrayList:
ArrayList<String> lista = new ArrayList<>(otraLista);
Independientemente de cómo hayamos creado la instancia de ArrayList, su tamaño puede cambiar dinámicamente.


******Métodos que podemos utilizar con un ArrayList******
===============================================================


Los podemos encontrar en la API de Java:

Vamos a mostrar algunos de ellos con un ArrayList de String llamado nombres, que utilizaremos como ejemplo.
ArrayList<String> nombres = new ArrayList<>();
size(): int
Nos indica el tamaño devolviendo el número de elementos del ArrayList. En nuestro caso se invocaría  así:
int tamaño = nombres.size();


add(E e): boolean
Añade el elemento que le pasamos entre paréntesis y lo coloca al final, en la última posición:
nombres.add("Justino");      // [Justino]
nombres.add("Helena");       // [Justino, Helena]

add(int index, E element): void
añade el elemento que le pasamos entre paréntesis y lo coloca en la posición indicada:
nombres.add(1, "Joshua");   // [Justino, Joshua, Helena]
nombres.add(0, "Laura");    // [Laura, Justino, Joshua, Helena]

get(int index): E
devuelve el elemento que hay en la posición indicada
String elemento = nombres.get(3); // elemento = “Helena”

set(int index, E element): E
sustituye el elemento que ocupa el índice que le pasamos entre paréntesis por el objeto indicado:
nombres.set(3, "Mario"); // [Laura, Justino, Joshua, Mario]
Para ver lo que tenemos en cada momento podemos imprimir directamente:
System.out.println(nombres);        // [Laura, Justino, Joshua, Mario]
System.out.println(nombres.size()); // 4
System.out.println(nombres.get(0)); // "Laura"
System.out.println(nombres.get(3)); // "Mario"

remove(Object o): boolean
elimina la primera ocurrencia del elemento que le pasamos entre paréntesis:
nombres.remove("Justino"); // [Laura, Joshua, Mario]

remove(int index): E
elimina el elemento que le pasamos entre paréntesis:
nombres.remove(1);        // [Laura, Mario]

clear():
elimina todos los elementos y deja el arrayList vacío
nombres.clear();          // []

addAll(Collection c): boolean
añade al final del arrayList todos los elementos de otro arrayList que le pasemos
Vamos a verlo con otro ejemplo.
Como hemos dicho, no podemos crear un ArrayList de alguno de los tipos primitivos, por lo que, si queremos tener un ArrayList de números enteros, utilizaremos la clase Integer (de la misma forma, tenemos las clases Byte, Short, Long, Double, Float, Character y Boolean que representan a los otros siete tipos primitivos):
números.add(1);
números.add(2);
números.add(3);
números.add(1);
ArrayList<Integer> números2 = new ArrayList<>();
números2.add(100);
números2.addAll(números); // [100, 1, 2, 3, 1]

contains(Object o): boolean
comprueba si el ArrayList contiene el elemento especificado.
números.contains(2);  // true
números.contains(4);  // false

indexOf(Object o): int
devuelve el índice de la primera ocurrencia del elemento especificado.
números.indexOf(1);  // 0
lastIndexOf(Object o): int
devuelve el índice de la última ocurrencia del elemento especificado.
números.lastIndexOf(1);  // 3
números.lastIndexOf(4);  // -1


******Cómo recorrer un ArrayList******
=========================================================================

Se puede iterar sobre los elementos de un ArrayList de la misma forma que sobre un array, con los bucles for y for-each. Por ejemplo:
ArrayList<Integer> numerosEnteros = new ArrayList<>();

for (int i = 0; i < 5; i++) {
numerosEnteros.add(i);
}

for (Integer elemento : numerosEnteros) {
System.out.print(elemento + " ");
}


******Cómo ordenar un ArrayList******
============================================================================

Utilizando el método sort() de la clase Collections. Por ejemplo:
// Creamos el ArrayList
ArrayList<Integer> numeros = new ArrayList<>();

// Lo rellenamos con cuetro números
numeros.add(13);
numeros.add(23);
numeros.add(3);
numeros.add(-3);

System.out.println(numeros); // imprime [13, 23, 3, -3]

// Para ordenarlo:
Collections.sort(numeros);
System.out.println(numeros); // imprime [-3, 3, 13, 23]
