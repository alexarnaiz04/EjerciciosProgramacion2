/*
Para demostrar que T(n) = 3 · log₂(n) + 2 está en el orden O(log₂(n)), podemos elegir k = 5 y n₀ = 1, lo que cumple con la definición 
dada.

Si T(n) ∈ O(log₂(n)), entonces T(n) ∈ O(n) es verdadero, ya que cualquier función logarítmica crece más lentamente que cualquier 
función lineal.

Si T(n) ∈ O(log₃(n)), no necesariamente implica que T(n) ∈ O(log₂(n)), ya que el crecimiento de una función logarítmica base 3 puede 
ser diferente al de una función logarítmica base 2.
 */