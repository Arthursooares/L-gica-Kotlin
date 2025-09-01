var totalAprovados= 0

fun main() {

    println("Digite a primeira nota")
    val nota = readLine()!!.toDouble()
    println("Digite a segunda nota")
    val nota2 = readLine()!!.toDouble()
     val media = (nota + nota2) / 2
    if (media >= 9.5) {
        println("Aprovado com média $media")
        totalAprovados++
    } else {
        println("Reprovado com média $media")
    }
    println("Escrever a média de outro aluno? (s/n)")
    val resposta = readLine()!!
    if (resposta == "s") {
        main()
    } else {
        println("Encerrando o programa")
        println("Total de alunos aprovados: $totalAprovados")
    }

}