fun main() {
    println("Digite o 1º número: ")
    val valor1 = readLine()?.toIntOrNull()

    println("Digite o 2º número: ")
    val valor2 = readLine()?.toIntOrNull()

    println("Digite o 3º número: ")
    val valor3 = readLine()?.toIntOrNull()


    if (valor1 != null && valor2 != null && valor3 != null) {
        if (valor1 != valor2 && valor1 != valor3 && valor2 != valor3) {
            val valores = listOf(valor1, valor2, valor3)
            val doisMaiores = valores.sortedDescending().take(2)
            val soma = doisMaiores[0] + doisMaiores[1]


            println("A soma dos dois maiores valores é: $soma")
        } else {
            println("Os valores devem ser diferentes entre si.")
        }
    } else {
        println("Por favor, insira apenas números válidos.")
    }
}







