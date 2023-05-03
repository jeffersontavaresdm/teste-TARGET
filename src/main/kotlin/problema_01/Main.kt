package problema_01

// Observe o trecho de código abaixo:
// int INDICE = 13, SOMA = 0, K = 0;
// enquanto K < INDICE faça
// {
//   K = K + 1;
//   SOMA = SOMA + K;
// }
//
// imprimir(SOMA);
//
// Ao final do processamento, qual será o valor da variável SOMA?

/**
 * Matematicamente, podemos representar essa soma usando a fórmula da soma dos termos de uma progressão aritmética:
 * S = (n * (a1 + an)) / 2
 *
 * onde:
 * S é a soma dos termos;
 * n é o número de termos;
 * a1 é o primeiro termo;
 * an é o último termo.
 *
 * No caso, temos:
 * n = 13 (pois estamos somando os primeiros 13 números inteiros);
 * a1 = 1 (pois estamos começando a soma pelo número 1);
 * an = 13 (pois estamos somando até o número 13).
 *
 * Substituindo na fórmula, temos:
 * S = (13 * (1 + 13)) / 2
 * S = (13 * 14) / 2
 * S = 91
 *
 * Portanto, a soma dos primeiros 13 números inteiros é 91.
 *
 * Uma forma mais simples é que podemos imaginar que queremos somar todos os números inteiros de 1 até 13,
 * ou seja, queremos fazer a soma:
 * 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 + 11 + 12 + 13
 *
 * Para fazer isso basta por um break point na linha 34 (linha que contem while (K < INDICE) {) e ir passando linha a linha
 * para entender melhor, o SOMA começa com 0 e na primeira vez que entra no escopo do while soma o numero atual (0) +
 * o valor de K (que já acrescentou 1 e agora é 0 + 1), assim na proxima vez que passar somará valor atual (1) + valor atual de K (2)
 * e assim por diante até que K seja igual a 13 e não entrando mais no escopo do while. Assim o valor de SOMA é 91.
 */
fun main() {
  val result = somarNumerosAte(13)

  println("Resultado da soma até 13 é: $result")
}

fun somarNumerosAte(indice: Int): Int {
  var soma = 0
  var k = 0

  while (k < indice) {
    k++
    soma += k
  }

  return soma
}