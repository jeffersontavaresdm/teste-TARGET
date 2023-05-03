package problema_03

// Descubra a lógica e complete o próximo elemento:
// a) 1, 3, 5, 7, ___
// b) 2, 4, 8, 16, 32, 64, ____
// c) 0, 1, 4, 9, 16, 25, 36, ____
// d) 4, 16, 36, 64, ____
// e) 1, 1, 2, 3, 5, 8, ____
// f) 2, 10, 12, 16, 17, 18, 19, ____

/**
 * As sequências apresentadas têm padrões distintos.
 * Para completar o próximo elemento de cada uma delas, é necessário identificar a lógica por trás de cada uma.
 *
 *
 */
fun main() {
  val (nextNumberA, numbersA) = generateNextNumberA(mutableListOf(1, 3, 5, 7))
  println("Próximo número é: [$nextNumberA] - Lista completa: $numbersA")

  val (nextNumberB, numbersB) = generateNextNumberB(mutableListOf(2, 4, 8, 16, 32, 64))
  println("Próximo número é: [$nextNumberB] - Lista completa: $numbersB")

  val (nextNumberC, numbersC) = generateNextNumberC(mutableListOf(0, 1, 4, 9, 16, 25, 36))
  println("Próximo número é: [$nextNumberC] - Lista completa: $numbersC")

  val (nextNumberD, numbersD) = generateNextNumberD(mutableListOf(4, 16, 36, 64))
  println("Próximo número é: [$nextNumberD] - Lista completa: $numbersD")

  val (nextNumberE, numbersE) = generateNextNumberE(mutableListOf(1, 1, 2, 3, 5, 8))
  println("Próximo número é: [$nextNumberE] - Lista completa: $numbersE")

  val (nextNumber, numbers) = generateNextNumberF(mutableListOf(2, 10, 12, 16, 17, 18, 19))
  println("Próximo número é: [$nextNumber] - Lista completa: $numbers")
}

/**
 * A lógica por trás dessa sequência é que cada número é o anterior mais 2. Portanto, o próximo número seria 9.
 */
val generateNextNumberA = fun(numbers: MutableList<Int>): Pair<Int, MutableList<Int>> {
  return if (numbers.isNotEmpty()) {
    val nextNumber = numbers.last() + 2

    numbers.add(nextNumber)

    Pair(nextNumber, numbers)
  } else {
    Pair(0, numbers)
  }
}

/**
 * A lógica por trás dessa sequência é que cada número é o anterior multiplicado por 2. Portanto, o próximo número seria 128.
 */
val generateNextNumberB = fun(numbers: MutableList<Int>): Pair<Int, MutableList<Int>> {
  return if (numbers.isNotEmpty()) {
    val nextNumber = numbers.last() * 2

    numbers.add(nextNumber)

    Pair(nextNumber, numbers)
  } else {
    Pair(0, numbers)
  }
}

/**
 * A lógica por trás dessa sequência é que cada número é o quadrado do seu índice na sequência. Portanto, o próximo número seria 49.
 */
val generateNextNumberC = fun(numbers: MutableList<Int>): Pair<Int, MutableList<Int>> {
  return if (numbers.isNotEmpty()) {
    val nextNumber = (numbers.size * numbers.size)

    numbers.add(nextNumber)

    Pair(nextNumber, numbers)
  } else {
    Pair(0, numbers)
  }
}

/**
 * A lógica por trás dessa sequência é que cada número é o quadrado dos números 2, 4, 6 e 8.
 * Para saber o próximo número, basta ver o ultimo número + 2.
 * Assim, o próximo número na sequência seria 10, que ao quadrado é 100. Portanto, o próximo número seria 100.
 */
val generateNextNumberD = fun(numbers: MutableList<Int>): Pair<Int, MutableList<Int>> {
  return if (numbers.isNotEmpty()) {
    val numbersWithSquareRoot = fun(sequence: MutableList<Int>): MutableList<Int> {
      val result = mutableListOf<Int>()

      sequence.indices
        .asSequence()
        .map { if (it == 0) 2 else result[it - 1] + 2 }
        .forEach { result.add(it) }

      return result
    }(numbers)

    val nextNumber = (numbersWithSquareRoot.last() + 2) * (numbersWithSquareRoot.last() + 2)

    numbers.add(nextNumber)

    Pair(nextNumber, numbers)
  } else {
    Pair(0, numbers)
  }
}

/**
 * A lógica por trás dessa sequência é que cada número é a soma dos dois ultimos números da lista. Portanto, o próximo número seria 13.
 */
val generateNextNumberE = fun(numbers: MutableList<Int>): Pair<Int, MutableList<Int>> {
  return if (numbers.isNotEmpty()) {
    val nextNumber = numbers.last() + numbers[numbers.lastIndex - 1]

    numbers.add(nextNumber)

    Pair(nextNumber, numbers)
  } else {
    Pair(0, numbers)
  }
}

/**
 * A lógica por trás dessa sequência é que cada número começa com a letra D. Portanto, o próximo número seria 200.
 */
val generateNextNumberF = fun(numbers: MutableList<Int>): Pair<Int, MutableList<Int>> {
  return if (numbers.isNotEmpty()) {
    var lastNumber = numbers.last()
    val firstChar = numeroPorExtenso(lastNumber)[0]
    var nextNumberString = numeroPorExtenso(lastNumber + 1)
    var nextNumber = 0

    while (firstChar != nextNumberString[0]) {
      lastNumber += 1
      nextNumberString = numeroPorExtenso(lastNumber)
      if (firstChar == nextNumberString[0]) {
        nextNumber = lastNumber
        break
      }
    }

    numbers.add(nextNumber)

    Pair(nextNumber, numbers)
  } else {
    Pair(0, numbers)
  }
}

fun numeroPorExtenso(numero: Int): String {
  if (numero == 0) {
    return ""
  }

  val centenas = arrayOf(
    "",
    "Cento",
    "Duzentos",
    "Trezentos",
    "Quatrocentos",
    "Quinhentos",
    "Seiscentos",
    "Setecentos",
    "Oitocentos",
    "Novecentos"
  )
  val dezenas = arrayOf(
    "",
    "Dez",
    "Vinte",
    "Trinta",
    "Quarenta",
    "Cinquenta",
    "Sessenta",
    "Setenta",
    "Oitenta",
    "Noventa"
  )
  val unidades = arrayOf(
    "Zero",
    "Um",
    "Dois",
    "Três",
    "Quatro",
    "Cinco",
    "Seis",
    "Sete",
    "Oito",
    "Nove",
    "Dez",
    "Onze",
    "Doze",
    "Treze",
    "Catorze",
    "Quinze",
    "Dezesseis",
    "Dezessete",
    "Dezoito",
    "Dezenove"
  )

  val centena = numero / 100
  val dezena = (numero % 100) / 10
  val unidade = numero % 10

  val sb = StringBuilder()

  if (centena > 0) {
    sb.append(centenas[centena]).append(" ")
  }

  if (dezena > 0) {
    if (dezena == 1) {
      sb.append(unidades[10 + unidade]).append(" ")
    } else {
      sb.append(dezenas[dezena]).append(" ")
    }
  }

  if (unidade > 0 && dezena != 1) {
    sb.append(unidades[unidade]).append(" ")
  }

  return sb.trim().toString()
}
