fun main() {
    val valores = mutableListOf<Double>()

    println("Digite 6 valores:")

        var i = 1
        while (valores.size < 4 ) {
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

    println("\nPrimeiro valor informado: ${valores[0]}")
    println("\nÚltimo valor informado: ${valores[3]}")
    val maior = valores.maxOrNull()
    println("\nO maior valor informado: $maior")


}
