fun main() {
    val frutas = mutableListOf("maçã", "banana", "laranja", "uva", "manga")

    println("Lista de compras: $frutas")

    while (frutas.isNotEmpty()) {
        print("Digite o nome de uma fruta para remover: ")
        val frutaEscolhida = readLine()?.lowercase()?.trim()

        if (frutaEscolhida != null && frutas.contains(frutaEscolhida)) {
            frutas.remove(frutaEscolhida)
            println("Fruta foi retirada da lista.")
        } else {
            println("Fruta indisponível no nosso mercado.")
        }

        if (frutas.isEmpty()) {
            println("Lista de compras finalizada.")
        } else {
            println("Frutas restantes: $frutas")
        }
    }
}
