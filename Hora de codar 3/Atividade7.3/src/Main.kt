//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val listaMutavel = mutableListOf<Double>()
    for (i in 1..6) {
        var nota: Double?
        do {
            println("Digite a nota $i:")
            nota = readLine()?.toDoubleOrNull()
            if (nota == null || nota < 0.0 || nota > 10.0) {
                println("Nota inválida. Por favor, insira uma nota entre 0 e 10.")
            }
         } while (nota == null || nota < 0.0 || nota > 10.0)
        listaMutavel.add(nota)
    }
    val media = listaMutavel.average()
    println("A média das notas é: %.2f".format(media))
}