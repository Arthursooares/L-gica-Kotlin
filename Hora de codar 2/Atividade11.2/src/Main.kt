//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    println("1. Adição")
    println("2. Subtração")
    println("3. Divisão")
    println("4. Multiplicação")

    println("Digite o número da operação que deseja executar: ")


    val opcao = readLine()?.toIntOrNull()

    when (opcao) {
        1 -> adicao()
        2 -> subtracao()
        3 -> divisao()
        4 -> multiplicacao()
        else -> println("Operação inválida.")
    }
  println("A opção escolhida foi ${opcao}\n")
}
fun adicao() {
    println("Digite o primeiro número: ")
    val n1 = readLine()?.toDoubleOrNull()

    println("Digite o segundo número: ")
    val n2 = readLine()?.toDoubleOrNull()

    if (n1 != null && n2 != null) {
        val resultado = n1 + n2
        println("Resultado: $resultado")
    }
    else {
        println("Entrada inválida.")
    }

}

fun subtracao() {
    println("Digite o primeiro número: ")
    val n1 = readLine()?.toDoubleOrNull()

    println("Digite o segundo número: ")
    val n2 = readLine()?.toDoubleOrNull()

    if (n1 != null && n2 != null) {
        val resultado = n1 - n2
        println("Resultado: $resultado")
    }
    else {
        println("Entrada inválida.")
    }

}
fun divisao() {
    println("Digite o primeiro número: ")
    val n1 = readLine()?.toDoubleOrNull()

    println("Digite o segundo número: ")
    val n2 = readLine()?.toDoubleOrNull()

    if (n1 != null && n2 != null) {
        if (n2 != 0.0) {
            val resultado = n1 / n2
            println("Resultado: $resultado")
        } else {
            println("Erro: Divisão por zero não é permitida.")
        }
    }
    else {
        println("Entrada inválida.")
    }
}
fun multiplicacao() {
    println("Digite o primeiro número: ")
    val n1 = readLine()?.toDoubleOrNull()

    println("Digite o segundo número: ")
    val n2 = readLine()?.toDoubleOrNull()

    if (n1 != null && n2 != null) {
        val resultado = n1 * n2
        println("Resultado: $resultado")
    }
    else {
        println("Entrada inválida.")
    }
}