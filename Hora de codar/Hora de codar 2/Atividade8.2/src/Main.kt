fun main() {
    val valores = mutableListOf<Double>()
    val numeros = 4

    var i = 0
    while (i < numeros) {
        println("Digite ${i + 1}°números entre (1 e 10):")
        val entrada = readLine()
        val numero = entrada?.toDoubleOrNull()

        if (numero == null || numero <= 0 || numero > 10) {
            println("Entrada inválida ! Digite um número entre (1 e 10):")
        } else {
            valores.add(numero)
            i++
        }
    }
    val media = valores.average()
    println("Média: $media")

    if (media < 5){
    println("Você reprovou no teste ! \uD83D\uDE15")
    }
    else {
        println("Você passou no teste ! \uD83C\uDF89")
    }


}


