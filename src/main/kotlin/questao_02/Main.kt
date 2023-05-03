package questao_02

import java.util.*

// Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores
// Exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...
//
// Escreva um programa onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando
// se o número informado pertence ou não a sequência.
//
// IMPORTANTE:
// Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;

/**
 * Este programa usa uma função recursiva chamada fibonacci para calcular a sequência de Fibonacci até o valor desejado.
 * A função recebe três parâmetros:
 * valor: o valor desejado na sequência de Fibonacci;
 * valores: uma lista encadeada (LinkedList) que armazena os valores da sequência de Fibonacci até o momento;
 * index: o índice atual na lista valores.
 *
 * A função recursiva adiciona o próximo valor da sequência de Fibonacci à lista valores a cada chamada.
 * Quando o índice atinge o valor desejado (index == valor), a função retorna a lista valores.
 *
 * O programa principal pede ao usuário que digite um número e chama a função fibonacci para calcular a sequência até aquele número.
 * Em seguida, o programa verifica se o número digitado pelo usuário pertence à sequência.
 */
fun main() {
  val scanner = Scanner(System.`in`)

  print("Digite um número para verificar se pertence a sequência de Fibonacci: ")

  val input: Int = scanner.nextInt()

  if (input >= 0) {
    val result = fibonacci(input, mutableListOf(0, 1), 0)

    if (result.second) {
      println("O valor digitado PERTENCE a sequência de Fibonacci!")
    } else {
      println("O valor digitado NÃO PERTENCE a sequência de Fibonacci!")
    }

    print(
      """
      Deseja ver a sequência até o número $input?
      Se o número digitado não pertencer a sequência de Fibonacci a lista conterá os números até o próximo valor após o valor digitado.
      Digite s/S para sim e qualquer outra tecla para não: 
      """.trimIndent()
    )
    val check = scanner.next()[0]

    if ((check == 's').or(check == 'S')) {
      println("Sequência de Fibonacci para o número $input: ${result.first}")
    }
  } else {
    println("Valor digitado é inválido.")
  }
}

fun fibonacci(valor: Int, valores: MutableList<Int>, index: Int): Pair<List<Int>, Boolean> {
  if (index == valor) {
    return if (valores.contains(valor)) {
      Pair(valores.takeWhile { it <= valor }, true)
    } else {
      val result = valores.takeWhile { it <= valor }.toMutableList()
      val lastValue = valores[valores.indexOf(result.last()) + 1]
      result.add(lastValue)

      Pair(result, false)
    }
  }

  valores.add(valores[index] + valores[index + 1])

  return fibonacci(valor, valores, index + 1)
}