/*
El problema de la Torre de Hanoi es un problema clásico en la teoría de algoritmos. Se trata de mover un conjunto de discos de
tamaños diferentes de una torre a otra, siguiendo ciertas reglas. Las reglas son las siguientes:


1. Sólo se puede mover un disco a la vez.
2. Los discos más grandes no se pueden colocar encima de discos más pequeños.
3. Todos los discos deben transferirse de una torre a otra.


El problema de la Torre de Hanoi se puede resolver mediante recursividad. La solución es dividir el problema en subproblemas más pequeños y resolver cada uno de ellos de forma recursiva.


El algoritmo para resolver el problema de la Torre de Hanoi es el siguiente:


1. Mueva el disco más pequeño de la torre fuente a la torre intermedia.
2. Mueva el disco más grande de la torre de origen a la torre de destino.
3. Mueva el disco más pequeño de la torre del medio a la torre de destino.


Este proceso se repite hasta que todos los discos se entregan a la torre de destino. El número total de movimientos necesarios es 2^n - 1, donde n es el número de discos.
*/