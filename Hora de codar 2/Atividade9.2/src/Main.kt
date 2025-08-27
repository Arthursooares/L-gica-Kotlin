//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Digite o ano do seu nascimento: ")
    val entrada = readLine()
    val ano_nascimento = entrada?.toIntOrNull()

    if (ano_nascimento == null) {
        println("Digite um número válido")
    } else  {
        var idade = 2025 - ano_nascimento

        if (idade >=18){
            println("Sua idade é $idade, você pode votar !!")
        }
        else {
            println("Sua idade é $idade, você não pode votar ")
        }
    }


}

