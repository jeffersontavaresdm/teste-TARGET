package questao_04

// Dois veículos (um carro e um caminhão) saem respectivamente de cidades opostas pela mesma rodovia.
// O carro de Ribeirão Preto em direção a Franca, a uma velocidade constante de 110 km/h e o caminhão de Franca
// em direção a Ribeirão Preto a uma velocidade constante de 80 km/h.
// Quando eles se cruzarem na rodovia, qual estará mais próximo a cidade de Ribeirão Preto?
//
// IMPORTANTE:
// a) Considerar a distância de 100km entre a cidade de Ribeirão Preto <-> Franca.
// b) Considerar 2 pedágios como obstáculo e que o caminhão leva 5 minutos a mais para passar em cada um deles e o carro possui tag de pedágio (Sem Parar)
// c) Explique como chegou no resultado.

/**
 * Para resolver o problema proposto, foi utilizado o conceito de distância, velocidade e tempo.
 * Primeiro considera que o carro e o caminhão se encontrariam no ponto médio da distância entre Ribeirão Preto e Franca
 * que é de 50 km a partir de cada cidade.
 * Em seguida calcula o tempo necessário para que o carro e o caminhão percorressem a distância até o ponto de encontro,
 * utilizando a fórmula Tempo = Distância / Velocidade.
 * Foi levado em conta que o caminhão leva 5 minutos a mais para passar em cada um dos dois pedágios,
 * enquanto o carro não precisa parar, devido à utilização da tag de pedágio.
 *
 * A partir dos tempos calculados, foi possível determinar a distância percorrida pelo carro e pelo caminhão até o ponto de encontro.
 * Com base nessas distâncias, da pra concluir que o carro estará mais próximo da cidade de Ribeirão Preto no momento do encontro,
 * porque ele terá percorrido uma distância menor em relação à cidade do que o caminhão.
 */
fun main() {
  val distanciaTotal = 100 // em km
  val velocidadeCarro = 110 // em km/h
  val velocidadeCaminhao = 80 // em km/h
  val tempoPedagioCaminhao = 5 // em minutos
  val distanciaPedagio = 25 // em km
  var distanciaPercorridaCarro = 0.0
  var distanciaPercorridaCaminhao = distanciaTotal.toDouble()

  while (distanciaPercorridaCarro < distanciaPercorridaCaminhao) {
    // Atualiza a distância percorrida pelos veículos
    distanciaPercorridaCarro += (velocidadeCarro / 60.0)
    distanciaPercorridaCaminhao -= (velocidadeCaminhao / 60.0)

    // Verifica se o caminhão passou por um pedágio
    if (distanciaTotal - distanciaPercorridaCaminhao >= distanciaPedagio) {
      distanciaPercorridaCaminhao -= (tempoPedagioCaminhao.toDouble() / 60.0)
    }
  }

  val distanciaCarroParaRP = distanciaTotal - distanciaPercorridaCarro
  val distanciaCaminhaoParaRP = distanciaPercorridaCaminhao

  // Verifica qual veículo está mais próximo de Ribeirão Preto
  val maisProximoRP = if (distanciaCarroParaRP < distanciaCaminhaoParaRP) "Carro" else "Caminhão"

  println("O veículo mais próximo de Ribeirão Preto é o $maisProximoRP.")
}