/*
Sí, es cierto. La complejidad de la inserción en un ArrayList varía dependiendo de si el ArrayList está ordenado o no.

Cuando el ArrayList no está ordenado, la inserción es rápida (O(1)), ya que simplemente se agrega al final de la lista sin necesidad de 
desplazar otros elementos.

Sin embargo, si el ArrayList está ordenado, la inserción requiere mantener el orden, lo que podría implicar desplazar otros elementos 
para hacer espacio. Esto puede llevar más tiempo (O(n)), ya que se deben mover todos los elementos mayores al nuevo elemento.
 */