package problema_05

import java.util.*

// Escreva um programa que inverta os caracteres de um string.
//
// IMPORTANTE:
// a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
// b) Evite usar funções prontas, como, por exemplo, reverse;
fun main() {
  val str = "abc 123"
  val result = inverterString(str)

  println("$str invertido é: $result")
}

fun inverterString(str: String): String {
  var inverted = ""
  for (i in str.length - 1 downTo 0) {
    inverted += str[i]
  }

  return inverted
}