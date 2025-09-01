fun main() {
    print("Informe o primeiro valor: ")
    val valor1 = readLine()!!.toInt()

    var valor2: Int
    do {
        print("Informe o segundo valor (maior que zero): ")
        valor2 = readLine()!!.toInt()
        if (valor2 <= 0) {
            println("Valor inválido! O segundo valor deve ser maior que zero.")
        }
    } while (valor2 <= 0)

    println("Valores informados: $valor1 e $valor2")


}

