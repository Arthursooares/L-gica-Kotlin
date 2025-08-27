fun main() {
    val valores = mutableListOf<Double>()

    println("Digite 6 valores:")

    var i = 1
    while (valores.size < 6 ) {
        print("Valor $i: ")
        val entrada = readLine()?.toDoubleOrNull()
        if (entrada == null) {
            println("Entrada inválida. Tente novamente. ")
        } else if (valores.contains(entrada)) {
            println("Valor já informado. Digite um valor diferente. ")
        } else {
            valores.add(entrada)
            i++
        }

    }
    val somaInferiores72 = valores.filter { it < 72 }.sum()
    println("Soma dos valores inferiores a 72: $somaInferiores72")
    println("\nValores informados:")
    valores.forEach { println(it) }



}
