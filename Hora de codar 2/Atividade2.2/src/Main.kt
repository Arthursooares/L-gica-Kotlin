//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Digite um valor: ")
    val valor = readLine()?.toIntOrNull()
    if (valor != null && valor == 0) {
        println("O número é nulo: $valor")
    }
    else if (valor != null && valor<0 ) {

        println("O número é negativo: $valor ")
    }
    else {
        println("O valor é positivo $valor")
    }
}

