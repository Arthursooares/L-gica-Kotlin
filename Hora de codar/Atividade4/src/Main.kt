//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

fun main() {
    println("Escolha uma opção:")
    println("1. Triângulo")
    println("2. Quadrado")
    println("3. Losango")
    println("4. Trapézio")
    println("5. Paralelogramo")
    println("6. Retângulo")
    println("7. Círculo")
    println("8. Sair")


    print("Digite o número da opção: ")
    val opcao = readLine()?.toIntOrNull()

    print("A opção escolhida foi ${opcao}\n")

    when (opcao) {
        1 -> Triangulo()
        2 -> Quadrado()
        3 -> Losango()
        4 -> Trapezio()
        5 -> Paralelogramo()
        6 -> Retangulo()
        7 -> Circulo()
        8 -> Sair()
    }
}
fun Triangulo() {
    println("Você escolheu o Triângulo")

    println("Digite a base: ")
    val base = readLine()?.toIntOrNull()

    println("Digite a altura: ")
    val altura = readLine()?.toIntOrNull()
    if (base != null && altura != null) {
        val area = (base * altura) / 2
        println("A área do Triângulo é: $area")
    } else {
        println("Erro: valores inválidos para base ou altura.")
    }


    }
fun Quadrado(){
    println("Você escolheu o Quadrado")

    println("Digite o lado")
    val lado = readLine()?.toIntOrNull()

    println("Digite o outro lado")
    val lado2 = readLine()?.toIntOrNull()

    if (lado != null && lado2 != null){
        val area = (lado*lado2)
        println("A área do Quadrado é: $area")
    }


}

fun Losango (){
    println("Você escolheu o Losango")

    println("Digite a diagonal maior:")
    val diagonal_maior = readLine()?.toIntOrNull()

    println("Digite a diagonal menor:")
    val diagonal_menor = readLine()?.toIntOrNull()

    if (diagonal_maior != null && diagonal_menor != null){
        val area = ((diagonal_maior*diagonal_menor)/2)
        println("A área do Losango é: $area")
    }

}

fun Trapezio(){
    println("Você escolheu o Trapézio")

    println("Digite a base maior:")
    val base_maior = readLine()?.toIntOrNull()

    println("Digite a base menor:")
    val base_menor = readLine()?.toIntOrNull()

    println("Digite a altura:")
    val altura = readLine()?.toIntOrNull()

    if (base_maior != null && base_menor !=null && altura != null) {
        val area = (((base_maior + base_menor) * altura) / 2)
        println("A área do Trapézio é: $area")
    }

}

fun Paralelogramo(){
    println("Você escolheu o Paralelogramo")

    println("Digite a base:")
    val base = readLine()?.toIntOrNull()

    println("Digite a altura:")
    val altura = readLine()?.toIntOrNull()

    if (base != null && altura !=null){
        val area = base * altura
        println("A área do Paralelogramo é: $area")
    }
}

fun Retangulo(){
    println("Você escolheu o Retângulo")

    println("Digite a base:")
    val base = readLine()?.toIntOrNull()

    println("Digite a altura:")
    val altura = readLine()?.toIntOrNull()

    if (base != null && altura !=null){
        val area = base * altura
        println("A área do Retângulo é: $area")
    }
}

fun Circulo(){
    println("Você escolheu o Círculo")

    println("Digite o valor de raio 1 ")
    val raio1 = readLine()?.toIntOrNull()

    println("Digite o valor de raio 2 ")
    val raio2 = readLine()?.toIntOrNull()

    if (raio1 != null && raio2 !=null){
        val area = 3.14 * (raio1*raio2)
        println("A área do Círculo é: $area")
    }


}

fun Sair(){
    println("Obrigado por usar essa aplicação !!")
}








