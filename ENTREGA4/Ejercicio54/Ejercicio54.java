/*
La complejidad temporal de cada expresión determina cuántas veces se ejecutará la instrucción (o bloque de instrucciones) en función 
del tamaño de la entrada (n). Luego, multiplicaremos esta cantidad por el tiempo que tarda cada instrucción para obtener el tiempo requerido.

Suponiendo que una instrucción tarda en ejecutarse 10 ns, calculamos el tiempo requerido para cada caso con las dos configuraciones proporcionadas:


Para n = 100:

log(n): log(100) ≈ 2 (base 10). Tiempo requerido: 2 * 10 ns = 20 ns.
n: 100. Tiempo requerido: 100 * 10 ns = 1000 ns = 1 µs.
nlog(n): 100 * log(100) ≈ 200 (base 10). Tiempo requerido: 200 * 10 ns = 2000 ns = 2 µs.
n^2: 100^2 = 10000. Tiempo requerido: 10000 * 10 ns = 100000 ns = 0.1 ms.
n^8: 100^8 ≈ 10^16. Tiempo requerido: 10^16 * 10 ns = 10^17 ns.
10^n: 10^100. Tiempo requerido: 10^100 * 10 ns = 10^101 ns.


Para n = 100,000 y tiempo de instrucción de 1 ms (10^6 ns):

log(n): log(100000) ≈ 5 (base 10). Tiempo requerido: 5 * 10^6 ns = 5 ms.
n: 100000. Tiempo requerido: 100000 * 10^6 ns = 10^11 ns = 100 s.
nlog(n): 100000 * log(100000) ≈ 500000 (base 10). Tiempo requerido: 500000 * 10^6 ns = 500 s.
n^2: 100000^2 = 10^10. Tiempo requerido: 10^10 * 10^6 ns = 10^16 ns = 10^10 s = 316 años (aproximadamente).
n^8: 100000^8 ≈ 10^32. Tiempo requerido: 10^32 * 10^6 ns = 10^38 ns.
10^n: 10^100000. Tiempo requerido: 10^100000 * 10^6 ns = 10^106 ns.

Estos cálculos muestran cómo el tiempo aumenta significativamente con el tamaño de la entrada y la complejidad de la expresión. 
*/