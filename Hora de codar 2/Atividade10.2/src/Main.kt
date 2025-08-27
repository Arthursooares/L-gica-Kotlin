//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {


   println("Escolha um gênero: ")

    println("1. Mulher ")

    println("2. Homem ")

    println("3. Sair  ")


    print("Digite o número da opção: ")
    val opcao = readLine()?.toIntOrNull()


    print("A opção escolhida foi ${opcao}\n")

    when (opcao) {
        1 -> Mulher()
        2 ->Homem()
        3 -> Sair()
    }
}

fun Mulher (){
   println("Digite a sua altura em metros (ex: 1.75)::")
    var Altura = readLine()?.toDoubleOrNull()
    if (Altura != null) {
        val pesoIdeal = (62.1 * Altura) - 44.7
        println("Seu peso ideal é: %2f kg".format(pesoIdeal))
    }
    else {
        println("Digite uma altura válida.")
    }
}

fun Homem(){
println("Digite a sua altura em metros (ex: 1.75):")
    var Altura = readLine()?.toDoubleOrNull()
    if (Altura != null) {
        val pesoIdeal = (72.7 * Altura) - 58
        println("Seu peso ideal é: %2f kg".format(pesoIdeal))
    }
    else {
        println("Digite uma altura válida.")
    }


}

   fun Sair(){
     println("Até mais usuário !")
   }
