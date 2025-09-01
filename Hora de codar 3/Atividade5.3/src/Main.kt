import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("Digite o primeiro número inteiro: ")
    val primeiro = scanner.nextInt()
    print("Digite o segundo número inteiro (maior que o primeiro): ")
    val segundo = scanner.nextInt()

    var soma = 0
    var quantidade = 0

    for (num in primeiro..segundo) {
        soma += num
        quantidade++
    }

    val media = soma.toDouble() / quantidade
    println("A média aritmética dos números entre $primeiro e $segundo é: $media")
}