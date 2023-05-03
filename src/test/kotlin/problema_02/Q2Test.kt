package problema_02

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Q2Test {

  @Test
  fun `retorna a sequencia de Fibonacci para o numero 0`() {
    val resultado = verificarSequenciaFibonacci(0, mutableListOf(0, 1), 0)
    Assertions.assertEquals(listOf(0), resultado.first)
    Assertions.assertTrue(resultado.second)
  }

  @Test
  fun `retorna a sequencia de Fibonacci para o numero 5`() {
    val resultado = verificarSequenciaFibonacci(5, mutableListOf(0, 1), 0)
    Assertions.assertEquals(listOf(0, 1, 1, 2, 3, 5), resultado.first)
    Assertions.assertTrue(resultado.second)
  }

  @Test
  fun `retorna a sequencia de Fibonacci para o numero 8`() {
    val resultado = verificarSequenciaFibonacci(8, mutableListOf(0, 1), 0)
    Assertions.assertEquals(listOf(0, 1, 1, 2, 3, 5, 8), resultado.first)
    Assertions.assertTrue(resultado.second)
  }

  @Test
  fun `retorna que o numero 4 nao pertence a sequencia de Fibonacci`() {
    val resultado = verificarSequenciaFibonacci(4, mutableListOf(0, 1), 0)
    Assertions.assertFalse(resultado.second)
  }

  @Test
  fun `retorna que o numero -5 e invalido`() {
    val resultado = verificarSequenciaFibonacci(-1, mutableListOf(0, 1), 0)
    Assertions.assertFalse(resultado.second)
  }
}