//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Informe o primeiro número:")
    val numero1 = readLine()?.toIntOrNull()

    println("Informe o segundo número:")
    val numero2 = readLine()?.toIntOrNull()
    if (numero1 != null && numero2 != null && numero1 > numero2) {
    println("O maior numero é: $numero1")
    }
    else {
        println("O maior número é: $numero2 ")
    }
}