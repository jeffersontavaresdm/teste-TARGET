package problema_04

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Q4Test {

  @Test
  fun testCalculaMaisProximo() {
    val resultado = calculaMaisProximo()
    Assertions.assertEquals("Carro", resultado, "O resultado deve ser 'Carro'")
  }
}