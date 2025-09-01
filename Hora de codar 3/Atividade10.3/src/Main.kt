fun main() {
    println("Digite um número entre 24 e 42 (ou 'sair' para encerrar):")
    repeat(10) {
        print("Entrada: ")
        val input = readLine()
        if (input == null || input.lowercase() == "sair") {
            println("Encerrando o programa.")
            return
        }
        val numero = input.toIntOrNull()
        if (numero == null) {
            println("Entrada inválida. Por favor, digite um número inteiro.")
        } else if (numero in 24..42) {
            println("O número $numero está dentro do intervalo de 24 a 42.")
        } else {
            println("O número $numero está fora do intervalo de 24 a 42.")
        }
    }
}