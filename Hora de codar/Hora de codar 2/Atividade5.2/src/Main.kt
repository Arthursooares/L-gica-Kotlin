fun main() {
    val valores = mutableListOf<Double>()

    println("Digite 6 valores:")

    for (i in 1..6) {
        print("Valor $i: ")
        val entrada = readLine()?.toDoubleOrNull()
        if (entrada != null) {
            valores.add(entrada)
        } else {
            println("Entrada inválida. Tente novamente.")
            return
        }
    }

    println("\nValores informados:")
    valores.forEach { println(it) }

    val media = valores.average()
    println("\nMédia aritmética: %.2f".format(media))
}
