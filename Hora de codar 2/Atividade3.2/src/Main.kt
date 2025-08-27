fun main() {
    println("Digite o 1º número: ")
    val valor1 = readLine()?.toIntOrNull()

    println("Digite o 2º número: ")
    val valor2 = readLine()?.toIntOrNull()

    println("Digite o 3º número: ")
    val valor3 = readLine()?.toIntOrNull()


    if (valor1 != null && valor2 != null && valor3 != null && valor1 > valor2 && valor1>valor3)  {
        println("O maior número é: $valor1")
    }
    else if (valor1 != null && valor2 != null && valor3 != null && valor2 > valor1 && valor2>valor3 ) {

        println("O maior número é: $valor2 ")
    }
    else {
        println("O maior número é: $valor3")
    }
}
