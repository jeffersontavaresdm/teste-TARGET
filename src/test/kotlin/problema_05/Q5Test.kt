package problema_05

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Q5Test {

  @Test
  fun testInverterStringComStringVazia() {
    val resultado = inverterString("")
    Assertions.assertEquals("", resultado, "O resultado deve ser uma string vazia")
  }

  @Test
  fun testInverterStringComUmaLetra() {
    val resultado = inverterString("a")
    Assertions.assertEquals("a", resultado, "O resultado deve ser a mesma letra")
  }

  @Test
  fun testInverterStringComPalavra() {
    val resultado = inverterString("palavra")
    Assertions.assertEquals("arvalap", resultado, "O resultado deve ser a palavra invertida")
  }

  @Test
  fun testInverterStringComFrase() {
    val resultado = inverterString("Esta é uma frase.")
    Assertions.assertEquals(".esarf amu é atsE", resultado, "O resultado deve ser a frase invertida")
  }

  @Test
  fun testInverterStringComStringComEspacos() {
    val resultado = inverterString("  espacos  ")
    Assertions.assertEquals("  socapse  ", resultado, "O resultado deve ser a string com espaços invertida")
  }
}