/*
El algoritmo escogido es una función recursiva que calcula la suma de los elementos en una lista de enteros.

Complejidad temporal:

En cada llamada recursiva, el algoritmo realiza operaciones de acceso y eliminación del primer elemento de la lista. Ambas operaciones 
tienen una complejidad de O(1) en listas enlazadas como las implementadas por la clase ArrayList de Java. Sin embargo, la operación 
lista.remove(0) tiene una complejidad de O(n) en listas enlazadas simples, donde n es el tamaño de la lista. Esto se debe a que después 
de eliminar el primer elemento, los elementos restantes deben moverse hacia la izquierda para llenar el espacio vacío. Por lo tanto, el 
peor caso de tiempo para esta operación en cada llamada recursiva sería O(n).
Entonces, la complejidad temporal total del algoritmo será O(n^2) en el peor de los casos, ya que para cada llamada recursiva, se puede 
requerir un tiempo O(n) para eliminar el primer elemento de la lista.

Complejidad espacial:

Está determinada por el número máximo de llamadas recursivas pendientes en la pila de llamadas (stack). En este caso, como la función 
se llama recursivamente para cada elemento en la lista, la profundidad máxima de la pila de llamadas será igual al número de elementos en la lista.
Por lo tanto, la complejidad espacial del algoritmo será O(n), donde n es el tamaño de la lista.

Comparación con el enfoque iterativo:

Un enfoque iterativo para calcular la suma de los elementos de la lista tendría una complejidad temporal y espacial de O(n), ya que 
simplemente recorrería la lista una vez, sumando los elementos en el camino sin requerir llamadas recursivas adicionales.
En términos de complejidad, el enfoque iterativo sería más eficiente tanto en tiempo como en espacio, ya que evitaría la sobrecarga de 
llamadas recursivas y el potencial costo asociado con la eliminación de elementos de la lista en cada llamada recursiva.
*/