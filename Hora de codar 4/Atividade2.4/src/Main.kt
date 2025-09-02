//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val planetas = listOf("mercurio", "venus", "terra", "Marte", "Jupiter", "Saturno", "Urano", "Netuno")
    println("Digite um planeta")
    val entrada = readLine()!!.trim()
    val busca_planeta = planetas.find { it.equals(entrada, ignoreCase = true) }

    if (busca_planeta!= null) {
        println("Planeta encontrado: $busca_planeta")
    } else {
        println("Planeta no encontrado")
    }
}


