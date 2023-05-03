package problema_01

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Q1Test {

  @Test
  fun `deve calcular a soma dos numeros ate o indice fornecido`() {
    val result = somarNumerosAte(13)
    Assertions.assertEquals(91, result)
  }

  @Test
  fun `somar numeros ate zero`() {
    val result = somarNumerosAte(0)
    Assertions.assertEquals(0, result)
  }

  @Test
  fun `somar numeros ate um`() {
    val result = somarNumerosAte(1)
    Assertions.assertEquals(1, result)
  }

  @Test
  fun `somar numeros ate cinco`() {
    val result = somarNumerosAte(5)
    Assertions.assertEquals(15, result)
  }

  @Test
  fun `somar numeros ate dez`() {
    val result = somarNumerosAte(10)
    Assertions.assertEquals(55, result)
  }
}